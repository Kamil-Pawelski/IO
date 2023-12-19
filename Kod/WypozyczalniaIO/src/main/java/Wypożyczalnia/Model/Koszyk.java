package Wypożyczalnia.Model;

import java.util.Scanner; 
public class Koszyk {

    private Film filmWKoszyku;
    private Transakcja transakcja;

    public Koszyk() {
        this.transakcja = new Transakcja(); 
    }

    public void dodajFilm(Film film) {
        this.filmWKoszyku = film; 
        transakcja.setCena(film.getCena());
    }

    public void usunFilm(Film film) {
        if(this.filmWKoszyku != null && this.filmWKoszyku.equals(film)) {
            this.filmWKoszyku = null; 
        }
    }

    public boolean wywolajPlatnosc() {
        KartaPlatnicza karta = podajDaneKarty();   
        return transakcja.wykonajPlatnosc(karta);     
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
