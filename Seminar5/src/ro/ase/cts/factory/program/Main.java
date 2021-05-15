package ro.ase.cts.factory.program;

import ro.ase.cts.factory.clase.*;

public class Main {
    public static void main(String[] args) {

        PersonalMedical medic = Factory.Create(TipPersonal.MEDIC, "Ionescu", 5000);
        PersonalMedical asistent = Factory.Create(TipPersonal.ASISTENT, "Alex", 3000);

        System.out.println("asistent = " + asistent);
        System.out.println("medic = " + medic);


        PersonalMedical medicSingleTon = FactorySingleTon.getInstance().Create(TipPersonal.MEDIC, "Ionescu2", 5000);
        PersonalMedical asistentSingleTon = FactorySingleTon.getInstance().Create(TipPersonal.ASISTENT, "Alex2", 3000);

        System.out.println("asistent Single Ton = " + asistentSingleTon);
        System.out.println("medic Single Ton = " + medicSingleTon);
    }
}
