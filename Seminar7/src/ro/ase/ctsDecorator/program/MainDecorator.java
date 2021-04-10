package ro.ase.ctsDecorator.program;

import ro.ase.ctsDecorator.clase.Card;
import ro.ase.ctsDecorator.clase.DecoratorAbstract;
import ro.ase.ctsDecorator.clase.DecoratorContaclessTelefon;
import ro.ase.ctsDecorator.clase.DecoratorContactless;

public class MainDecorator {
    public static void main(String args[]){
        Card card = new Card("Popescu Geo");
        card.platesteOnline();
        card.platestePOS();
        System.out.println("----------------------------");

        DecoratorContactless decoratorContactless = new DecoratorContactless(card);
        decoratorContactless.platesteContactless();
        decoratorContactless.platesteOnline();
        System.out.println("----------------------------");

        DecoratorContaclessTelefon decoratorContaclessTelefon = new DecoratorContaclessTelefon(card);
        decoratorContaclessTelefon.platesteContactless();
        decoratorContaclessTelefon.platestePOS();
        decoratorContaclessTelefon.platesteOnline();
    }
}
