package ro.ase.cts.chainOfResponsability.clase;

public class ContEconomii extends Cont {

    public ContEconomii(float sold) {
        super(sold);
    }

    @Override
    public void realizeazaPLata(float suma) {
        if(super.getSold() >= suma){
            System.out.println("Se realizeaza plata din contul de economii in valoare de "+suma+".");
            super.setSold(super.getSold()-suma);
            System.out.println("Sold "+super.getSold());
        }
        else{
            if(super.getSuccesorCont() != null){
                super.getSuccesorCont().realizeazaPLata(suma);
            }
            else{
                System.out.println("Nu se poate realiza plata");
            }
        }
    }
}
