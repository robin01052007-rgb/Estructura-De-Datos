package edu.edelp.tarea.Tarea2;

public class Paquetes {

    private int id;
    private String descripcion;
    private double peso;

    public Paquetes(int id, String descripcion, double peso) {
        this.id = id;
        this.descripcion = descripcion;
        this.peso = peso;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "ID: " + id + "\nDescripción: " + descripcion + "\nPeso: " + peso + " kg";
    }
}