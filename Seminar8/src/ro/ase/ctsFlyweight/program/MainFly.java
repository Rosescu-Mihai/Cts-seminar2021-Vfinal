package ro.ase.ctsFlyweight.program;

import ro.ase.ctsFlyweight.clase.FlyweightFactory;
import ro.ase.ctsFlyweight.clase.Rezervare;

public class MainFly {
    public static void main(String args[]){
        Rezervare rezervare1 = new Rezervare(1, 24);
        Rezervare rezervare2 = new Rezervare(2, 25);
        Rezervare rezervare3 = new Rezervare(3, 23);

        FlyweightFactory flyweightFactory = new FlyweightFactory();

        flyweightFactory.getClient("0756439277").printeazaRezervare(rezervare1);
        flyweightFactory.getClient("0763917345").printeazaRezervare(rezervare2);
        flyweightFactory.getClient("0756439277").printeazaRezervare(rezervare3);
    }
}

