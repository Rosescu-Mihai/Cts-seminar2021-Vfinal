package ro.ase.cts.clase.program;

import ro.ase.cts.clase.clase.Parlament;
import ro.ase.cts.clase.clase.ParlamentLazy;

public class Main {
    public static void main(String[] args) {
        //Parlament parlament1 = new Parlament("Romania", 123, 4, "Undeva");
        //Parlament parlament2 = new Parlament("Bulgaria", 456, 14, "In Bulgaria");

        Parlament parlament1 = Parlament.getInstance();
        Parlament parlament2 = Parlament.getInstance();

        System.out.println(parlament1.toString());
        System.out.println(parlament2.toString());
        System.out.println("====================");

        parlament1.setTara("Romania");
        parlament2.setNrParlamentari(300);

        System.out.println(parlament1.toString());
        System.out.println(parlament2.toString());

        ParlamentLazy parlamentLazy1 = ParlamentLazy.getInstance("Serbia", 400, 8, "Sediul A");
        ParlamentLazy parlamentLazy2 = ParlamentLazy.getInstance("UK", 500, 2, "Sediul B");

        System.out.println(parlamentLazy1.toString());
        System.out.println(parlament2.toString());
    }
}