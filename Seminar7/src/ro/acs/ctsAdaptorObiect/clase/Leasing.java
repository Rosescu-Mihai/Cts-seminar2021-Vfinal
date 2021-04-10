package ro.acs.ctsAdaptorObiect.clase;

public class Leasing {
    private String numeClient;
    private int suma;

    public Leasing(String numeClient, int suma) {
        super();
        this.numeClient = numeClient;
        this.suma = suma;
    }

    public void oferaLeasing(){
        System.out.println("Pentru clientul "+numeClient+ " s-a oferit un leasing in valoare de "+suma);
    }
}
