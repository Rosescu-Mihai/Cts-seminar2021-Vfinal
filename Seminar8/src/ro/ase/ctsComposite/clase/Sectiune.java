package ro.ase.ctsComposite.clase;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Sectiune implements ComponentaAbstracta {

    private String numeSectiune;
    private List<ComponentaAbstracta> listComponente = new ArrayList<>();

    public Sectiune(String numeSectiune) {
        this.numeSectiune = numeSectiune;
        //this.listComponente = listComponente;
    }

    @Override
    public void printareElement() {
        System.out.println("Sectiune: "+this.numeSectiune);
        for (ComponentaAbstracta componenta:listComponente) {
            componenta.printareElement();
        }
    }

    @Override
    public void adaugaNod(ComponentaAbstracta componentaAbstracta) {
        if(componentaAbstracta != null){
            listComponente.add(componentaAbstracta);
        }
    }

    @Override
    public void stergeNod(ComponentaAbstracta componentaAbstracta) {
        if (componentaAbstracta != null){
            listComponente.remove(componentaAbstracta);
        }
    }

    @Override
    public ComponentaAbstracta getNod(int pozitite) {
        if(pozitite>0 && pozitite < listComponente.size()) {
            return listComponente.get(pozitite);
        }
        return null;
    }
}
