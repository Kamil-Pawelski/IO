package Wypożyczalnia.Model;

public class Film {

	private String tytul;
	private String gatunek;
	private String czasTrwania;
	private String jakosc;
	private double cena;

	/**
	 * 
	 * @param tytul
	 * @param gatunek
	 * @param czasTrwania
	 * @param jakosc
	 * @param cena
	 */
	public Film(String tytul, String gatunek, String czasTrwania, String jakosc, Double cena) {
		// TODO - implement Film.Film
		throw new UnsupportedOperationException();
	}

	public double getCena() {
		return this.cena;
	}

	public String getTytul() {
		return this.tytul;
	}

	public String toString() {
		// TODO - implement Film.toString
                //override
		throw new UnsupportedOperationException();
	}

}