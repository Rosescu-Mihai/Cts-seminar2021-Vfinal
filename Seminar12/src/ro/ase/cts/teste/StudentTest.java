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
}