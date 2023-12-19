package Wypożyczalnia.Model;

import java.util.ArrayList;
import java.util.Scanner;

public class Oferta {

	private ArrayList<Film> oferta = new ArrayList<>();
        private Fabryka fabryka;
	 public ArrayList<Film> getOferta() {
        return this.oferta;
        }

	public void dodajFilm(String[] data) {
        if (!sprawdzCzyFilmIstnieje(data)) {
            Film film = fabryka.utworzFilm(data);
            oferta.add(film);
        } else {
            System.out.println("Film o podanym tytule już istnieje w ofercie.");
        }
        }

	public void usunFilm() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wybierz metodę usunięcia filmu: 1 - po tytule, 2 - po indeksie");
        int wybor = scanner.nextInt();
        scanner.nextLine(); // Odczytaj nową linię po liczbie całkowitej
        Film filmDoUsuniecia;
        switch (wybor) {
            case 1: // Usunięcie filmu po tytule
                System.out.println("Podaj tytuł filmu do usunięcia:");
                String tytul = scanner.nextLine();
                filmDoUsuniecia = wyszukajFilm(tytul);
                if (filmDoUsuniecia != null) {
                    oferta.remove(filmDoUsuniecia);
                    System.out.println("Film został usunięty.");
                } else {
                    System.out.println("Nie znaleziono filmu o podanym tytule.");
                }
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
               filmDoUsuniecia = oferta.get(index);
               oferta.remove(filmDoUsuniecia);
               System.out.println("Film został usunięty.");
               break;
            default:
                System.out.println("Nieprawidłowy wybór.");
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

	public Film podajDaneFilmu() {
		// TODO - implement Oferta.podajDaneFilmu
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param data
	 */
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
		// TODO - implement Oferta.Oferta
		throw new UnsupportedOperationException();
	}

	public void wybierzFilmDoUsuniecia() {
		// TODO - implement Oferta.wybierzFilmDoUsuniecia
		throw new UnsupportedOperationException();
	}

}