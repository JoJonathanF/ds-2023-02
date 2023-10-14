import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ObservadorTest {

    @Test
    public void testDefinirValor() {
        Observado planilha = new Observado();
        Observador A1 = new Observador("A1", planilha);

        A1.definirValor(10);

        assertEquals(10, A1.getValor());
    }

    @Test
    public void testReavaliar() {
        Observado planilha = new Observado();
        Observador A1 = new Observador("A1", planilha);
        Observador A2 = new Observador("A2", planilha);
        Observador A3 = new Observador("A3", planilha);

        A1.definirValor(10);
        A2.definirValor(20);

        assertEquals(30, A3.getValor());
    }
}