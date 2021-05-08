package ro.ase.cts.chainOfResponsability.program;

import ro.ase.cts.chainOfResponsability.clase.Cont;
import ro.ase.cts.chainOfResponsability.clase.ContCredit;
import ro.ase.cts.chainOfResponsability.clase.ContCurent;
import ro.ase.cts.chainOfResponsability.clase.ContEconomii;

public class Main {
    public static void main(String args[]){
        Cont cont = new ContCurent(200);
        Cont contCredit = new ContCredit(150);
        Cont contEconomii = new ContEconomii(150);

        cont.setSuccesorCont(contCredit);
        contCredit.setSuccesorCont(contEconomii);

        cont.realizeazaPLata(100);
        cont.realizeazaPLata(150);
        cont.realizeazaPLata(100);
        cont.realizeazaPLata(100);
        cont.realizeazaPLata(100);
    }
}
