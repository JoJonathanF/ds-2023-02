class Titulo implements Markdown {
    private Markdown markdown;

    public Titulo(Markdown markdown) {
        this.markdown = markdown;
    }

    public void exibe() {
        System.out.print("#");
        markdown.exibe();
    }
}