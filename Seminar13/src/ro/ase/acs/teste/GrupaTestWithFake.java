package ro.ase.acs.teste;

import org.junit.Test;
import ro.ase.acs.clase.Grupa;
import ro.ase.acs.clase.Student;
import ro.ase.acs.mock.StudentFake;

import static org.junit.Assert.*;

public class GrupaTestWithFake {

    @Test
    public void testGetPromovabiblitate(){
        Grupa grupa = new Grupa(1056);
        for(int i = 0; i<7; ++i){

            StudentFake studentFake = new StudentFake();
            studentFake.setValoareAreRestanta(false);
            grupa.adaugaStudent(studentFake);
        }

        for(int i = 0; i<3; ++i){

            StudentFake studentFake = new StudentFake();
            studentFake.setValoareAreRestanta(true);
            grupa.adaugaStudent(studentFake);
        }

        assertEquals(0.7, grupa.getPromovabilitate(), 0.001);
    }

}