
class Pessoa {
    private String nome;
    private int nascimento;
    private float tamanho;

    public Pessoa(String _nome, float _tamanho, int _nascimento) {
        this.nome = _nome;
        this.tamanho = _tamanho;
        this.nascimento = _nascimento;
    }

    public Pessoa() {
    }

    public Pessoa(String nome2, int data, float altura) {
    }

    public String getNome() {
        return nome;
    }

    public int getData() {
        return nascimento;
    }

    public float getTamanho() {
        return tamanho;
    }

    public int CalculaNascimento() {
        return 2021 - nascimento;
    }
}