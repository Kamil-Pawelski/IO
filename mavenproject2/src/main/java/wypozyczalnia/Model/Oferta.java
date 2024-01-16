/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package wypozyczalnia.Model;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import wypozyczalnia.Fabryka;
public class Oferta {
    private ArrayList<Film> oferta = new ArrayList();
    private Fabryka fabryka = new Fabryka();

    public ArrayList<Film> getOferta() {
        return this.oferta;
    }

    public void dodajFilm(String[] data) {
        if (!this.sprawdzCzyFilmIstnieje(data)) {
            Film film = this.fabryka.utworzFilm(data);
            this.oferta.add(film);
        }
    }

    public void usunFilm() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wybierz metodę usunięcia filmu: 1 - po tytule, 2 - po indeksie");
        int wybor = scanner.nextInt();
        scanner.nextLine();
        Film film;
        switch (wybor) {
            case 1:
                System.out.println("Podaj tytuł filmu do usunięcia:");
                String tytul = scanner.nextLine();
                film = this.wyszukajFilm(tytul);
                if (film == null) {
                    return;
                }

                this.oferta.remove(film);
                System.out.println("Film został usunięty.");
                break;
            case 2:
                System.out.println("Dostępne filmy:");
                int index = 0;

                while(true) {
                    if (index >= this.oferta.size()) {
                        PrintStream var10000 = System.out;
                        int var10001 = this.oferta.size();
                        var10000.println("Podaj indeks filmu do usunięcia (0 - " + (var10001 - 1) + "):");
                        index = scanner.nextInt();
                        if (index < 0 || index >= this.oferta.size()) {
                            System.out.println("Nieprawidłowy indeks.");
                            return;
                        }

                        film = (Film)this.oferta.get(index);
                        this.oferta.remove(film);
                        System.out.println("Film został usunięty.");
                        break;
                    }

                    System.out.println("" + index + ". " + ((Film)this.oferta.get(index)).toString());
                    ++index;
                }
        }

    }

    public Film wyszukajFilm(String tytul) {
        Iterator var2 = this.oferta.iterator();

        Film film;
        do {
            if (!var2.hasNext()) {
                return null;
            }

            film = (Film)var2.next();
        } while(!film.getTytul().equalsIgnoreCase(tytul));

        return film;
    }

    private boolean sprawdzCzyFilmIstnieje(String[] data) {
        Iterator var2 = this.oferta.iterator();

        Film film;
        do {
            if (!var2.hasNext()) {
                return false;
            }

            film = (Film)var2.next();
        } while(!this.czyToTenSamFilm(film, data));

        return true;
    }

    private boolean czyToTenSamFilm(Film film, String[] data) {
        return film.getTytul().equals(data[0]) && film.getGatunek().equals(data[1]) && film.getCzasTrwania().equals(data[2]);
    }

    public Oferta() {
    }
}