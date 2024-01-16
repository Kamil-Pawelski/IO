package Model;

import java.util.ArrayList;

public class KontaUzytkownikow {

    private ArrayList<Klient> wszyscyKlienci = new ArrayList<>();;

    public KontaUzytkownikow() {

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

}
