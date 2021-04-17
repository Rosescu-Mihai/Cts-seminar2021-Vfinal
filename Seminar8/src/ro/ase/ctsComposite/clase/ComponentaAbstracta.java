package ro.ase.ctsComposite.clase;

public interface ComponentaAbstracta {
    void printareElement();
    void adaugaNod(ComponentaAbstracta componentaAbstracta);
    void stergeNod(ComponentaAbstracta componentaAbstracta);
    ComponentaAbstracta getNod(int pozitie);
}
