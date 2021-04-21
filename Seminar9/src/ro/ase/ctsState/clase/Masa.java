package ro.ase.ctsState.clase;

public class Masa {
    private int nrMasa;
    private Stare stareMasa;

    public Masa(int nrMasa) {
        this.nrMasa = nrMasa;
        this.stareMasa = new Libera();
    }

    public void cerereRezervare(){
        if(this.stareMasa instanceof Libera){
            System.out.println("Masa cu codul "+this.nrMasa+" a fost rezervata.");
            this.stareMasa = new Rezervat();
        }
        else{
            System.out.println("Masa nu poate fi rezervata.");
        }

    }

    public void cerereOcupare(){
        if(!(this.stareMasa instanceof Ocupata)){
            System.out.println("Masa cu codul "+this.nrMasa+" a fost ocupata.");
            this.stareMasa = new Rezervat();
        }
        else{
            System.out.println("Masa nu poate fi ocupata.");
        }

    }

    public void cerereEliberare(){
        if(!(this.stareMasa instanceof Libera)){
            System.out.println("Masa cu codul "+this.nrMasa+" a fost eliberata.");
            this.stareMasa = new Libera();
        }
        else{
            System.out.println("Masa nu poate fi eliberata.");
        }

    }
}
