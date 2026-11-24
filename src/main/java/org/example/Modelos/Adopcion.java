package org.example.Modelos;

import java.util.Date;

public class Adopcion {
    private int id;
    private Animal animal;
    private Adoptante adoptante;
    private Date fechaResolucion;
    private Date fechaSolicitud;
    private EstadoAdopcion estadoAdopcion;

    public Adopcion(int id,Animal animales, EstadoAdopcion estadoAdopcion, Date fechaSolicitud, Date fechaResolucion, Adoptante adoptante) {
        this.id = id;
        this.animal = animales;
        this.estadoAdopcion = estadoAdopcion;
        this.fechaSolicitud = fechaSolicitud;
        this.fechaResolucion = fechaResolucion;
        this.adoptante = adoptante;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public void setAnimales(Animal animales) {
        this.animal = animales;
    }

    public Adoptante getAdoptante() {
        return adoptante;
    }

    public void setAdoptante(Adoptante adoptante) {
        this.adoptante = adoptante;
    }

    public Date getFechaResolucion() {
        return fechaResolucion;
    }

    public void setFechaResolucion(Date fechaResolucion) {
        this.fechaResolucion = fechaResolucion;
    }

    public Date getFechaSolicitud() {
        return fechaSolicitud;
    }

    public void setFechaSolicitud(Date fechaSolicitud) {
        this.fechaSolicitud = fechaSolicitud;
    }

    public EstadoAdopcion getEstadoAdopcion() {
        return estadoAdopcion;
    }

    @Override
    public String toString() {
        return "Adopcion{" +
                "id=" + id +
                ", animal=" + animal +
                ", adoptante=" + adoptante +
                ", fechaResolucion=" + fechaResolucion +
                ", fechaSolicitud=" + fechaSolicitud +
                ", estadoAdopcion=" + estadoAdopcion +
                '}';
    }

    public void setEstadoAdopcion(EstadoAdopcion estadoAdopcion) {
        this.estadoAdopcion = estadoAdopcion;

    }
}
