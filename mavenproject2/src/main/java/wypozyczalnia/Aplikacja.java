/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package wypozyczalnia;



import wypozyczalnia.Model.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Aplikacja {

    private Oferta oferta;
    private KontaUzytkownikow kontaUzytkownikow;
    private Film wybranyFilm;
    private Klient klient;
    private Administrator admin;

    public Aplikacja() {
        this.oferta = new Oferta();
        this.admin = new Administrator("AdminImie", "AdminNazwisko", "admin", "adminPassword", "admin@example.com");
        this.kontaUzytkownikow = new KontaUzytkownikow();
        this.wybranyFilm = null;

    }

    public static void main(String[] args) {
        Aplikacja aplikacja = new Aplikacja();
        Scanner scanner = new Scanner(System.in);
        String[][] klientData = {
            {"Jan", "Kowalski", "haslo123", "jan@example.com", "jankowalski"},
            {"Anna", "Nowak", "haslo321", "anna@example.com", "annanowak"},
            {"Piotr", "Zalewski", "qwerty", "piotr@example.com", "piotrzalewski"}
        };
         Fabryka fabryka = new Fabryka();
        for (String[] klient : klientData) {
            Klient nowyKlient = fabryka.utworzKlienta(klient);
            aplikacja.kontaUzytkownikow.dodajKlienta(nowyKlient);
        }

        String[][] filmData = {
            {"Film A", "Komedia", "120", "HD", "10.50"},
            {"Film B", "Akcja", "90", "4K", "15.99"},
            {"Film C", "Dramat", "140", "HD", "12.00"},
            {"Film D", "Sci-Fi", "110", "4K", "16.75"},
            {"Film E", "Dokumentalny", "60", "HD", "8.30"}
        };

        for (String[] film : filmData) {          
            aplikacja.oferta.dodajFilm(film);
        }
        
        System.out.println("Podaj nazwę użytkownika:");
        String nazwaUzytkownika = scanner.nextLine();

        System.out.println("Podaj hasło:");
        String haslo = scanner.nextLine();

        String konto = aplikacja.logowanie(nazwaUzytkownika, haslo);

        switch (konto) {
            case "admin":
                aplikacja.adminMenu();

                break;
            case "klient":
                aplikacja.klientMenu();
                break;
            default:
                System.out.println("Logowanie się nie powiodło. Złe dane.");
                break;
        }
    }

    public String logowanie(String nazwaUzytkownika, String haslo) {

        if ("admin".equals(nazwaUzytkownika) && this.admin.getHaslo().equals(haslo)) {
            return "admin";
        } else {
            Klient klient2 = this.kontaUzytkownikow.wyszukajKlienta(nazwaUzytkownika);
            if (klient2 != null && klient2.getHaslo().equals(haslo)) {
                this.klient = klient2;
                return "klient";
            }
        }
        return "nieudane";
    }
    
      public Klient wyszukajKlienta(String nazwaUzytkownika) {
        Iterator var2 = this.kontaUzytkownikow.wszyscyKlienci.iterator();

        Klient klienT;
        do {
            if (!var2.hasNext()) {
                throw new NoSuchElementException("Klient o nazwie użytkownika '" + nazwaUzytkownika + "' nie został znaleziony.");
            }

            klienT = (Klient)var2.next();
        } while(!klienT.getNazwaUzytkownika().equals(nazwaUzytkownika));

        return klienT;
    }


            
         
    public void adminMenu() {
        Scanner scanner = new Scanner(System.in);
        int wybor;
        do {
            System.out.println("Menu Administratora:");
            System.out.println("1. Zmień Ofertę");
            System.out.println("2. Zmień dane klienta");
            System.out.println("3. Zakończ");
            wybor = scanner.nextInt();
            scanner.nextLine();
            switch (wybor) {
                case 1:
                    zmienOferte();
                    break;
                case 2:
                    admin.zmienDaneKlienta(kontaUzytkownikow);
                    break;
                default:
                    System.out.println("Brak opcji");
                    break;
            }
        } while (wybor != 3);
    }

    public void klientMenu() {
        Scanner scanner = new Scanner(System.in);
        int wybor;
        do {
            System.out.println("Menu Klienta:");
            System.out.println("1. Pożycz film");
            System.out.println("2. Wyświetl wypożyczone filmy");
            System.out.println("3. Wyświetl historię");
            System.out.println("4. Zakończ");

            System.out.print("Wybierz opcję: ");
            wybor = scanner.nextInt();
            scanner.nextLine();
            switch (wybor) {
                case 1:
                    wybranyFilm = przegladajOferte();
                    klient.dodajDoKoszyka(wybranyFilm);
                    if (wybranyFilm != null) {
                        wypozyczFilm(wybranyFilm);
                    }

                    
                    break;
                case 2:
                    System.out.println("Wypożyczone filmy:");
                    for (Film film : klient.getWypozyczoneFilmy()) {
                        System.out.println(film.getTytul());
                    }
                    break;
                case 3:
                    System.out.println("Historia wypożyczeń:");
                    for (Film film : klient.getHistoriaWypozyczonychFilmow()) {
                        System.out.println(film.getTytul());
                    }
                    break;
                case 4:
                    break;

            }
        } while (wybor != 4);

    }

    
    
    public Film przegladajOferte() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wybierz opcję:");
        System.out.println("1. Szukaj filmu po tytule");
        System.out.println("2. Wyświetl listę filmów");

        int wybor = scanner.nextInt();
        scanner.nextLine();

        Film film = null;
        if (wybor == 1) {
            System.out.println("Wpisz tytuł filmu:");
            String tytul = scanner.nextLine();
            film = oferta.wyszukajFilm(tytul);
            if (film == null) {
                return null;
            }


        } else if (wybor == 2) {
            ArrayList<Film> filmy = oferta.getOferta();
            System.out.println(filmy.size());
            film = wybierzFilm(filmy);
            if (film == null) {
                return null;
            }
        }
        return film;
    }

    public Film wybierzFilm(ArrayList<Film> listaFilmow) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < listaFilmow.size(); i++) {
            System.out.println((i + 1) + ". " + listaFilmow.get(i).getTytul());
        }
        System.out.println("Wybierz film po numerze:");
        int numerFilmu = scanner.nextInt();
        if (numerFilmu < 0 && numerFilmu > listaFilmow.size() - 1) {
            return null;
        }
        return listaFilmow.get(numerFilmu - 1);
    }

    public void wypozyczFilm(Film film) {
        boolean czyPrawidlowo = klient.pozyczFilm();
        
        if(czyPrawidlowo == true){
            ArrayList<Film> filmyKlienta = klient.getWypozyczoneFilmy();
            filmyKlienta.add(film);
        }
    }
    public void zmienOferte() {
        System.out.println("1. Dodaj film.\n2. Usuń film.");
        Scanner scanner = new Scanner(System.in);
        int wybor = scanner.nextInt();
        scanner.nextLine();
        switch(wybor){
            case 1:
                System.out.println("Podaj tytuł filmu:");
                String tytul = scanner.nextLine();
                System.out.println("Podaj gatunek filmu:");
                String gatunek = scanner.nextLine();
                System.out.println("Podaj czas trwania filmu:");
                String czasTrwania = scanner.nextLine();
                System.out.println("Podaj jakość filmu:");
                String jakosc = scanner.nextLine();
                System.out.println("Podaj cenę filmu:");
                String cena = scanner.nextLine();

                String[] data = new String[] {tytul, gatunek, czasTrwania, jakosc, cena};
                oferta.dodajFilm(data);
                break;
            case 2:
                oferta.usunFilm();
                break;

        }

    }

}

