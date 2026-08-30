package JavaTP304;

public class JavaTP304 {
    public static void main(String[] args) {
        Produto produto = new Produto();
        produto.inicializarNome("Macarrão");
        produto.inicializarPreco(5.99);
        produto.inicializarQuantidade(100);

        System.out.println("*** Produto inicializado ***");
        produto.exibirInformacoes();

        produto.alterarPreco(4.0);
        produto.alterarQuantidade(45);

        System.out.println("*** Após alterações ***");
        produto.exibirInformacoes();
    }
}
