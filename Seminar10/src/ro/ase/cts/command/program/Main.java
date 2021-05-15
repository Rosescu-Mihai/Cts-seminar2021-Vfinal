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
//15. Asupra unui cont bancar se dau comenzi de către operatorii băncii. Comenzile care se pot da sunt de constituire, retragere, depunere.
//        Sa se realizeze modulul prin care se furnizează aceste opțiuni de trimitere a comenzilor către conturile bancare de către operatori.
//        Modulul trebuie să permită și realizarea de undo pentru comenzile date.
