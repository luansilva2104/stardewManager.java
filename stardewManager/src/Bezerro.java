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
}
