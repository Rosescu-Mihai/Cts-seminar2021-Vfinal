package ro.ase.cts.clase;

public class Atacant extends Jucator{
    public Atacant(String nume, int nrTricou) {
        super(nume, nrTricou);
    }

    @Override
    public String toString() {
        final StringBuffer stringBuffer = new StringBuffer("Atacant{");
        stringBuffer.append('}').append(super.toString());
        return stringBuffer.toString();
    }
}
