package Model;


public class Fish extends Animal {
    public Fish(String name, int age) {
        super(name, age);
    }

    @Override
    public String toString() {
        return getName() + ", the Fish";
    }
}
