class Observador {
    private String nome;
    private int valor;
    private Observado observado;

    public Observador(String nome, Observado observado) {
        this.nome = nome;
        this.valor = 0;
        this.observado = observado;
    }

    public void definirValor(int novoValor) {
        if (valor != novoValor) {
            valor = novoValor;
            observado.notificarObservadores(this);
        }
    }

    public String getNome() {
        return nome;
    }

    public int getValor() {
        return valor;
    }

    public void reavaliar() {
        //aqui seria implementado o critério de mudança
    }
}