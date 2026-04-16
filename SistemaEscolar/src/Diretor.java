public class Diretor extends Pessoa {
    private int tempoDeGestao;

    public Diretor(String nome, int idade, int tempoDeGestao) {
        super(nome, idade);
        this.tempoDeGestao = tempoDeGestao;
    }

    public int getTempoDeGestao() {
        return tempoDeGestao;
    }

    public void setTempoDeGestao(int tempoDeGestao) {
        this.tempoDeGestao = tempoDeGestao;
    }

    @Override
    public void apresentar() {
        System.out.println("Sou o diretor " + getNome() +
                ", há " + tempoDeGestao + " anos na gestão.");
    }
}