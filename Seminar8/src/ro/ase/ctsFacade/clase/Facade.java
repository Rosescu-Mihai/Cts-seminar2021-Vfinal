package ro.ase.ctsFacade.clase;

public class Facade {
    public static boolean esteMasaPregatita(Masa masa){
        if(OperatorMasa.esteLibera(masa.getNrMasa())){
            Picolo picolo1 = new Picolo("Andrei Enache");
            if(picolo1.esteDebarasata(masa.getNrMasa())){
                if(picolo1.esteAranjata(masa.getNrMasa())){
                    return true;
                }
            }
        }
        return false;
    }
}
