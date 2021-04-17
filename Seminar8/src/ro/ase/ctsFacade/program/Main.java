package ro.ase.ctsFacade.program;

import ro.ase.ctsFacade.clase.Facade;
import ro.ase.ctsFacade.clase.Masa;


public class Main {
    public static void main(String args[]){
        Masa masa1 = new Masa(30, 10);
    //    System.out.println("Fara metoda facade: ");
      //  if(OperatorMasa.esteLibera(masa1.getNrMasa())){
        //    Picolo picolo1 = new Picolo("Andrei Enache");
          //  if(picolo1.esteDebarasata(masa1.getNrMasa())){
            //    if(picolo1.esteAranjata(masa1.getNrMasa())){
              //      System.out.println("Poftiti la masa!");
             //   }else{
               //     System.out.println("Va rog, mai asteptati!");
              //  }
          //  }else{
            //    System.out.println("Va rog, mai asteptati!");
           // }
       // }else{
         //   System.out.println("Va rog, mai asteptati!");
       // }

      //  System.out.println("---------------------------------");
        System.out.println("Cu metoda facade: ");

        if(Facade.esteMasaPregatita(new Masa(30, 4))){
            System.out.println("Poftiti la masa!");
        }else{
            System.out.println("Va rog, mai asteptati!");
        }
    }
}
