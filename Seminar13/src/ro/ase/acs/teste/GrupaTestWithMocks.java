package ro.ase.acs.teste;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import ro.ase.acs.categories.TestRight;
import ro.ase.acs.categories.TesteUrgente;
import ro.ase.acs.clase.Grupa;
import ro.ase.acs.mock.StudentDummy;
import ro.ase.acs.mock.StudentStub;

import static org.junit.Assert.*;

public class GrupaTestWithMocks {

    private static Grupa grupa;

    @Test
    public void adaugaStudent(){
        Grupa grupa = new Grupa(1067);
        StudentDummy studentDummy = new StudentDummy();

        grupa.adaugaStudent(studentDummy);
        assertEquals(1, grupa.getStudenti().size());
    }

    @Test
    public void adaugaStudentBoundarySuperior(){

        assertEquals(35, grupa.getStudenti().size());
    }

    @BeforeClass
    public static void creareGrupa(){
        grupa = new Grupa(1056);

        for(int i = 0; i<35; ++i){
            StudentDummy studentDummy = new StudentDummy();
            grupa.adaugaStudent(studentDummy);
        }
    }

    @Test(expected = IllegalArgumentException.class)
    public void adaugaStudentException(){

        for(int i = 0; i<36; ++i){
            StudentDummy studentDummy = new StudentDummy();
            grupa.adaugaStudent(studentDummy);
        }
    }

    @Test
    @Category({TestRight.class, TesteUrgente.class})
    public void testGetPromovabilitate(){
        Grupa grupa = new Grupa(1056);
        StudentStub studentStub = new StudentStub();
        grupa.adaugaStudent(studentStub);

        assertEquals(0, grupa.getPromovabilitate(), 0.01);
    }
}