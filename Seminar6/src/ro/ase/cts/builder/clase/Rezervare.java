package ro.ase.cts.builder.clase;

public class Rezervare {
    private int codRezervare;
    private boolean areMancareInclusa;
    private boolean areScaunErgonomic;
    private boolean areBauturaRacoritoareInclusa;
    private boolean areMuzicaAmbientalaInclusa;
    private String genMuzical;

    public Rezervare(int codRezervare, boolean areMancareInclusa, boolean areScaunErgonomic, boolean areBauturaRacoritoareInclusa, boolean areMuzicaAmbientalaInclusa, String genMuzical) {
        this.codRezervare = codRezervare;
        this.areMancareInclusa = areMancareInclusa;
        this.areScaunErgonomic = areScaunErgonomic;
        this.areBauturaRacoritoareInclusa = areBauturaRacoritoareInclusa;
        this.areMuzicaAmbientalaInclusa = areMuzicaAmbientalaInclusa;
        this.genMuzical = genMuzical;
    }

    public void setCodRezervare(int codRezervare) {
        this.codRezervare = codRezervare;
    }

    public void setAreMancareInclusa(boolean areMancareInclusa) {
        this.areMancareInclusa = areMancareInclusa;
    }

    public void setAreScaunErgonomic(boolean areScaunErgonomic) {
        this.areScaunErgonomic = areScaunErgonomic;
    }

    public void setAreBauturaRacoritoareInclusa(boolean areBauturaRacoritoareInclusa) {
        this.areBauturaRacoritoareInclusa = areBauturaRacoritoareInclusa;
    }

    public void setAreMuzicaAmbientalaInclusa(boolean areMuzicaAmbientalaInclusa) {
        this.areMuzicaAmbientalaInclusa = areMuzicaAmbientalaInclusa;
    }

    public void setGenMuzical(String genMuzical) {
        this.genMuzical = genMuzical;
    }

    @Override
    public String toString() {
        return "Rezervare{" +
                "codRezervare=" + codRezervare +
                ", areMancareInclusa=" + areMancareInclusa +
                ", areScaunErgonomic=" + areScaunErgonomic +
                ", areBauturaRacoritoareInclusa=" + areBauturaRacoritoareInclusa +
                ", areMuzicaAmbientalaInclusa=" + areMuzicaAmbientalaInclusa +
                ", genMuzical='" + genMuzical + '\'' +
                '}';
    }
}
