public class ContaPoupanca extends Conta {
    public ContaPoupanca(int numero, double saldo) {
        super(numero, saldo);
    }

    @Override
    public double sacar(double valor) {
        if (valor <= getSaldo()) {
            setSaldo(getSaldo() - valor);
        } else {
            System.out.println("Saldo insuficiente.");
        }
        return getSaldo();
    }

    @Override
    public double calcularRendimento() {
        return getSaldo() * 0.005;
    }
}
