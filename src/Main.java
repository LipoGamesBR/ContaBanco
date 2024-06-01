public class Main {
    public static void main(String[] args) {
        Cliente venilton = new Cliente("Felipe Oliveira", "123456789123", "Brasil");

        Conta cc = new ContaCorrente(venilton);
        Conta poupanca = new ContaPoupanca(venilton);

        cc.depositar(100);
        cc.transferir(100, poupanca);

        cc.imprimirExtrato();

        poupanca.imprimirExtrato();
    }
}