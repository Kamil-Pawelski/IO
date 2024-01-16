package Model;


public class Transakcja {

    private double cena;

    public Transakcja() {
        this.cena = Double.MAX_VALUE;
    }

    public boolean wykonajPlatnosc(KartaPlatnicza kartaPlatnicza) {
        double stanKonta = kartaPlatnicza.getStanKonta();
        if (stanKonta >= this.cena) {
            kartaPlatnicza.setStanKonta(kartaPlatnicza.getStanKonta() - this.cena); 
            this.cena = Double.MAX_VALUE;
            return true;
        }
        return false;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

}