package ro.ase.acs.teste;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import ro.ase.acs.categories.TestRight;
import ro.ase.acs.categories.TesteUrgente;
import ro.ase.acs.clase.Grupa;

import static org.junit.Assert.*;

public class GrupaTest {

    @Test
    @Category(TestRight.class)
    public void testConstructorRight(){
        Grupa grupa = new Grupa(1086);
        assertEquals(1086, grupa.getNrGrupa());
    }

    @Test
    public void testContructorLimitaInferioara(){
        Grupa grupa = new Grupa(1000);
        assertEquals(1000, grupa.getNrGrupa());
    }

    @Test
    @Category(TesteUrgente.class)
    public void testContructorLimitaSuperioara(){
        Grupa grupa = new Grupa(1100);
        assertEquals(1100, grupa.getNrGrupa());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorException1(){
        Grupa grupa = new Grupa(999);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorException2(){
        Grupa grupa = new Grupa(1101);
    }

    @Test(timeout = 500)
    public void testConstructorPerformance(){
        Grupa grupa = new Grupa(1086);
    }

    @Test
    public void testConstructorRange(){
        Grupa grupa = new Grupa(1001);
        assertEquals(1001, grupa.getNrGrupa());
        Grupa grupa1 = new Grupa(1099);
        assertEquals(1099, grupa1.getNrGrupa());
    }

    @Test
    public void testConstructorExistence(){
        Grupa grupa = new Grupa(1041);
        assertNotNull(grupa.getStudenti());
    }
}