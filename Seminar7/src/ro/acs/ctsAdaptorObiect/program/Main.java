package ro.acs.ctsAdaptorObiect.program;

import ro.acs.ctsAdaptorObiect.clase.AdapterLeasing;
import ro.acs.ctsAdaptorObiect.clase.Creditable;
import ro.acs.ctsAdaptorObiect.clase.Leasing;

public class Main {
    public static void printeazaInformatiiCredit(Creditable creditable){
        creditable.crediteaza();

    }

    public static void main(String args[]){
        Leasing leasing = new Leasing("Bogdan", 1000);
        AdapterLeasing adapterLeasing = new AdapterLeasing(leasing);
        adapterLeasing.crediteaza();
        System.out.println("-------------------");
        printeazaInformatiiCredit(adapterLeasing);
    }
}
