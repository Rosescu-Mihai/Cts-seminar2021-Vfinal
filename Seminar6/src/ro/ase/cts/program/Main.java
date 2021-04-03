package ro.ase.cts.program;

import ro.ase.cts.clase.*;

public class Main {
    public static void afiseazaInfoJucator(FabricaJucator fabrica, String nume, int nrTricou){
        Jucator jucator = fabrica.creeazaJucator(nume, nrTricou);
        System.out.println(jucator.toString());
    }

    public static void main(String[] args) {
        afiseazaInfoJucator(new FabricaAtacant(), "Popescu", 15);
        afiseazaInfoJucator(new FabricaPortar(), "Ionescu", 23);
        afiseazaInfoJucator(new FabricaMijlocas(), "Tanase", 12);
    }
}
