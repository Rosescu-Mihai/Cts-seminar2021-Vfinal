package ro.ase.ctsStrategy.clase;

public class PlataCard implements Payable {
    @Override
    public void pay(float suma) {
        System.out.println("A fost realizata o plata card in valoare de "+suma+" lei");
    }

}
