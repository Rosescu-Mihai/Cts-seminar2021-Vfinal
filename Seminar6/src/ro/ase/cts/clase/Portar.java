package ro.ase.cts.clase;

public class Portar extends Jucator {
    public Portar(String nume, int nrTricou) {
        super(nume, nrTricou);
    }

    @Override
    public String toString() {
        final StringBuffer stringBuffer = new StringBuffer("Portar{");
        stringBuffer.append('}').append(super.toString());
        return stringBuffer.toString();
    }
}
