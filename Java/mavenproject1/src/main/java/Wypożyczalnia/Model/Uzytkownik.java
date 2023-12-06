package Wypożyczalnia.Model;

public abstract class Uzytkownik {

	protected String imie;
	protected String nazwisko;
	protected String haslo;
	protected String email;
	protected String nazwaUzytkownika;

	public String getNazwaUzytkownika() {
		return this.nazwaUzytkownika;
	}


	public void setNazwaUzytkownika(String nazwaUzytkownika) {
		this.nazwaUzytkownika = nazwaUzytkownika;
	}


	public Uzytkownik(String imie, String nazwisko, String nazwaUzytkownika, String haslo, String email) {
		// TODO - implement Uzytkownik.Uzytkownik
		throw new UnsupportedOperationException();
	}

}