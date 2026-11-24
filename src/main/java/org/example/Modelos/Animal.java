package org.example.Modelos;

import java.util.Date;

public class Animal {

    private int id;
    private String nombre;
    private int edad;
    private String raza;
    private String sexo;
    private String descripcion;
    private Date fechaIngreso;
    Estado estado;


    public Animal(int id, String nombre, Estado estado, Date fechaIngreso, String descripcion, String sexo, String raza, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.estado = estado;
        this.fechaIngreso = fechaIngreso;
        this.descripcion = descripcion;
        this.sexo = sexo;
        this.raza = raza;
        this.edad = edad;
    }




    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Estado getEstado() {
        return estado;
    }

    @Override
    public String toString() {
        return "Animales{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", raza='" + raza + '\'' +
                ", sexo='" + sexo + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", fechaIngreso=" + fechaIngreso +
                ", estado=" + estado +

                '}';
    }
}
