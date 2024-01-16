/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package wypozyczalnia.Model;

import java.util.ArrayList;
import java.util.Iterator;

public class KontaUzytkownikow {
    private ArrayList<Klient> wszyscyKlienci = new ArrayList();

    public KontaUzytkownikow() {
    }

    public void dodajKlienta(Klient klient) {
        if (klient != null) {
            this.wszyscyKlienci.add(klient);
        }

    }

    public Klient wyszukajKlienta(String nazwaUzytkownika) {
        Iterator var2 = this.wszyscyKlienci.iterator();

        Klient klient;
        do {
            if (!var2.hasNext()) {
                return null;
            }

            klient = (Klient)var2.next();
        } while(!klient.getNazwaUzytkownika().equals(nazwaUzytkownika));

        return klient;
    }
}