public class ContaInternacional extends Conta{

    public ContaInternacional(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Internacional ===");
    }
}
