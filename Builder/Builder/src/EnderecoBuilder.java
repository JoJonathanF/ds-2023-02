public class EnderecoBuilder {
    private String rua;
    private String setor;
    private String cep;
    private String numero;
    private String cidade;
    private String estado;
    private String bloco;
    private String quadra;

    public EnderecoBuilder setRua(String rua) {
        this.rua = rua;
        return this;
    }

    public EnderecoBuilder setSetor(String setor) {
        this.setor = setor;
        return this;
    }

    public EnderecoBuilder setCep(String cep) {
        this.cep = cep;
        return this;
    }

    public EnderecoBuilder setNumero(String numero) {
        this.numero = numero;
        return this;
    }

    public EnderecoBuilder setCidade(String cidade) {
        this.cidade = cidade;
        return this;
    }

    public EnderecoBuilder setEstado(String estado) {
        this.estado = estado;
        return this;
    }

    public EnderecoBuilder setBloco(String bloco) {
        this.bloco = bloco;
        return this;
    }

    public EnderecoBuilder setQuadra(String quadra) {
        this.quadra = quadra;
        return this;
    }

    public Endereco createEndereco() {
        return new Endereco(rua, setor, cep, numero, cidade, estado, bloco, quadra);
    }
}