import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Produto> produtos = new ArrayList<>();

        produtos.add(new Livro("Java para Iniciantes", 100.0));
        produtos.add(new Eletronico("Notebook", 3000.0));
        produtos.add(new Alimento("Maçã", 3.0));

        for (Produto p : produtos) {
            double desconto = p.calcularDesconto();
            double precoFinal = p.getPreco() - desconto;

            System.out.println("Produto: " + p.getNome());
            System.out.println("Preço original: R$ " + p.getPreco());
            System.out.println("Desconto: R$ " + desconto);
            System.out.println("Preço com desconto: R$ " + precoFinal);
            System.out.println("==========================");
        }
    }
}