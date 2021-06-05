package ro.ase.acs.mock;

import ro.ase.acs.clase.IStudent;

import java.util.List;

public class StudentFake implements IStudent {
    private String valoareGetNume;
    private List<Integer> valoareGetNote;
    private float valoareCalculeazaMedie;
    private int valoareGetNota;
    private boolean valoareAreRestanta;

    public String getValoareGetNume() {
        return valoareGetNume;
    }

    public void setValoareGetNume(String valoareGetNume) {
        this.valoareGetNume = valoareGetNume;
    }

    public List<Integer> getValoareGetNote() {
        return valoareGetNote;
    }

    public void setValoareGetNote(List<Integer> valoareGetNote) {
        this.valoareGetNote = valoareGetNote;
    }

    public float getValoareCalculeazaMedie() {
        return valoareCalculeazaMedie;
    }

    public void setValoareCalculeazaMedie(float valoareCalculeazaMedie) {
        this.valoareCalculeazaMedie = valoareCalculeazaMedie;
    }

    public int getValoareGetNota() {
        return valoareGetNota;
    }

    public void setValoareGetNota(int valoareGetNota) {
        this.valoareGetNota = valoareGetNota;
    }

    public boolean isValoareAreRestanta() {
        return valoareAreRestanta;
    }

    public void setValoareAreRestanta(boolean valoareAreRestanta) {
        this.valoareAreRestanta = valoareAreRestanta;
    }

    @Override
    public String getNume() {
        return valoareGetNume;
    }

    @Override
    public void setNume(String nume) {

    }

    @Override
    public List<Integer> getNote() {
        return valoareGetNote;
    }

    @Override
    public void adaugaNota(int nota) {

    }

    @Override
    public float calculeazaMedie() {
        return valoareCalculeazaMedie;
    }

    @Override
    public int getNota(int index) {
        return valoareGetNota;
    }

    @Override
    public boolean areRestante() {
        return valoareAreRestanta;
    }
}
