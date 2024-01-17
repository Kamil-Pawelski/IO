/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Testy;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import static org.junit.jupiter.params.provider.Arguments.arguments;
import org.junit.jupiter.params.provider.MethodSource;
import wypozyczalnia.Dane;
import wypozyczalnia.Model.Film;
import wypozyczalnia.Model.Koszyk;

@Tag("Entity") 
@TestMethodOrder(OrderAnnotation.class)
public class KoszykTest {
    static Dane dane;
    static Koszyk instances[];
    static int numer_koszyku;
    public KoszykTest() {
    }
    
   @BeforeAll
    public static void SetUp() {
    instances = new Koszyk[2];
    dane = new Dane();
    instances[0] =  new Koszyk();
    instances[1] =  new Koszyk();
    numer_koszyku = 0;
        
 }
@ParameterizedTest()
@MethodSource("provideArguments")
@Order(1)
public void testDodajFilm(List<List<Film>>filmy){
    System.out.println("dodajZakup");
    int initialSize = instances[numer_koszyku].getFilmy().size();
    for(List<Film> lista : filmy){
        for(Film film: lista){
            instances[numer_koszyku].dodajFilm(film);
            int ktory = instances[numer_koszyku].getFilmy().size() - 1;
            Film film1 = instances[numer_koszyku].getFilmy().get(ktory);
            assertSame(film, film1);
        }
        assertEquals(initialSize + lista.size(), instances[numer_koszyku].getFilmy().size());
    }
}

@Test
@Order(2)
public void testKosztWypozyczenia(){
System.out.println("kosztWypozyczeniaFilmu");

for(int i = 0; i < 2; i++){
    assertEquals(dane.oczekiwanyKoszt, dane.koszyk.kosztWypozyczenia());
}
}
    
    
    static public Stream<Arguments> provideArguments() {
return Stream.of(arguments(Arrays.asList(
Arrays.asList(
        new Film("Film A", "Komedia", "120", "HD", 10.50),
        new Film("Film B", "Akcja", "90", "4K", 15.99),
        new Film("Film C", "Dramat", "140", "HD", 12.00),
        new Film("Film D", "Sci-Fi", "110", "4K", 16.75),
        new Film("Film E", "Fantasy", "170", "2K", 20.00),
        new Film("Film F", "Dramat", "80", "4K", 13.30)
))));
}
}

