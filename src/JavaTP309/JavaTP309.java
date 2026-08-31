package JavaTP309;

public class JavaTP309 {
    public static void main(String[] args) {
        Conta conta = new Conta("João Silva", 12345, "001", 1000.0, "01/01/2023");

        System.out.println("Objeto conta criado com sucesso!");
        conta.exibeInformacoes();

        conta.deposita(500.0);
        System.out.println("Depósito realizado. Novo saldo: " + conta.getSaldo());
        conta.exibeInformacoes();

        conta.saca(200.0);
        System.out.println("Saque realizado. Novo saldo: " + conta.getSaldo());
        conta.exibeInformacoes();

        double rendimento = conta.calculaRendimento();
        System.out.println("Rendimento calculado: " + rendimento);
        conta.exibeInformacoes();

    }
}
