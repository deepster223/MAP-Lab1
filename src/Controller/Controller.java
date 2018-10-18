package Controller;

import Model.Animal;
import Model.Fish;
import Model.Turtle;
import Repository.IRepo;

public class Controller {

    private IRepo repo;

    public Controller(IRepo repo) {
        this.repo = repo;
        populate();
    }

    public void add(String AnimalType, String name, int age) {
        if (AnimalType.toLowerCase().equals("turtle")) {
            repo.add(new Turtle(name, age));
        } else if (AnimalType.toLowerCase().equals("fish")) {
            repo.add(new Fish(name, age));
        } else {
            throw new RuntimeException("Invalid type");
        }
    }

    public void remove(String name) {
        repo.remove(new Animal(name, 0));
    }

    public void populate() {
        add("turtle", "Frank", 4);
        add("turtle", "Gerald", 2);
        add("fish", "Dora", 3);
        add("fish", "Gil", 6);
        add("turtle", "Squirtle", 2);
        add("fish", "Starmie", 7);
        add("turtle", "Rocky", 11);
        add("fish", "Fishy", 3);
        add("turtle", "Blastoise", 4);
        add("fish", "Fisher", 5);
    }

    public String filter(int age) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < repo.getSize(); i++) {
            Animal animal = repo.getRepo()[i];
            if (animal.getAge() > age) {
                result.append(animal).append('\n');
            }
        }
        return result.toString();
    }
}
