package ro.ase.cts.clase;

public class FabricaPortar implements FabricaJucator {
    @Override
    public Jucator creeazaJucator(String nume, int nrTricou) {
        return new Portar(nume, nrTricou);
    }
}
