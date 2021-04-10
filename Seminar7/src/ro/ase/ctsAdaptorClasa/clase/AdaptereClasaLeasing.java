package ro.ase.ctsAdaptorClasa.clase;

public class AdaptereClasaLeasing extends Leasing implements Creditable {
    public AdaptereClasaLeasing(String numeClient, int suma) {
        super(numeClient, suma);
    }

    @Override
    public void crediteaza() {
        super.oferaLeasing();
    }
}
