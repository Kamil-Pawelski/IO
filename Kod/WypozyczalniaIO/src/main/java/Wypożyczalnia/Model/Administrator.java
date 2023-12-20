package Wypożyczalnia.Model;

import java.util.Scanner;

public class Administrator extends Uzytkownik {

	public Klient wyszukajKlienta(KontaUzytkownikow kontaUzytkownikow, String nazwaUzytkownika) {
            return kontaUzytkownikow.wyszukajKlienta(nazwaUzytkownika);
        }

	public void zmienDaneKlienta(KontaUzytkownikow kontaUzytkownikow) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj nazwę użytkownika klienta do zmiany danych:");
        String nazwaKlienta = scanner.nextLine();

        Klient klient = wyszukajKlienta(kontaUzytkownikow, nazwaKlienta);
        if (klient == null) {
            System.out.println("Klient o podanej nazwie użytkownika nie istnieje.");
            return;
        }

        System.out.println("Podaj nowe imię (obecne: " + klient.getImie() + "):");
        String imieKlienta = scanner.nextLine();

        System.out.println("Podaj nowe nazwisko (obecne: " + klient.getNazwisko() + "):");
        String nazwiskoKlienta = scanner.nextLine();

        System.out.println("Podaj nową nazwę użytkownika (obecna: " + klient.getNazwaUzytkownika() + "):");
        String nowaNazwaKlienta = scanner.nextLine();

        System.out.println("Podaj nowe hasło:");
        String hasloKlienta = scanner.nextLine();

        System.out.println("Podaj nowy email:");
        String emailKlienta = scanner.nextLine();

        imieKlienta = imieKlienta.isEmpty() ? klient.getImie() : imieKlienta;
        nazwiskoKlienta = nazwiskoKlienta.isEmpty() ? klient.getNazwisko() : nazwiskoKlienta;
        nowaNazwaKlienta = nowaNazwaKlienta.isEmpty() ? klient.getNazwaUzytkownika() : nowaNazwaKlienta;
        hasloKlienta = hasloKlienta.isEmpty() ? klient.getHaslo() : hasloKlienta;
        emailKlienta = emailKlienta.isEmpty() ? klient.getEmail() : emailKlienta;

        klient.zaaktualizujInformacje(imieKlienta, nazwiskoKlienta, nowaNazwaKlienta, hasloKlienta, emailKlienta);
        System.out.println("Dane klienta zostały zaktualizowane.");
        }

	public Administrator(String imie, String nazwisko, String nazwaUzytkownika, String haslo, String email) {
		 super(imie, nazwisko, haslo, email, nazwaUzytkownika);
	}

}