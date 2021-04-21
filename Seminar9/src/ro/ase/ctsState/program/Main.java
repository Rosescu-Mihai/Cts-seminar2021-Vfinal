package ro.ase.ctsState.program;

import ro.ase.ctsState.clase.Masa;

public class Main {
    public static void main(String args[]){
        Masa masa = new Masa(1);
        masa.cerereEliberare();
        masa.cerereRezervare();
        masa.cerereOcupare();
        masa.cerereEliberare();
    }
}
