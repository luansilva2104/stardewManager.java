public class VacaMae implements Animal {
    private String nome;
    private int idade
            ;
    public VacaMae(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }
    public String getNome(){
        return nome;
    }
    public double getidade() {
        return idade;
    }
    @Override
    public void coletarProduto() {
        System.out.println("A vaca produziu leite");
    }
    @Override
    public void emitirSom() {
        System.out.println("A vaca faz: muuu!");
    }
}
