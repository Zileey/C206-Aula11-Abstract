package br.inatel.cdg.AulaAbstract;

import br.inatel.cdg.AulaAbstract.Mamifero.Boi;
import br.inatel.cdg.AulaAbstract.Mamifero.Cachorro;
import br.inatel.cdg.AulaAbstract.Mamifero.Lontra;
import br.inatel.cdg.AulaAbstract.Mamifero.Mamifero;

public class Main {

    public static void main(String[] args) {
        Mamifero cachorro = new Cachorro("Judite",100);
        Mamifero boi = new Boi("Clovis",200);
        Mamifero lontra = new Lontra("Eusébio",78);

        cachorro.emitirSom();
        boi.emitirSom();
        lontra.emitirSom();

    }
}
