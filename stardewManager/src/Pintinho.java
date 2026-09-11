public class Pintinho extends GalinhaMae {

    private int meses;

    public Pintinho(String nome, int idade, int meses){
        super(nome, idade);
        this.meses = meses;
    }
    public int getMeses(){
        return meses;
    }
    @Override
    public void coletarProduto() {
        System.out.println("Pintinho não produz ovo.");
    }
    public void emitirSom() {
        System.out.println("O pintinho faz: Piupiu.");
    }

    @Override
    public void nome() {
        System.out.println("O nome do pintinho é " + getNome() + " e ele tem " + getMeses() + " mês de vida e " + getIdade() + " de idade. ");
        System.out.println("-------------------------");
    }
}
