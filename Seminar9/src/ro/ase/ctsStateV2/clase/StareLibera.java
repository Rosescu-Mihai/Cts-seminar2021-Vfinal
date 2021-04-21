package ro.ase.ctsStateV2.clase;

public class StareLibera implements State{
    @Override
    public void modificaStare(Masa masa) {
        if(masa.getStateMasa() instanceof StareLibera) {
            System.out.println("Masa nu nr. "+masa.getNrMasa()+ " a fost eliberata.");
            masa.setStateMasa(this);
        }
        else{
            System.out.println("Masa nu a fost eliberata.");
        }
    }
}
