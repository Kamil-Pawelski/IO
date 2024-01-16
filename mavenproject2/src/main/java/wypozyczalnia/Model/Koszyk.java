/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package wypozyczalnia.Model;

import java.util.Scanner;

public class Koszyk {
    private Transakcja transakcja = new Transakcja();

    public Koszyk() {
    }

    public void dodajFilm(Film film) {
        this.transakcja.setCena(film.getCena());
    }

    public boolean wywolajPlatnosc() {
        KartaPlatnicza karta = this.podajDaneKarty();
        return this.transakcja.wykonajPlatnosc(karta);
    }

    public KartaPlatnicza podajDaneKarty() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj numer karty:");
        String numerKarty = scanner.nextLine();
        System.out.println("Podaj datę ważności:");
        String dataWaznosci = scanner.nextLine();
        System.out.println("Podaj dane osobowe:");
        String daneOsobowe = scanner.nextLine();
        System.out.println("Podaj kod CVV:");
        String kodCVV = scanner.nextLine();
        return new KartaPlatnicza(numerKarty, dataWaznosci, daneOsobowe, kodCVV);
    }
}
