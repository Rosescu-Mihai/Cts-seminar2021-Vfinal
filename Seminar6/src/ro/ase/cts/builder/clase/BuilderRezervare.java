package ro.ase.cts.builder.clase;

public class BuilderRezervare implements AbstractBuilder {

    Rezervare rezervare = null;

    public BuilderRezervare() {
        this.rezervare = new Rezervare(0, false, false,
                false,
                false, "nimic");
    }

    public BuilderRezervare(int codRezervare) {
        this.rezervare = new Rezervare(codRezervare, false, false,
                false,
                false, "nimic");
    }

    public BuilderRezervare setCodRezervare(int codRezervare) {
        this.rezervare.setCodRezervare(codRezervare);
        return this;
    }

    public BuilderRezervare setAreMancareInclusa(boolean areMancareInclusa) {
        this.rezervare.setAreMancareInclusa(areMancareInclusa);
        return this;
    }

    public BuilderRezervare setAreScaunErgonomic(boolean areScaunErgonomic) {
        this.rezervare.setAreScaunErgonomic(areScaunErgonomic);
        return this;
    }

    public BuilderRezervare setAreBauturaRacoritoareInclusa(boolean areBauturaRacoritoareInclusa) {
        this.rezervare.setAreBauturaRacoritoareInclusa(areBauturaRacoritoareInclusa);
        return this;
    }

    public BuilderRezervare setAreMuzicaAmbientalaInclusa(boolean areMuzicaAmbientalaInclusa) {
        this.rezervare.setAreMuzicaAmbientalaInclusa(areMuzicaAmbientalaInclusa);
        return this;
    }

    public BuilderRezervare setGenMuzical(String genMuzical) {
        this.rezervare.setGenMuzical(genMuzical);
        return this;
    }
    @Override
    public Rezervare build() {
        return rezervare;
    }
}
