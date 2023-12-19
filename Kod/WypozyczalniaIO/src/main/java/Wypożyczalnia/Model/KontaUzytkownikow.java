package Wypożyczalnia.Model;

import java.util.ArrayList;

public class KontaUzytkownikow {

    private ArrayList<Klient> wszyscyKlienci;
    private Administrator administrator;

    public KontaUzytkownikow(Administrator administrator) {
        this.administrator = administrator;
        this.wszyscyKlienci = new ArrayList<>();
    }

    public void dodajKlienta(Klient klient) {
        if (klient != null) {
            this.wszyscyKlienci.add(klient);
        }
    }

    public Klient wyszukajKlienta(String nazwaUzytkownika) {
        for (Klient klient : this.wszyscyKlienci) {
            if (klient.getNazwaUzytkownika().equals(nazwaUzytkownika)) {
                return klient;
            }
        }
        return null;
    }

    public ArrayList<Klient> getWszyscyKlienci() {
        return new ArrayList<>(this.wszyscyKlienci);
    }

    public Administrator getAdministrator() {
        return this.administrator;
    }
}
