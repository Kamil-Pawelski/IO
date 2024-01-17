/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package wypozyczalnia;

import  wypozyczalnia.Model.*;
public class Fabryka {
    public Film utworzFilm(String[] data) {
        if (data != null && data.length == 5) {
            String tytul = data[0];
            String gatunek = data[1];
            String czasTrwania = data[2];
            String jakosc = data[3];
            double cena = Double.parseDouble(data[4]);
            return new Film(tytul, gatunek, czasTrwania, jakosc, cena);
        } else {
            throw new IllegalArgumentException("Nieprawidłowa liczba argumentów dla filmu.");
        }
    }

    public Klient utworzKlienta(String[] data) {
        if (data != null && data.length == 5) {
            String imie = data[0];
            String nazwisko = data[1];
            String haslo = data[2];
            String email = data[3];
            String nazwaUzytkownika = data[4];
            return new Klient(imie, nazwisko, nazwaUzytkownika, haslo, email);
        } else {
            throw new IllegalArgumentException("Nieprawidłowa liczba argumentów dla klienta.");
        }
    }

    public Fabryka() {
    }
}
