class Negrito implements Markdown {
    private Markdown markdown;

    public Negrito(Markdown markdown) {
        this.markdown = markdown;
    }

    public void exibe() {
        System.out.print("**");
        markdown.exibe();
        System.out.print("**");
    }
}