package wypozyczalnia;


import java.util.Arrays;
import  wypozyczalnia.Model.Film;
import  wypozyczalnia.Model.Klient;
import wypozyczalnia.Model.Koszyk;
import wypozyczalnia.Model.Oferta;

public class Dane {
    
    public String daneKlienta[][] = new String[][]{
    {"Jacek", "Kowalski", "haslo123", "jacek.kowalski@wp.pl", "jacekkowalski7"}, 
    {"Jan", "Nowak", "nowak123", "jan.nowak@gmail.com", "jannowak"},
    {"Anna", "Kowalczyk", "anna456", "anna.kowalczyk@yahoo.com", "annakowalczyk"},
    {"Piotr", "Lis", "lis789", "piotr.lis@hotmail.com", "piotrlis"},
    {"Katarzyna", "Mazur", "kasia321", "katarzyna.mazur@gmail.com", "katarzynamazur"}
};

public static Klient klienci[] = {
    new Klient("Jacek", "Kowalski", "jacekkowalski7" ,"haslo123", "jacek.kowalski@wp.pl"),
    new Klient("Jan", "Nowak", "jannowak", "nowak123", "jan.nowak@gmail.com"),
    new Klient("Anna", "Kowalczyk", "annakowalczyk", "anna456", "anna.kowalczyk@yahoo.com"),
    new Klient("Piotr", "Lis", "piotrlis", "lis789", "piotr.lis@hotmail.com"),
    new Klient("Katarzyna", "Mazur", "katarzynamazur", "kasia321", "katarzyna.mazur@gmail.com")
};

 public String klienciDaneOsobowe[] = new String[] {"Jacek Kowalski", "Jan Nowak", "Anna Kowalczyk", "Piotr Lis", "Katarzyna Mazur" }; 

 public String filmData[][] = new String[][]{
            {"Film A", "Komedia", "120", "HD", "10.50"},
            {"Film B", "Akcja", "90", "4K", "15.99"},
            {"Film C", "Dramat", "140", "HD", "12.00"},
            {"Film D", "Sci-Fi", "110", "4K", "16.75"},
            {"Film E", "Fantasy", "170", "2K", "20.00"},
            {"Film F", "Dramat", "80", "4K", "13.30"},
        };
 
 public String tytuly[] = new String[]{
     "Film A", "Film B", "Film C", "Film D", "Film E", "Film F"
 };
 public String zlyFilm[] = new String[] {"Film F", "Dramat"};
         
   public Film filmy[] = new Film[]{
        new Film("Film A", "Komedia", "120", "HD", 10.50),
        new Film("Film B", "Akcja", "90", "4K", 15.99),
        new Film("Film C", "Dramat", "140", "HD", 12.00),
        new Film("Film D", "Sci-Fi", "110", "4K", 16.75),
        new Film("Film E", "Fantasy", "170", "2K", 20.00),
        new Film("Film F", "Dramat", "80", "4K", 13.30)
    };
   
 public double oczekiwanyKoszt = Arrays.stream(filmy)
        .mapToDouble(Film::getCena)
        .sum();

 public Oferta oferta;

public Koszyk koszyk;
public Dane() {
        oferta = new Oferta();
        for (String[] film : filmData) {
                oferta.dodajFilm(film);
               
        }
        koszyk = new Koszyk();
        for (Film film : filmy) {
            koszyk.dodajFilm(film);  
        }     
    }
 
}
