package ro.ase.ctsDecorator.clase;

public class Card implements CardBancar{
    private String titular;

    public Card(String titular) {
        this.titular = titular;
    }


    @Override
    public void platestePOS() {
        System.out.println("Titularul "+titular+" a platit prin POS.");
    }

    @Override
    public void platesteOnline() {
        System.out.println("Titularul "+titular+" a platit online.");
    }

    public String getTitular() {
        return titular;
    }
}
