import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ObservadoTest {

    @Test
    public void testAdicionarObservador() {
        Observado planilha = new Observado();
        Observador A1 = new Observador("A1", planilha);

        planilha.adicionarObservador(A1);

        assertTrue(planilha.getObservadores().contains(A1));
    }

    @Test
    public void testNotificarObservadores() {
        Observado planilha = new Observado();
        Observador A1 = new Observador("A1", planilha);
        Observador A2 = new Observador("A2", planilha);
        Observador A3 = new Observador("A3", planilha);

        planilha.adicionarObservador(A1);
        planilha.adicionarObservador(A2);
        planilha.adicionarObservador(A3);

        A1.definirValor(10);

        assertEquals(10, A2.getValor());
        assertEquals(10, A3.getValor());
    }
}