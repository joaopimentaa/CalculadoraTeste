import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraTest {

    @Test
    public void testSomar() {
        Calculadora calc = new Calculadora();
        assertEquals(5, calc.somar(2, 3));
    }

    @Test
    public void testSubtrair() {
        Calculadora calc = new Calculadora();
        assertEquals(1, calc.subtrair(3, 2));
    }
}