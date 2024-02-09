
package domain;

public class Snake extends Reptile {

    public Snake() {
        super("Big Boss", "Snake", true, "Smooth", "Egg Laying", 0);
    }

    public Snake(String name) {
        super(name, "Snake", true, "Smooth", "Egg Laying", 0);
    }

    public void hunt() {
        System.out.println("Snake aka " + this.name + " hunting.");
    }

    public void eggLaying() {
        System.out.println("Snake laying eggs.");
    }

    public String toString() {
        return "Naked Snake: \nCalled:\t" + name + "\nKind:\t" + kind + "\nLength:\t" + length + " cm"
                + "\nIs Venomous?:\t" + isVenomous + "\nSkin:\t" + skin + "\nReproduction Type:\t" + reproductionType
                + "\nNumber of Limbs:\t" + numberOfLimbs + "\n";
    }

}