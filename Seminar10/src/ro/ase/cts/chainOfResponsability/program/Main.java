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
//16. Banca emite carduri care au mai multe conturi diferite.
//        Se doreste ca un client sa isi poata seta ordinea in care vor fi folosite cele trei conturi.
//        Astfel daca in contul curent nu o sa fie o suma suficienta de realizare a unei plati, plata respectiva va fi realizata din urmatorul cont setat de catre client. Daca nici in acesta nu este suma suficienta,
//        se foloseste al treilea cont. Daca nici cel de al treilea cont nu are o suma suficient de mare, plata respectiva este refuzata.
//        Sa se implementeze modulul care permite clientului setarea ordinii in care vor fi folosite conturile pentru realizarea unei plati.
