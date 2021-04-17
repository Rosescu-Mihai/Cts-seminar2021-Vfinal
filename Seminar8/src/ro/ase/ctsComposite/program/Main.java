package ro.ase.ctsComposite.program;

import ro.ase.ctsComposite.clase.Produs;
import ro.ase.ctsComposite.clase.Sectiune;

public class Main {
    public static void main(String args[]){
        Sectiune bauturi = new Sectiune("bauturi");
        Sectiune deserturi = new Sectiune("deserturi");

        Produs cola = new Produs("Cola");
        Produs tiramisu = new Produs("Tiramisu");
        Produs pepsi = new Produs("Pepsi");

        bauturi.adaugaNod(cola);
        deserturi.adaugaNod(tiramisu);
        bauturi.adaugaNod(pepsi);

        Sectiune meniu = new Sectiune("Meniu");
        meniu.adaugaNod(bauturi);
        meniu.adaugaNod(deserturi);

        meniu.printareElement();
    }
}
