package Wypożyczalnia.Model;

import java.util.*;

public class Transakcja {

	private Collection<Film> filmy = new ArrayList<>();
	private double cena;

	public Transakcja() {
		// TODO - implement Transakcja.Transakcja
		throw new UnsupportedOperationException();
	}

	public boolean autoryzujPlatnosc() {
		// TODO - implement Transakcja.autoryzujPlatnosc
		throw new UnsupportedOperationException();
	}

	public boolean wykonajPlatnosc(KartaPlatnicza kartaPlatnicza) {
		// TODO - implement Transakcja.wykonajPlatnosc
		throw new UnsupportedOperationException();
	}


	public void setFilmy(ArrayList<Film> filmy) {
		// TODO - implement Transakcja.setFilmy
		throw new UnsupportedOperationException();
	}

	
	public void setCena(double cena) {
		this.cena = cena;
	}

}