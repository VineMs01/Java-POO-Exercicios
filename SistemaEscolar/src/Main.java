import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Pessoa> pessoas = new ArrayList<>();

        pessoas.add(new Aluno("Vinicius", 20, "Dev BackEnd"));
        pessoas.add(new Professor("Guilherme", 27, "Desenvolvimento web"));
        pessoas.add(new Diretor("Carlos", 55, 10));

        for (Pessoa p : pessoas) {
            p.apresentar();
        }
    }
}