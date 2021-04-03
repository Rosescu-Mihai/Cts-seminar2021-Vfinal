package ro.ase.cts.clase;

public class Fundas extends Jucator{
    public Fundas(String nume, int nrTricou) {
        super(nume, nrTricou);
    }

    @Override
    public String toString() {
        final StringBuffer stringBuffer = new StringBuffer("Fundas{");
        stringBuffer.append('}').append(super.toString());
        return stringBuffer.toString();
    }
}
