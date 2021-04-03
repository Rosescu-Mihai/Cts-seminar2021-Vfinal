package ro.ase.cts.clase;

public class FabricaMijlocas implements FabricaJucator {
    @Override
    public Jucator creeazaJucator(String nume, int nrTricou) {
        return new Mijlocas(nume, nrTricou);
    }
}
