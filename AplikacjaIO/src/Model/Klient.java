package Model;

import java.util.ArrayList;

public class Klient extends Uzytkownik {

    private ArrayList<Film> wypozyczoneFilmy;
    private Koszyk koszyk;
    private ArrayList<Film> historiaWypozyczonychFilmow;

    public Klient(String imie, String nazwisko, String nazwaUzytkownika, String haslo, String email) {
        super(imie, nazwisko, nazwaUzytkownika, haslo, email);
        this.wypozyczoneFilmy = new ArrayList<>();
        this.historiaWypozyczonychFilmow = new ArrayList<>();
        this.koszyk = new Koszyk();
    }

    public void zaaktualizujInformacje(String imie, String nazwisko, String nazwaUzytkownika, String haslo, String email) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.nazwaUzytkownika = nazwaUzytkownika;
        this.haslo = haslo;
        this.email = email;
    }


    public ArrayList<Film> getHistoriaWypozyczonychFilmow() {
        return historiaWypozyczonychFilmow;
    }

    public ArrayList<Film> getWypozyczoneFilmy() {
        return wypozyczoneFilmy;
    }

    @Override
    public String toString() {
        return "Klient: " +
               "Imię: " + this.imie + ", " +
               "Nazwisko: " + this.nazwisko + ", " +
               "Nazwa użytkownika: " + this.nazwaUzytkownika + ", " +
               "Email: " + this.email;    
    }


    public void dodajDoKoszyka(Film film) {
        koszyk.dodajFilm(film);
    }

    public boolean pozyczFilm(){
    return koszyk.wywolajPlatnosc();
    }
}
