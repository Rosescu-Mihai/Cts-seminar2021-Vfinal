package ro.ase.cts.memento.clase;

import java.util.ArrayList;
import java.util.List;

public class ManagerMemento {
    private List<Memento> mementoList;

    public ManagerMemento() {
        mementoList= new ArrayList<>();
    }

    public void adaugaMemento(Memento memento){
        this.mementoList.add(memento);
    }

    public Memento getLastMemento(){
        if(this.mementoList.size() != 0){
            return this.mementoList.get(this.mementoList.size()-1);
        }
        throw new IndexOutOfBoundsException();
    }

    public Memento getMemento(int index){
        if(this.mementoList.size() != 0){
            return this.mementoList.get(index);
        }
        throw new IndexOutOfBoundsException();
    }
}
