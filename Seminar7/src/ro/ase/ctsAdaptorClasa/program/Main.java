package ro.ase.ctsAdaptorClasa.program;


import ro.acs.ctsAdaptorObiect.clase.AdapterLeasing;
import ro.acs.ctsAdaptorObiect.clase.Leasing;
import ro.ase.ctsAdaptorClasa.clase.*;

public class Main {
    public static void printeazaInformatiiCredit(Creditable creditable){
        creditable.crediteaza();

    }
    public static void main(String args[]){
        AdaptereClasaLeasing adaptereClasaLeasing = new AdaptereClasaLeasing("Ion", 20000);
        printeazaInformatiiCredit(adaptereClasaLeasing);
    }
}
