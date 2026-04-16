import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        ContaCorrente cCorrente = new ContaCorrente(321, 0);
        ContaPoupanca cPoupanca = new ContaPoupanca(30, 0);

        int opcao = 0;

        while (opcao != 5) {
            System.out.println("\n--- SISTEMA BANCÁRIO ---");
            System.out.println("1. Depositar na Corrente");
            System.out.println("2. Sacar da Corrente (Taxa R$2)");
            System.out.println("3. Depositar na Poupança");
            System.out.println("4. Sacar da Poupança (Sem taxa)");
            System.out.println("5. Sair e ver saldos finais");
            System.out.print("Escolha uma opção: ");
            opcao = read.nextInt();

            double valor;

            switch (opcao) {
                case 1:
                    System.out.print("\nValor para depositar na Corrente: ");
                    valor = read.nextDouble();
                    if (valor>=0){
                        cCorrente.depositar(valor);

                    }else {
                        System.out.println("\nNao e permitido valor negativo");

                    }

                    break;
                case 2:
                    System.out.print("\nValor para sacar da Corrente: ");
                    valor = read.nextDouble();
                    if (valor>=0){
                        cCorrente.sacar(valor);

                    }else {
                        System.out.println("\nNao e permitido valor negativo");

                    }

                    break;
                case 3:
                    System.out.print("\nValor para depositar na Poupança: ");
                    valor = read.nextDouble();

                    if (valor>=0){
                        cPoupanca.depositar(valor);

                    }else {
                        System.out.println("\nNao e permitido valor negativo");

                    }

                    break;
                case 4:
                    System.out.print("\nValor para sacar da Poupança: ");
                    valor = read.nextDouble();

                    if (valor>=0){
                        cPoupanca.sacar(valor);
                    }else {
                    System.out.println("\nNao e permitido valor negativo");

                    }

                    break;
                case 5:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }

            System.out.println("Saldo Corrente: R$ " + cCorrente.getSaldo());
            System.out.println("Saldo Poupança: R$ " + cPoupanca.getSaldo());
        }

        System.out.println("\n--- RENDIMENTOS DO MÊS ---");
        System.out.println("Rendimento Corrente: R$ " + cCorrente.calcularRendimento());
        System.out.println("Rendimento Poupança (0.5%): R$ " + cPoupanca.calcularRendimento());

        read.close();
    }
}
