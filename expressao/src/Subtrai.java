class Subtrai implements Expressao {
    private Expressao expressaoEsquerda;
    private Expressao expressaoDireita;

    public Subtrai(Expressao expressaoEsquerda, Expressao expressaoDireita) {
        this.expressaoEsquerda = expressaoEsquerda;
        this.expressaoDireita = expressaoDireita;
    }

    @Override
    public float valor() {
        return expressaoEsquerda.valor() - expressaoDireita.valor();
    }
}