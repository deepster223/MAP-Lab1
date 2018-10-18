package Repository;

import Model.Animal;


public interface IRepo {
    void add(Animal X);

    void remove(Animal X);

    int getSize();

    Animal[] getRepo();
}
