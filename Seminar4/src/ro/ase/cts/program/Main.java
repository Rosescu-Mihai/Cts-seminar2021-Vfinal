package ro.ase.cts.program;

import ro.ase.cts.clase.Parlament;

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
    }
}