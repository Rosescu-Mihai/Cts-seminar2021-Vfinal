package ro.ase.ctsDecorator.clase;

public class DecoratorContactless extends DecoratorAbstract {
    public DecoratorContactless(Card card) {
        super(card);
    }

    @Override
    public void platesteContactless() {
        System.out.println(((Card)super.getCard()).getTitular()+ " a realizat o plata contactless.");
    }
}
