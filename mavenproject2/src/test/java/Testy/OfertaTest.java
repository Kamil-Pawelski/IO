/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Testy;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import  wypozyczalnia.Dane;
import org.junit.jupiter.api.extension.TestExecutionExceptionHandler;
import wypozyczalnia.Model.Oferta;

@TestMethodOrder(OrderAnnotation.class)
@Tag("Entity")
@Tag("Control")
public class OfertaTest implements TestExecutionExceptionHandler {
    
     static Dane dane;
     static Oferta instance;
     
    @BeforeAll
    public static void setUpClass() {
        dane = new Dane();
        instance = new Oferta();
    }
  
    
 //2.4   
@ParameterizedTest
@CsvSource({"0,1","2,3","4,5"})
public void testWyszukajFilm(int numer1, int numer2) {
    
     System.out.println("testWyszukajFilm");

     assertEquals(dane.filmy[numer1], dane.oferta.wyszukajFilm(dane.tytuly[numer1]));
     assertEquals(dane.filmy[numer2], dane.oferta.wyszukajFilm(dane.tytuly[numer2]));
}

//2.6
@Test
@Order(1)
@ExtendWith(OfertaTest.class)
public void testDodajFilm(){
    System.out.println("dodajFilm");
    int initialSize = instance.getOferta().size();
    for(int i = 0; i < 6; i++){
        instance.dodajFilm(dane.filmData[i]);  
    }
    int finalSize = instance.getOferta().size();
   assertEquals(initialSize + 6, finalSize, "Dodawania prawidłowe");
     instance.dodajFilm(dane.zlyFilm);
} 

   @Override 
    public void handleTestExecutionException(ExtensionContext context, Throwable throwable) throws Throwable {
        if (throwable instanceof IllegalArgumentException) {
        } else {
            throw throwable;
        }
    }
    
    @Test
    @Order(2)
    @ExtendWith(OfertaTest.class)
    public void testSprawdzCzyFilmIstnieje(){
        System.out.println("sprawdzCzyFilmIstnieje");
        for(int i = 0; i < 6; i++){
            assertEquals(instance.sprawdzCzyFilmIstnieje(dane.filmData[i]), true); 
        instance.sprawdzCzyFilmIstnieje(dane.zlyFilm);
    }
    }
    
    @Test
    @Tag("FilmU")
    @Order(3)
    public void TestUsunFilmTytul(){
        System.out.println("usunFilmTytul");
        int initialSize = instance.getOferta().size();
        for(int i = 0; i < 6; i++){
        instance.usunFilmTytul(dane.tytuly[i]);  
    }
    int finalSize = instance.getOferta().size();
    assertEquals(initialSize -  6, finalSize, "Dodawania prawidłowe");
    }
    
}


//public void usunFilmTytul(String tytul) {
//        
//                Film film;
//                System.out.println("Podaj tytuł filmu do usunięcia:");
//                film = this.wyszukajFilm(tytul);
//                if (film == null) {
//                    return;
//                }
//                this.oferta.remove(film);
//                System.out.println("Film został usunięty.");
//
//    }
