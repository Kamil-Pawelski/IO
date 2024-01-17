/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Testy;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import wypozyczalnia.Dane;

@Tag("Entity")
public class testTransakcja {
    
    static Dane dane;

    
    @BeforeAll
    public static void setUpClass() {
        dane = new Dane();
    }
    

}


//   public boolean wykonajPlatnosc(KartaPlatnicza kartaPlatnicza) {
//        double stanKonta = kartaPlatnicza.getStanKonta();
//        if (stanKonta >= this.cena) {
//            kartaPlatnicza.setStanKonta(kartaPlatnicza.getStanKonta() - this.cena);
//            this.cena = Double.MAX_VALUE;
//            return true;
//        } else {
//            return false;
//        }
//    }