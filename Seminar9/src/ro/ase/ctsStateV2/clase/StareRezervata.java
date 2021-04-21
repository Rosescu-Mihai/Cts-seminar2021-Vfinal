package ro.ase.ctsStateV2.clase;

public class StareRezervata implements State {
    @Override
    public void modificaStare(Masa masa) {
        if(masa.getStateMasa() instanceof StareRezervata) {
            System.out.println("Masa nu nr. "+masa.getNrMasa()+ " a fost rezervata.");
            masa.setStateMasa(this);
        }
        else{
            System.out.println("Masa nu a fost rezervata.");
        }
    }
}
