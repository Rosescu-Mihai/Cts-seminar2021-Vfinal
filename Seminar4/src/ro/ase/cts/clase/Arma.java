package ro.ase.cts.clase;

public class Arma {
    private String denumire;
    private int calibru;
    private String tipArma;
    private static Arma arma = null;

    public static Arma getInstance(String denumire, int calibru, String tipArma){
        if(arma==null){
            arma = new Arma(denumire, calibru, tipArma);
        }
        return arma;
    }

    private Arma() {
        this.calibru=0;
        this.denumire="";
        this.tipArma="";
    }

    private Arma(String denumire, int calibru, String tipArma) {
        this.denumire = denumire;
        this.calibru = calibru;
        this.tipArma = tipArma;
    }

    public String getDenumire() {
        return denumire;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    public int getCalibru() {
        return calibru;
    }

    public void setCalibru(int calibru) {
        this.calibru = calibru;
    }

    public String getTipArma() {
        return tipArma;
    }

    public void setTipArma(String tipArma) {
        this.tipArma = tipArma;
    }

    @Override
    public String toString() {
        return "Arma{" +
                "denumire='" + denumire + '\'' +
                ", calibru=" + calibru +
                ", tipArma='" + tipArma + '\'' +
                '}';
    }
}