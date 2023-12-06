package Wypożyczalnia.Model;

import java.util.*;

public class Klient extends Uzytkownik {

	private Koszyk koszyk;
	private Film historiaWypozyczonychFilmow;
	private Collection<Film> wypozyczoneFilmy;

	/**
	 * 
	 * @param imie
	 * @param Nazwisko
	 * @param nazwaUzytkownika
	 * @param haslo
	 * @param email
	 */
	public Klient(String imie, String Nazwisko, String nazwaUzytkownika, String haslo, String email) {
		// TODO - implement Klient.Klient
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param imie
	 * @param nazwisko
	 * @param nazwaUzytkownika
	 * @param haslo
	 * @param email
	 */
	public void zaaktualizujInformacje(String imie, String nazwisko, String nazwaUzytkownika, String haslo, String email) {
		// TODO - implement Klient.zaaktualizujInformacje
		throw new UnsupportedOperationException();
	}

	public boolean platnoscZaKoszyk() {
		// TODO - implement Klient.platnoscZaKoszyk
		throw new UnsupportedOperationException();
	}

	public ArrayList<Film> getHistoriaWypozyczonychFilmow() {
		return this.historiaWypozyczonychFilmow;
	}

	public ArrayList<Film> getWypozyczoneFilmy() {
		return this.wypozyczoneFilmy;
	}

	public void obejrzyjFilm() {
		// TODO - implement Klient.obejrzyjFilm
		throw new UnsupportedOperationException();
	}

	public String toString() {
		// TODO - implement Klient.toString
		throw new UnsupportedOperationException();
	}


	public boolean wybranieFilmu(Film film) {
		// TODO - implement Klient.wybranieFilmu
		throw new UnsupportedOperationException();
	}

}