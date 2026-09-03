package edu.edelp.nodo;

public class Nodo<T> {

    private T dato;
    private Nodo enlace;

    public Nodo(T dato) {
        this.dato = dato;
        this.enlace = null;
    }

    public int getDato() {
        return (int) dato;
    }

    public Nodo getEnlace() {
        return enlace;
    }

    public void setEnlace(Nodo enlace) {
        this.enlace = enlace;
    }

    public String toString() {
        return dato + " - " +  enlace.toString();
    }
}