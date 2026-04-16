public class ContaCorrente extends Conta {
    public ContaCorrente(int numero, double saldo) {
        super(numero, saldo);
    }

    @Override
    public double sacar(double valor) {
        double valorComTaxa = valor + 2.0;
        if (valorComTaxa <= getSaldo()) {
            setSaldo(getSaldo() - valorComTaxa);
            System.out.println("Saque realizado com taxa de R$ 2,00.");
        } else {
            System.out.println("Saldo insuficiente para o saque + taxa.");
        }
        return getSaldo();
    }

    @Override
    public double calcularRendimento() {
        return 0;
    }
}
