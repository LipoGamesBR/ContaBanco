public abstract class Conta implements IConta {

    protected int AGENCIAPADRAO = 246;
    protected int SEQUENCIAL;

    protected double saldo;
    protected String agencia;
    protected String numero;
    protected Cliente cliente;
    protected String extrato;

    public Conta(Cliente cliente) {
        this.agencia = String.valueOf(this.AGENCIAPADRAO);
        this.numero = String.valueOf(this.SEQUENCIAL++);
        this.cliente = cliente;
    }

    public void sacar(double valor) {
        if(saldo >= valor) {
            saldo -= valor;
            System.out.println("Saque de: " + saldo + " realizado com sucesso!");
            extrato += String.format("Saque de %.2f realizado com sucesso!\n", valor);
        }
    }
    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Deposito de " + saldo + " realizado com sucesso!");
        extrato += String.format("Deposito de %.2f realizado com sucesso!\n", valor);
    }
    public void transferir(double valor, IConta contaDestino) {
        if(saldo >= valor) {
            saldo -= valor;
            contaDestino.depositar(valor);
            System.out.println("Transferência de " + saldo + ", com sucesso");
            extrato += String.format("Transferência de %.2f realizado com sucesso!\n", valor);
        }
    }
    public void imprimirExtrato() {
        System.out.println("Extrato: " + extrato);
    }
}
