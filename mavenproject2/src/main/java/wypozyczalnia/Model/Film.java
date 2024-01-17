/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template

 */
package wypozyczalnia.Model;
import java.util.Objects;

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
    @Override
    public String toString() {
        return "Film{tytul='" + this.tytul + "', gatunek='" + this.gatunek + "', czasTrwania='" + this.czasTrwania + "', jakosc='" + this.jakosc + "', cena=" + this.cena + "}";
    }
    @Override
      public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Film film = (Film) obj;
        return Double.compare(film.cena, cena) == 0 &&
                tytul.equals(film.tytul) &&
                gatunek.equals(film.gatunek) &&
                czasTrwania.equals(film.czasTrwania) &&
                jakosc.equals(film.jakosc);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tytul, gatunek, czasTrwania, jakosc, cena);
    }
}