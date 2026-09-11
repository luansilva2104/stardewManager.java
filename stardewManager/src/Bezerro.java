public class Bezerro extends VacaMae {
    private int meses;

    public Bezerro(String nome, int idade, int meses){
        super(nome, idade);
        this.meses = meses;
    }
    public int getMeses() {
        return meses;
    }
    @Override
    public void coletarProduto() {
        System.out.println("O bezerro não produz leite.");
    }

    @Override
    public void emitirSom() {
        System.out.println("O bezerro faz: muuuu!");
    }

    @Override
    public void nome() {
        System.out.println("O nome do bezerro é " + getNome() + " e ele tem " + getMeses() + " mês e " + getidade() + " anos de vida.");
        System.out.println("-------------------------");
    }
}
