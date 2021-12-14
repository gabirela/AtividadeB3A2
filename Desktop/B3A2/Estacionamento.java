class Estacionamento {
    private String veiculo;
    private String placa;
    private float entrada;
    private float saida;

    public Estacionamento(String _veiculo, String _placa, float _entrada, float _saida) {
        this.veiculo = _veiculo;
        this.placa = _placa;
        this.entrada = _entrada;
        this.saida = _saida;
    }

    public String getNome() {

        return veiculo;
    }

    public String getPlaca() {

        return placa;
    }

    public float getEntrada() {
        return entrada;
    }

    public float getSaida() {
        return saida;
    }

    public int CalculaPreco() {
        float preco;
        preco = saida - entrada;
        return (int) (preco * 150);
    }
}