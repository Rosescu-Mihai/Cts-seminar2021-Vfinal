package ro.ase.cts.memento.program;

import ro.ase.cts.memento.clase.ManagerMemento;
import ro.ase.cts.memento.clase.Meci;

public class Main {
    public static void main(String[] args) {
        ManagerMemento managerMemento = new ManagerMemento();

        Meci meci1= new Meci("Steaua", "Rapid", 100, 100, 50);
        managerMemento.adaugaMemento(meci1.creareMemento());

        meci1.setEchipaGazda("Dinamo");
        meci1.setNrSpectatori(156);
        managerMemento.adaugaMemento(meci1.creareMemento());

        System.out.println(meci1.toString());

        System.out.println("-------------------");

        meci1.setMemento(managerMemento.getMemento(0));
        System.out.println(meci1.toString());
    }
}
