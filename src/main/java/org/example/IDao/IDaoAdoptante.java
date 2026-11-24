package org.example.IDao;

import org.example.Modelos.Adoptante;

import java.util.List;

public interface IDaoAdoptante {
    int add(Adoptante adoptante);

    int delete(String dni);

    Adoptante getAdoptante(String dni);

    List<Adoptante> getAdoptantes();

    int update(Adoptante adoptante);
}
