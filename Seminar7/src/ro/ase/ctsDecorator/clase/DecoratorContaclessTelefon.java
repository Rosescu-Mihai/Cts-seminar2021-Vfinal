package ro.ase.ctsDecorator.clase;

public class DecoratorContaclessTelefon extends DecoratorAbstract {
    public DecoratorContaclessTelefon(Card card) {
        super(card);
    }

    @Override
    public void platesteContactless() {
        System.out.println(((Card)super.getCard()).getTitular()+" a realizat o plata contactless cu telefonul.");
    }
}
