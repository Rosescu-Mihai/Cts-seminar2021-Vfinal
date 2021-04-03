package ro.ase.cts.clase;

public class FabricaAtacant implements FabricaJucator {
    @Override
    public Jucator creeazaJucator(String nume, int nrTricou) {
        return new Atacant(nume, nrTricou);
    }
}
