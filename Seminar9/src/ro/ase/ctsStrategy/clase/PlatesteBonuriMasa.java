package ro.ase.ctsStrategy.clase;

public class PlatesteBonuriMasa implements Payable {
    @Override
    public void pay(float suma) {
        System.out.println("A fost realizata o plata cu bonuri de masa in valoare de "+suma+" lei");
    }
}
