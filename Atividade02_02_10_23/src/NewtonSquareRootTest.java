import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class NewtonSquareRootTest {
    @Test
    public void testCalculateSquareRoot() {
        double epsilon = 1e-5;

        // Teste com um número positivo
        assertEquals(4.0, NewtonSquareRoot.calculateSquareRoot(16, epsilon), epsilon);

        // Teste com zero
        assertEquals(0.0, NewtonSquareRoot.calculateSquareRoot(0, epsilon), epsilon);

        // Teste com um número negativo (deve lançar uma exceção)
        assertThrows(IllegalArgumentException.class, () -> {
            NewtonSquareRoot.calculateSquareRoot(-16, epsilon);
        });
    }
}