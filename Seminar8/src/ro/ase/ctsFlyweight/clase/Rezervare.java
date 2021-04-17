package ro.ase.ctsFlyweight.clase;

public class Rezervare {
    private int nrRezervare;
    private int nrMasa;

    public Rezervare(int nrRezervare, int nrMasa) {
        this.nrRezervare = nrRezervare;
        this.nrMasa = nrMasa;
    }

    @Override
    public String toString() {
        return "Rezervare{" +
                "nrRezervare=" + nrRezervare +
                ", nrMasa=" + nrMasa +
                '}';
    }
}
