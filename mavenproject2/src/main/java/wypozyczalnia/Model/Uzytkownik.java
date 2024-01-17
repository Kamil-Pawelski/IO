/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package wypozyczalnia.Model;
public abstract class Uzytkownik {
    protected String imie;
    protected String nazwisko;
    protected String haslo;
    protected String email;
    protected String nazwaUzytkownika;

    public String getImie() {
        return this.imie;
    }

    public String getNazwisko() {
        return this.nazwisko;
    }

    public String getHaslo() {
        return this.haslo;
    }

    public String getEmail() {
        return this.email;
    }

    public String getNazwaUzytkownika() {
        return this.nazwaUzytkownika;
    }

    public Uzytkownik(String imie, String nazwisko, String nazwaUzytkownika, String haslo, String email) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.nazwaUzytkownika = nazwaUzytkownika;
        this.haslo = haslo;
        this.email = email;
    }
}