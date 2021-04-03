package ro.ase.cts.builder.clase;

public class BuilderRezervareV2 implements AbstractBuilder {
    private int codRezervare;
    private boolean areMancareInclusa;
    private boolean areScaunErgonomic;
    private boolean areBauturaRacoritoareInclusa;
    private boolean areMuzicaAmbientalaInclusa;
    private String genMuzical;

    @Override
    public Rezervare build() {
        return new Rezervare(codRezervare, areMancareInclusa, areScaunErgonomic,
                areBauturaRacoritoareInclusa, areMuzicaAmbientalaInclusa, genMuzical );
    }

    public BuilderRezervareV2(){
        codRezervare=1000;
        genMuzical="Hip-Hop";
    }

    public BuilderRezervareV2 setCodRezervare(int codRezervare) {
        this.codRezervare = codRezervare;
        return this;
    }

    public BuilderRezervareV2 setAreMancareInclusa(boolean areMancareInclusa) {
        this.areMancareInclusa = areMancareInclusa;
        return this;
    }

    public BuilderRezervareV2 setAreScaunErgonomic(boolean areScaunErgonomic) {
        this.areScaunErgonomic = areScaunErgonomic;
        return this;
    }

    public BuilderRezervareV2 setAreBauturaRacoritoareInclusa(boolean areBauturaRacoritoareInclusa) {
        this.areBauturaRacoritoareInclusa = areBauturaRacoritoareInclusa;
        return this;
    }

    public BuilderRezervareV2 setAreMuzicaAmbientalaInclusa(boolean areMuzicaAmbientalaInclusa) {
        this.areMuzicaAmbientalaInclusa = areMuzicaAmbientalaInclusa;
        return this;
    }

    public BuilderRezervareV2 setGenMuzical(String genMuzical) {
        this.genMuzical = genMuzical;
        return this;
    }
}
