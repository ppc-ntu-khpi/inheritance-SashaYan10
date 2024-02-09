
package domain;

public class Animal {

    public Animal() {
        this("Just an Animal", 100.00);
    }

    public Animal(String name, double length) {
        this.name = name;
        this.length = length;
    }

    protected String name;

    protected double length;

    public void eat() {
        System.out.println(name + " is eating.");
    }

    public void sound() {
        System.out.println("Naked Snake is hissing.");
    }

    public void move() {
        System.out.println("Naked Snake is slithering.");
    }

}