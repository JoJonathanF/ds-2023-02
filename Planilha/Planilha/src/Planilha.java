public class Planilha {
    public static void main(String[] args) {
        Observado planilha = new Observado();

        Observador A1 = new Observador("A1", planilha);
        Observador A2 = new Observador("A2", planilha);
        Observador A3 = new Observador("A3", planilha);

        planilha.adicionarObservador(A1);
        planilha.adicionarObservador(A2);
        planilha.adicionarObservador(A3);

        A1.definirValor(10);
        A2.definirValor(20);


    }
}