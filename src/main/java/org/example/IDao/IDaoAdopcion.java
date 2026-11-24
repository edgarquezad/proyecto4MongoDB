package org.example.IDao;

import org.example.Modelos.Adopcion;
import org.example.Modelos.Animal;

import java.util.List;

public interface IDaoAdopcion {

    int add(Adopcion adopcion);

    Adopcion getAdopcion(int id);

    int delete(int id);

    List<Adopcion> getAdopciones();

    int update(Adopcion adopcion);
}
