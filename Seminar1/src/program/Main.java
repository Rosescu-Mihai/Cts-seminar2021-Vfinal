package program;

public class Main {

    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        Girafe g1 = new Girafe("Girafa 1");
        Girafe g2 = new Girafe("Girafa 2");

        zoo.Add(g1);
        zoo.Add(g2);

        zoo.feedAllAnimals();
    }
}
