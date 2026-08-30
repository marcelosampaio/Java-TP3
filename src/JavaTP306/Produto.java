package JavaTP306;

public class Produto {
    private String nome;
    private double preco;
    private int quantidadeEmEstoque;

    public Produto(String nome, double preco, int quantidadeEmEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    // O construtor permite criar o objeto já com seus valores iniciais, evitando várias atribuições
    // ou chamadas de métodos separadas após a criação.

    public void exibirInformacoes() {
        System.out.println("Nome do produto: " + nome);
        System.out.println("Preço: " + preco);
        System.out.println("Quantidade em estoque: " + quantidadeEmEstoque);
    }
}
