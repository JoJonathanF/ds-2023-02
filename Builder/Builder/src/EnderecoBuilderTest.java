import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EnderecoBuilderTest {

    @Test
    public void testEnderecoBuilder() {
        Endereco endereco = new EnderecoBuilder()
                .setRua("Avenida Principal")
                .setSetor("Setor Exemplo")
                .setNumero("69")
                .setCidade("Cidade Exemplo")
                .setEstado("Estado Exemplo")
                .setCep("12345-678")
                .setBloco("Bloco Exemplo")
                .setQuadra("Quadra Exemplo")
                .createEndereco();

        assertEquals("Avenida Principal", endereco.getRua());
        assertEquals("Cidade Exemplo", endereco.getCidade());
        assertEquals("Estado Exemplo", endereco.getEstado());
        assertEquals("12345-678", endereco.getCep());
        assertEquals("Setor Exemplo", endereco.getSetor());
        assertEquals("69", endereco.getNumero());
        assertEquals("Bloco Exemplo", endereco.getBloco());
        assertEquals("Quadra Exemplo", endereco.getQuadra());

    }
}