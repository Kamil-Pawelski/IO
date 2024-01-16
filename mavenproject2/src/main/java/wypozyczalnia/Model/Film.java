/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package wypozyczalnia.Model;

public class Film {
    private String tytul;
    private String gatunek;
    private String czasTrwania;
    private String jakosc;
    private double cena;

    public Film(String tytul, String gatunek, String czasTrwania, String jakosc, Double cena) {
        this.tytul = tytul;
        this.gatunek = gatunek;
        this.czasTrwania = czasTrwania;
        this.jakosc = jakosc;
        this.cena = cena;
    }

    public double getCena() {
        return this.cena;
    }

    public String getTytul() {
        return this.tytul;
    }

    public String getCzasTrwania() {
        return this.czasTrwania;
    }

    public String getGatunek() {
        return this.gatunek;
    }

    public String toString() {
        return "Film{tytul='" + this.tytul + "', gatunek='" + this.gatunek + "', czasTrwania='" + this.czasTrwania + "', jakosc='" + this.jakosc + "', cena=" + this.cena + "}";
    }
}