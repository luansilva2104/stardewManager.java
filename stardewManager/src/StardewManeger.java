void main() {

    List<Animal> animais = new ArrayList<>();

    Animal vaca = new VacaMae("Carmem", 20);
    Animal bezerro = new Bezerro("Flash",1, 12);

    Animal galinha = new GalinhaMae("Vilma", 23 );
    Animal pintinho = new Pintinho("Dourado", 2, 24);

    animais.add(vaca);
    animais.add(bezerro);
    animais.add(galinha);
    animais.add(pintinho);

      System.out.println("----------CURRAL----------");
    for (Animal animal : animais) {
        animal.coletarProduto();
        animal.emitirSom();
        animal.nome();
    }

}
