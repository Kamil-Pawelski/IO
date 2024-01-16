package Model;

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
                this.stanKonta = 100d;
	}

	public Double getStanKonta() {
		return this.stanKonta;
	}
        
        public void setStanKonta(double stanKonta) {
        this.stanKonta = stanKonta;
        }
        

}