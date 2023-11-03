class Italico implements Markdown {
    private Markdown markdown;

    public Italico(Markdown markdown) {
        this.markdown = markdown;
    }

    public void exibe() {
        System.out.print("_");
        markdown.exibe();
        System.out.print("_");
    }
}