package ro.ase.cts.clase;

public class Mijlocas extends Jucator {
    public Mijlocas(String nume, int nrTricou) {
        super(nume, nrTricou);
    }

    @Override
    public String toString() {
        final StringBuffer stringBuffer = new StringBuffer("Mijlocas{");
        stringBuffer.append('}').append(super.toString());
        return stringBuffer.toString();
    }
}
