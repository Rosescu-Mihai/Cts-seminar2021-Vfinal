package ro.ase.cts.command.program;

import ro.ase.cts.command.clase.*;

public class Main {
    public static void main(String args[]){
        ManagerComenzi managerComenzi = new ManagerComenzi();
        Executant executant =  new Executant("Pop Adrian");
        ComandaCreare comandaCreare = new ComandaCreare(executant, 1000);

        managerComenzi.adaugaComanda(comandaCreare);
        managerComenzi.adaugaComanda(new ComandaRetragere(executant, 123));

        managerComenzi.executaComanda();

        managerComenzi.adaugaComanda(new ComandaDepunere(executant, 1234));
        managerComenzi.adaugaComanda(new ComandaRetragere(executant, 2200));

        managerComenzi.executaComanda();
        managerComenzi.executaComanda();
        managerComenzi.executaComanda();
    }
}
