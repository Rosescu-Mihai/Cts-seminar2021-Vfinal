package ro.ase.ctsStrategy.program;

import ro.ase.ctsStrategy.clase.Clientul;
import ro.ase.ctsStrategy.clase.PlataCard;
import ro.ase.ctsStrategy.clase.PlataCash;
import ro.ase.ctsStrategy.clase.PlatesteBonuriMasa;

public class Main {
    public static void main(String args[]){
        Clientul clientul = new Clientul("Ionnel", new PlataCash());
        clientul.platesteNota(200);
        clientul.setPlata(new PlataCard());
        clientul.platesteNota((float) 100.3);
        clientul.setPlata(new PlatesteBonuriMasa());
        clientul.platesteNota((float) 1000.50);
    }
}
//11. Este dorită implementarea modului de plată pentru clienții restaurantului.
//        Modul de plată îl decide clientul în momentul în care trebuie să facă plata.
//        Plata se poate realiza cu cardul sau cash.
//        Sa se implementeze modulul de plata al restaurantului.
