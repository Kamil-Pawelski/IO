package Model;


import java.util.ArrayList;
import java.util.Scanner;

public class Oferta {

	private ArrayList<Film> oferta = new ArrayList<>();
    private Fabryka fabryka;
        
        
	public ArrayList<Film> getOferta() {
        return this.oferta;
        }

	public void dodajFilm(String[] data) {
        if (sprawdzCzyFilmIstnieje(data)) {
            return;
        } 
        
        Film film = fabryka.utworzFilm(data);
        oferta.add(film);
        }

	public void usunFilm() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wybierz metodę usunięcia filmu: 1 - po tytule, 2 - po indeksie");
        int wybor = scanner.nextInt();
        scanner.nextLine(); 
        Film film;
        switch (wybor) {
            case 1: 
                System.out.println("Podaj tytuł filmu do usunięcia:");
                String tytul = scanner.nextLine();
                film = wyszukajFilm(tytul);
                if (film == null) {
                  return;
                }  
                oferta.remove(film);
                System.out.println("Film został usunięty.");
                break;
            case 2: 
                System.out.println("Dostępne filmy:");
                for (int i = 0; i < oferta.size(); i++) {
                    System.out.println(i + ". " + oferta.get(i).toString());
                }
                System.out.println("Podaj indeks filmu do usunięcia (0 - " + (oferta.size() - 1) + "):");
                int index = scanner.nextInt();
               if (index < 0 || index >= oferta.size()) {
               System.out.println("Nieprawidłowy indeks.");
               return; 
               }
               film = oferta.get(index);
               oferta.remove(film);
               System.out.println("Film został usunięty.");
               break;
        }
    }

	
	public Film wyszukajFilm(String tytul) {
        for (Film film : this.oferta) {
            if (film.getTytul().equalsIgnoreCase(tytul)) {
                return film;
            }
        }
        return null;
        }
        
	
	private boolean sprawdzCzyFilmIstnieje(String[] data) {
        for (Film film : oferta) {
            if (czyToTenSamFilm(film, data)) {
                return true;
            }
        }
        return false;
        }

    private boolean czyToTenSamFilm(Film film, String[] data) {
        return film.getTytul().equals(data[0])
                && film.getGatunek().equals(data[1])
                && film.getCzasTrwania().equals(data[2]);
    }

	public Oferta() {
		fabryka = new Fabryka();
	}

}