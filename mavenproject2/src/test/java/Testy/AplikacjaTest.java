
package Testy;

import java.util.NoSuchElementException;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.TestExecutionExceptionHandler;
import wypozyczalnia.Aplikacja;
import wypozyczalnia.Dane;

@TestMethodOrder(OrderAnnotation.class)
@Tag("Entity")
@Tag("Control")
public class AplikacjaTest implements TestExecutionExceptionHandler{
    static Dane dane;
    static Aplikacja instance;

    @Override
    public void handleTestExecutionException(ExtensionContext context, Throwable throwable)
        throws Throwable {
        if (throwable instanceof NoSuchElementException) { }
            else throw throwable; }
        

    @BeforeAll
        static public void SetUp() {
    instance = new Aplikacja();
    dane = new Dane();
    }

@Test
@Order(1)
@ExtendWith(AplikacjaTest.class)
public void testWyszukajKlienta(){
    System.out.println("wyszukajKlienta");
    
}
}