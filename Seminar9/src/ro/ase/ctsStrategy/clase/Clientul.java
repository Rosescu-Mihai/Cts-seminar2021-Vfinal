package ro.ase.ctsStrategy.clase;

public class Clientul {
    private String numeClient;
    private Payable plata;

    public Clientul(String numeClient, Payable plata) {
        this.numeClient = numeClient;
        this.plata = plata;
    }

    public void setPlata(Payable plata) {
        this.plata = plata;
    }

    public void platesteNota(float suma){
        System.out.println("Clinetul "+this.numeClient);
        this.plata.pay(suma);
    }
}
