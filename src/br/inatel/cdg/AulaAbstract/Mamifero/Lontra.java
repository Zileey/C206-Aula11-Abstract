package br.inatel.cdg.AulaAbstract.Mamifero;

public class Lontra extends Mamifero {

    public Lontra(String nome, double vida) {
        super(nome, vida);
    }

    @Override
    public void emitirSom(){

        System.out.println("Lontra imitindo som!");
    }
}
