package Model;

import java.util.Scanner; 
public class Koszyk {

    private Transakcja transakcja;

    public Koszyk() {
        this.transakcja = new Transakcja(); 
    }

    public void dodajFilm(Film film) {

        transakcja.setCena(film.getCena());
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
