// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Expressao expressao = new Soma(new Constante(5), new Multiplica(new Constante(2), new Constante(3)));

        System.out.println("Resultado da expressão: " + expressao.valor());
    }
}