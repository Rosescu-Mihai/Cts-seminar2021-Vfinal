package ro.ase.ctsStateV2.clase;

public class Masa {
    private int nrMasa;
    private State stateMasa;

    public Masa(int nrMasa) {
        this.nrMasa = nrMasa;
        this.stateMasa = new StareLibera();
    }

    public void setStateMasa(State stateMasa) {
        this.stateMasa = stateMasa;
    }

    public State getStateMasa() {
        return stateMasa;
    }

    public int getNrMasa() {
        return nrMasa;
    }

    public void ocupaMasa(){
        StareOcupata stareOcupata = new StareOcupata();
        stareOcupata.modificaStare(this);
    }

    public void elibereazaMasa(){
        StareLibera stareLibera = new StareLibera();
        stareLibera.modificaStare(this);
    }

    public void rezervaMasa(){
        StareRezervata stareRezervata = new StareRezervata();
        stareRezervata.modificaStare(this);
    }
}
