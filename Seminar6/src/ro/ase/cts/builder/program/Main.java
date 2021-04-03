package ro.ase.cts.builder.program;


import ro.ase.cts.builder.clase.BuilderRezervare;
import ro.ase.cts.builder.clase.BuilderRezervareV2;
import ro.ase.cts.builder.clase.Rezervare;

public class Main {
    public static void main(String[] args) {
        Rezervare rezervare = new Rezervare(12, false,true,
                false, true, "rock");
        BuilderRezervare builderRezervare = new BuilderRezervare().setCodRezervare(1).setAreBauturaRacoritoareInclusa(true).setAreMancareInclusa(true)
                .setAreMuzicaAmbientalaInclusa(true).setAreScaunErgonomic(true).setGenMuzical("Pop-Rock");
        Rezervare rezervare1 = builderRezervare.build();
        System.out.println(rezervare1.toString());

        Rezervare rezervare2 = new BuilderRezervare().setCodRezervare(2)
                .setAreBauturaRacoritoareInclusa(false).setAreMancareInclusa(true)
                .setAreMuzicaAmbientalaInclusa(false).setAreScaunErgonomic(false)
                .build();
        System.out.println(rezervare2.toString());

        Rezervare rezervare3 = builderRezervare.setCodRezervare(3).build();

        BuilderRezervareV2 builderRezervareV2 = new BuilderRezervareV2().setAreMancareInclusa(true)
                .setAreScaunErgonomic(true).setAreBauturaRacoritoareInclusa(true);

        Rezervare rezervareV2_1=builderRezervareV2.setCodRezervare(10).build();
        Rezervare rezervareV2_2=builderRezervareV2.setCodRezervare(11).build();

        System.out.println(rezervareV2_1.toString());
        System.out.println(rezervareV2_2.toString());
    }
}
