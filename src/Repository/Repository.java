package Repository;

import Model.Animal;


public class Repository implements IRepo {
    private int capacity = 500;
    private Animal[] animals = new Animal[capacity];
    private int size = 0;

    public Repository() {
    }

    @Override
    public void add(Animal X) {
        animals[size++] = X;
    }

    @Override
    public void remove(Animal X) {
        int pos = find(X.getName());
        size--;
        for (int i = pos; i < getSize(); i++) {
            animals[i] = animals[i + 1];
            animals[i + 1] = null;
        }
    }

    @Override
    public int getSize() {
        return this.size;
    }

    @Override
    public Animal[] getRepo() {
        return animals;
    }

    private int find(String name) {
        for (int i = 0; i < getSize(); i++) {
            if (animals[i].getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }
}
