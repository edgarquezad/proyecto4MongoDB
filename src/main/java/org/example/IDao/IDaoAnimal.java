package org.example.IDao;
import org.example.Modelos.Animal;

import java.util.List;

public  interface IDaoAnimal {


    int add(Animal animal);

    int delete(int id);

    Animal getAnimal(int id);

    List<Animal> getAnimales();

    int update(Animal animal);
}
