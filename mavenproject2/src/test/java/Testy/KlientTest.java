 
package Testy;

import java.util.stream.Stream;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.ParameterizedTest;
import wypozyczalnia.Dane;

//2.3

@Tag("Entity")
public class KlientTest {
    
    static Dane dane;
    
    @BeforeAll
    public static void setUpClass(){
        dane = new Dane();
    }
    
    static Stream<Integer> intProvider(){
        return Stream.of(0,1,2,3,4);
    }
    
    @ParameterizedTest()
    @MethodSource("intProvider")
    public void testEquals(int numer1){
        System.out.println("equals");
        for(int j = numer1; j < 5; j++){
        if(numer1 == j){
            assertTrue(dane.klienci[numer1].equals(Dane.klienci[j]));
        } else{
            assertFalse(dane.klienci[numer1].equals(Dane.klienci[j]));
        }
        }
    }
    
    @ParameterizedTest()
    @MethodSource("intProvider")
    public void testDaneOsobowe(int numer1){
        System.out.println("daneOsobowe");
        String daneKlienta1 = dane.klienci[numer1].daneOsobowe();      
        String daneKlienta2 = dane.klienciDaneOsobowe[numer1];
        assertEquals(daneKlienta1, daneKlienta2, "True");
    }
}

// public String daneOsobowe(Film film){
//        return imie + " " + nazwisko;
//    }