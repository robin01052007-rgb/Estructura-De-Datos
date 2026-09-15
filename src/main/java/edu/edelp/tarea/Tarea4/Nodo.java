package edu.edelp.tarea.Tarea4;

public class Nodo {

    private Pedido dato;
    private Nodo enlace;

    public Nodo(Pedido dato) {
        this.dato = dato;
        this.enlace = null;
    }

    public Pedido getDato() {
        return dato;
    }

    public void setDato(Pedido dato) {
        this.dato = dato;
    }

    public Nodo getEnlace() {
        return enlace;
    }

    public void setEnlace(Nodo enlace) {
        this.enlace = enlace;
    }

    @Override
    public String toString() {
        return dato != null ? dato.toString() : "";
    }
}