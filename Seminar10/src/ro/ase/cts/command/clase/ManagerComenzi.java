package ro.ase.cts.command.clase;

import java.util.ArrayList;
import java.util.List;

public class ManagerComenzi {
    // Functioneaza ca o coada
    private List<ComandaAbstracta> listaComenzi = new ArrayList<>();

    public void adaugaComanda(ComandaAbstracta comandaAbstracta){
        this.listaComenzi.add(comandaAbstracta);
    }

    public void executaComanda(){
        //se vor executa comenzile de la inceputul liste, spre final
        if(this.listaComenzi.size()!=0){
            this.listaComenzi.get(0).executa();
            this.listaComenzi.remove(0);
        }
        else {
            throw new IndexOutOfBoundsException();
        }
    }
}
