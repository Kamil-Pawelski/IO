package Model;

public abstract class Uzytkownik {

	protected String imie;
	protected String nazwisko;
	protected String haslo;
	protected String email;
	protected String nazwaUzytkownika;

	public String getImie() {
            return imie;
        }

        public String getNazwisko() {
            return nazwisko;
        }

        public String getHaslo() {
            return haslo;
        }

        public String getEmail() {
            return email;
        }

        public String getNazwaUzytkownika() {
            return nazwaUzytkownika;
        }



	public Uzytkownik(String imie, String nazwisko, String nazwaUzytkownika, String haslo, String email) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.nazwaUzytkownika = nazwaUzytkownika;
        this.haslo = haslo;
        this.email = email;
        }


}