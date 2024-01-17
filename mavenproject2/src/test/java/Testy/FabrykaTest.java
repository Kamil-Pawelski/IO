package Testy;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.TestExecutionExceptionHandler;
import  wypozyczalnia.Dane;
import  wypozyczalnia.Fabryka;
import  wypozyczalnia.Model.Klient;

//2.2

@Tag("Entity")
@Tag("Control")
public class FabrykaTest implements TestExecutionExceptionHandler {

    Dane dane;
    @BeforeEach
    public void setUp(){
        dane = new Dane();
    }
    
    @Test
    @ExtendWith(FabrykaTest.class)
    public void testUtworzKlienta()
    {
        System.out.println("utworzKlienta");
        Fabryka fabryka = new Fabryka();
        for(int i = 0; i < 5; i++){
              Klient klient = fabryka.utworzKlienta(dane.daneKlienta[i]);
              assertEquals(dane.klienci[i], klient);
        }
        fabryka.utworzKlienta(dane.daneKlienta[1]);
    }
    
    @Override 
    public void handleTestExecutionException(ExtensionContext context, Throwable throwable)
        throws Throwable {
        if (throwable instanceof IllegalArgumentException) { }
            else throw throwable;
        }
}
