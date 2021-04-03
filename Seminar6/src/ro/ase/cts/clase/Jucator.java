package ro.ase.cts.clase;

public abstract class Jucator {
    private String nume;
    private int nrTricou;

    public Jucator(String nume, int nrTricou) {
        this.nume = nume;
        this.nrTricou = nrTricou;
    }

    public String getNume() {
        return nume;
    }

    public int getNrTricou() {
        return nrTricou;
    }

    @Override
    public String toString() {
        return "Jucator{" +
                "nume='" + nume + '\'' +
                ", nrTricou=" + nrTricou +
                '}';
    }
}
