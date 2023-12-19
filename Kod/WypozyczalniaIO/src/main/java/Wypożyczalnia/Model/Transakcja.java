package Wypożyczalnia.Model;


public class Transakcja {

    private double cena;

    public Transakcja() {
        this.cena = Double.MAX_VALUE;
    }

    public boolean wykonajPlatnosc(KartaPlatnicza kartaPlatnicza) {
        if (kartaPlatnicza.getStanKonta() >= this.cena) {
            kartaPlatnicza.setStanKonta(kartaPlatnicza.getStanKonta() - this.cena); 
            this.setCena(Double.MAX_VALUE); 
            return true;
        }
        return false;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

}