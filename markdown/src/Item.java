class Item implements Markdown {
    private Markdown markdown;

    public Item(Markdown markdown) {
        this.markdown = markdown;
    }

    public void exibe() {
        System.out.print("* ");
        markdown.exibe();
    }
}