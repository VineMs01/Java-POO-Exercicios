abstract class Conta {
    private int numero;
    private double saldo;

    public Conta(int numero, double saldo) {
        this.numero = numero;
        setSaldo(saldo);
    }

    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
        }
    }

    // Getters e Setters com validação
    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    protected void setSaldo(double saldo) {
        if (saldo < 0) {
            System.out.println("Erro: O saldo nao pode ser negativo!");
        } else {
            this.saldo = saldo;
        }
    }

    public abstract double sacar(double valor);
    public abstract double calcularRendimento();
}
