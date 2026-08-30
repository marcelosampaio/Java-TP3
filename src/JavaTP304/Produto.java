package JavaTP304;

public class Produto {
    private String nome;
    private double preco;
    private int quantidadeEmEstoque;

    public void alterarPreco(double novoPreco) {
        this.preco = novoPreco;
    }

    public void alterarQuantidade(int novaQuantidade) {
        this.quantidadeEmEstoque = novaQuantidade;
    }

    public void exibirInformacoes() {
        System.out.println("Nome do produto: " + nome);
        System.out.println("Preço: " + preco);
        System.out.println("Quantidade em estoque: " + quantidadeEmEstoque);
    }

    public void inicializarNome(String nome) {
        this.nome = nome;
    }

    public void inicializarPreco(double preco) {
        this.preco = preco;
    }

    public void inicializarQuantidade(int quantidade) {
        this.quantidadeEmEstoque = quantidade;
    }
}
