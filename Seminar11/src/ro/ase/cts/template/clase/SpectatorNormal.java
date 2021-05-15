package ro.ase.cts.template.clase;

import ro.ase.cts.template.clase.Template;

public class SpectatorNormal extends Template {
    private String nume;

    public SpectatorNormal(String nume) {
        this.nume = nume;
    }

    @Override
    public void seAsazaLaCoada() {
        System.out.println(nume + " se aseaza la coada");
    }

    @Override
    public void prezintaBilet() {
        System.out.println(nume + " prezinta bilet");
    }

    @Override
    public void seFaceControlCorporal() {
        System.out.println(nume + " este trecut prin controlul corporal");
    }

    @Override
    public void seOcupaLoc() {
        System.out.println(nume + " ocupa un loc");
    }
}