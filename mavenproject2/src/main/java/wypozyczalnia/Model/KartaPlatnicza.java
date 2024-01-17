/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package wypozyczalnia.Model;
public class KartaPlatnicza {
    private String numerKarty;
    private String dataWaznosci;
    private String daneOsobowe;
    private String kodCVV;
    private Double stanKonta;

    public KartaPlatnicza(String numerKarty, String dataWaznosci, String daneOsobowe, String kodCVV) {
        this.numerKarty = numerKarty;
        this.dataWaznosci = dataWaznosci;
        this.daneOsobowe = daneOsobowe;
        this.kodCVV = kodCVV;
        this.stanKonta = 100.0;
    }

    public Double getStanKonta() {
        return this.stanKonta;
    }

    public void setStanKonta(double stanKonta) {
        this.stanKonta = stanKonta;
    }
}