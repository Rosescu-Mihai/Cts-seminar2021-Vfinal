package ro.ase.cts.observer.clase;

import java.util.ArrayList;
import java.util.List;

public abstract class Subiect {
   private List<Observer> observerList = new ArrayList<>();

   public void adaugaAbonat(Observer observer){
       if(observer != null){
           this.observerList.add(observer);
       }
   }

   public void stergeAbonat(Observer observer){
       if(observer != null){
           this.observerList.remove(observer);
       }
   }

   public void trimiteNotificare(String mesaj){
       for (Observer observer:observerList) {
           observer.receptionareMesaj(mesaj);
       }
   }

}
