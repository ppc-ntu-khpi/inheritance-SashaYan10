
package domain;

public class Reptile extends Animal {

    public Reptile() {
        super("Just a Reptile", 100.00);
        kind = "Snake";
        isVenomous = true;
        skin = "Smooth";
        reproductionType = "Egg Laying";
        numberOfLimbs = 0;
    }

    public Reptile(String name, String kind, boolean isVenomous, String skin, String reproductionType,
            int numberOfLimbs) {
        super(name, 100.00);
        this.kind = kind;
        this.isVenomous = isVenomous;
        this.skin = skin;
        this.reproductionType = reproductionType;
        this.numberOfLimbs = numberOfLimbs;
    }

    protected String kind;

    protected boolean isVenomous;

    protected String skin;

    protected String reproductionType;

    protected int numberOfLimbs;

    public void sleep() {
        System.out.println(name + " sleeping.");
    }

}