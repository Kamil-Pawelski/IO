package Wypożyczalnia.Model;

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
        return "Film{" +
                "tytul='" + tytul + '\'' +
                ", gatunek='" + gatunek + '\'' +
                ", czasTrwania='" + czasTrwania + '\'' +
                ", jakosc='" + jakosc + '\'' +
                ", cena=" + cena +
                '}';
    }

}
