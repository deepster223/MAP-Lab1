package Model;


public class Turtle extends Animal {

    public Turtle(String name, int age) {
        super(name, age);
    }

    @Override
    public String toString() {
        return getName() + ", the Turtle";
    }
}
