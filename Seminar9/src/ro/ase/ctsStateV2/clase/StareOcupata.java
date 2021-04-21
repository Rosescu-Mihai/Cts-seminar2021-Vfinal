package ro.ase.ctsStateV2.clase;

public class StareOcupata implements State {
    @Override
    public void modificaStare(Masa masa) {
        if(masa.getStateMasa() instanceof StareOcupata) {
            System.out.println("Masa nu nr. "+masa.getNrMasa()+ " a fost ocupata.");
            masa.setStateMasa(this);
        }
        else{
            System.out.println("Masa nu a fost ocupata.");
        }
    }
}
