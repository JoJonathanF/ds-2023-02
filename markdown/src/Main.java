public class Main {
    public static void main(String[] args) {
        // Construindo a estrutura do texto em Markdown
        Markdown titulo = new Titulo(new Texto("Título"));
        Markdown linha = new Concatena(new Texto("Uma simples linha, com "), new Negrito(new Texto("negrito")));
        Markdown item = new Item(new Italico(new Texto("Primeiro item da linha com itálico.")));

        // Exibindo o texto em Markdown
        titulo.exibe();
        System.out.println();
        linha.exibe();
        System.out.println();
        item.exibe();
    }
}