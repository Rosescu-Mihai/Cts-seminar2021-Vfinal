package ro.ase.ctsStateV2.program;

import ro.ase.ctsStateV2.clase.Masa;

public class Main {
    public static void main(String args[]){
        Masa masa = new Masa(1);
        masa.elibereazaMasa();
        masa.ocupaMasa();
        masa.rezervaMasa();
        masa.elibereazaMasa();
        masa.rezervaMasa();
    }
}
