public class GalinhaMae implements Animal {

    private String nome;
    private int idade;

    public GalinhaMae(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome(){
        return nome;
    }
    public double getIdade() {
        return idade;
    }
    @Override
    public void coletarProduto() {
        System.out.println("A galinha produziu um ovo!");
    }
    @Override
    public void emitirSom() {
        System.out.println("A galinha faz: cocoricó!!!!!");
    }

    @Override
    public void nome() {
        System.out.println("O nome da galinha é " + getNome() + " e ela tem " + getIdade() + " anos ");
        System.out.println("-------------------------");
    }
}
