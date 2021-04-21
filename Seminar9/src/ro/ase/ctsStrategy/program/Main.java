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
