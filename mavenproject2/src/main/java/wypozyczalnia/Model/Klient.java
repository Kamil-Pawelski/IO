/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package wypozyczalnia.Model;
import java.util.ArrayList;
import java.util.Objects;

public class Klient extends Uzytkownik {
    private ArrayList<Film> wypozyczoneFilmy = new ArrayList();
    private Koszyk koszyk = new Koszyk();
    private ArrayList<Film> historiaWypozyczonychFilmow = new ArrayList();

    public Klient(String imie, String nazwisko, String nazwaUzytkownika, String haslo, String email) {
        super(imie, nazwisko, nazwaUzytkownika, haslo, email);
    }

      public String daneOsobowe(){
        return imie + " " + nazwisko;
    }
    
    public void zaaktualizujInformacje(String imie, String nazwisko, String nazwaUzytkownika, String haslo, String email) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.nazwaUzytkownika = nazwaUzytkownika;
        this.haslo = haslo;
        this.email = email;
    }

    public ArrayList<Film> getHistoriaWypozyczonychFilmow() {
        return this.historiaWypozyczonychFilmow;
    }

    public ArrayList<Film> getWypozyczoneFilmy() {
        return this.wypozyczoneFilmy;
    }

    public String toString() {
        return "Klient: Imię: " + this.imie + ", Nazwisko: " + this.nazwisko + ", Nazwa użytkownika: " + this.nazwaUzytkownika + ", Email: " + this.email;
    }

    public void dodajDoKoszyka(Film film) {
        this.koszyk.dodajFilm(film);
    }

    public boolean pozyczFilm() {
        return this.koszyk.wywolajPlatnosc();
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Klient klient = (Klient) obj;

        return Objects.equals(imie, klient.imie) &&
               Objects.equals(nazwisko, klient.nazwisko) &&
               Objects.equals(nazwaUzytkownika, klient.nazwaUzytkownika) &&
               Objects.equals(email, klient.email) &&
               Objects.equals(haslo, klient.haslo);

    }
    
      @Override
    public int hashCode() {
        return Objects.hash(imie, nazwisko, nazwaUzytkownika, email, haslo);
    }
}