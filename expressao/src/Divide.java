class Divide implements Expressao {
    private Expressao expressaoEsquerda;
    private Expressao expressaoDireita;

    public Divide(Expressao expressaoEsquerda, Expressao expressaoDireita) {
        this.expressaoEsquerda = expressaoEsquerda;
        this.expressaoDireita = expressaoDireita;
    }

    @Override
    public float valor() {
        float divisor = expressaoDireita.valor();
        if (divisor == 0) {
            throw new ArithmeticException("Divisão por zero.");
        }
        return expressaoEsquerda.valor() / divisor;
    }
}