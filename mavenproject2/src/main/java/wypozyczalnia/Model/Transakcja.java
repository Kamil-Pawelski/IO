/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package wypozyczalnia.Model;

public class Transakcja {
    private double cena = Double.MAX_VALUE;

    public Transakcja() {
    }

    public boolean wykonajPlatnosc(KartaPlatnicza kartaPlatnicza) {
        double stanKonta = kartaPlatnicza.getStanKonta();
        if (stanKonta >= this.cena) {
            kartaPlatnicza.setStanKonta(kartaPlatnicza.getStanKonta() - this.cena);
            this.cena = Double.MAX_VALUE;
            return true;
        } else {
            return false;
        }
    }

    public void setCena(double cena) {
        this.cena = cena;
    }
}
