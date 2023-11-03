class Texto implements Markdown {
    private String texto;

    public Texto(String texto) {
        this.texto = texto;
    }

    public void exibe() {
        System.out.print(texto);
    }
}