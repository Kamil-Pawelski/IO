package Wypożyczalnia;

import Wypożyczalnia.Model.*;

public class Fabryka {

	
	public Film utworzFilm(String[] data) {
        if (data == null || data.length != 5) {
            throw new IllegalArgumentException("Nieprawidłowa liczba argumentów dla filmu.");
        }
        String tytul = data[0];
        String gatunek = data[1];
        String czasTrwania = data[2];
        String jakosc = data[3];
        double cena = Double.parseDouble(data[4]);

        return new Film(tytul, gatunek, czasTrwania, jakosc, cena);
        }

	
	public Klient utworzKlienta(String[] data) {
        if (data == null || data.length != 5) {
            throw new IllegalArgumentException("Nieprawidłowa liczba argumentów dla klienta.");
        }
        String imie = data[0];
        String nazwisko = data[1];
        String haslo = data[2];
        String email = data[3];
        String nazwaUzytkownika = data[4];

        return new Klient(imie, nazwisko, haslo, email, nazwaUzytkownika);
        }   

	public Fabryka() {
	
	}

}