package ro.ase.cts.template.clase;

public class SpectatorVIP extends Template {
    private String nume;
    private int nrLoja;

    public SpectatorVIP(String nume, int nrLoja) {
        this.nume = nume;
        this.nrLoja = nrLoja;
    }

    @Override
    public void seAsazaLaCoada() {

    }

    @Override
    public void prezintaBilet() {
        System.out.println(this.nume+" prezinta biletul pt loja cu nr "+this.nrLoja);
    }

    @Override
    public void seFaceControlCorporal() {
        System.out.println(this.nume + " este trecut prin controlul corporal");
    }

    @Override
    public void seOcupaLoc() {
        System.out.println(this.nume+" ocupa loja cu nr. "+this.nrLoja);
    }
}
