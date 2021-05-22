package ro.ase.cts.teste;

import ro.ase.cts.clase.Student;

import static org.junit.Assert.*;

public class StudentTest {

    @org.junit.Test
    public void getNume() {
        String nume = "Gigel";
        Student student = new Student(nume);
        assertEquals(nume, student.getNume());
    }

    @org.junit.Test
    public void setNume(){
        String nume = "Popescu";
        Student student = new Student();
        student.setNume(nume);

        assertEquals(nume, student.getNume());
    }

    @org.junit.Test
    public void testDefaultConstructorWorksCorrectly(){
        Student student = new Student();

        assertNotNull("Nu a fost initializata lista cu note!",student.getNote());
        assertNotNull("Nu a fost initializat numele!",student.getNume());
    }

    @org.junit.Test
    public void adaugaNota(){
        int  nota = 10;
        Student student = new Student();
        student.adaugaNota(nota);
        assertEquals(nota, student.getNota(0));
    }

    @org.junit.Test
    public void getNota(){
        Student student = new Student();
        student.adaugaNota(4);
        student.adaugaNota(6);
        student.adaugaNota(7);
        student.adaugaNota(10);

        assertEquals(6, student.getNota(1));
    }

    @org.junit.Test
    public void testAdauga1SinguraNota() {
        Student student = new Student();
        int nota = 10;
        student.adaugaNota(nota);
        assertEquals(1, student.getNote().size());
    }

    @org.junit.Test
    public void adaugaNotaIncorecta() {
        Student student = new Student();
        //1
        try {
            //2
            student.adaugaNota(-1);
            //3 - nu ajunge aici
            fail("Nu trebuia sa ajunga aici. Metoda nu arunca exceptie");
        } catch (IllegalArgumentException ex) {
            //4
        } catch (Exception e) {
            //5 - nu ajunge aici
            fail("Nu arunca o exceptie de tipul IllegalArgumentException");
        }
        //6
    }

    @org.junit.Test(expected = IllegalArgumentException.class)
    public void testAdaugaNotaIncorectaJUnit4() {
        Student student = new Student();
        student.adaugaNota(-1);
    }

    @org.junit.Test
    public void testStudentulAreRestante() {
        Student student = new Student();
        student.adaugaNota(3);
        boolean rezultat = student.areRestante();
        assertTrue(rezultat);
    }

    @org.junit.Test
    public void testStudentulNuAreRestante() {
        Student student = new Student();
        student.adaugaNota(6);
        boolean rezultat = student.areRestante();
        assertFalse(rezultat);
    }

    @org.junit.Test
    public void testCalculeazaMedieCorect(){
        Student student = new Student();
        student.adaugaNota(10);
        student.adaugaNota(9);
        assertEquals(9.5, student.calculeazaMedie(), 0.1);
    }
}
