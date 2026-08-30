package JavaTP305;

public class JavaTP305 {
    public static void main(String[] args) {
        Produto produto = new Produto();

        produto.setNome("Macarrão");
        produto.setPreco(5.99);
        produto.setQuantidadeEmEstoque(100);

        System.out.println("*** Valores definidos pelos setters ***");
        System.out.println("Nome: " + produto.getNome());
        System.out.println("Preço: " + produto.getPreco());
        System.out.println("Quantidade em estoque: " + produto.getQuantidadeEmEstoque());

        produto.setPreco(4.99);
        produto.setQuantidadeEmEstoque(80);

        System.out.println("*** Valores após atualização ***");
        System.out.println("Nome: " + produto.getNome());
        System.out.println("Preço: " + produto.getPreco());
        System.out.println("Quantidade em estoque: " + produto.getQuantidadeEmEstoque());
    }
}