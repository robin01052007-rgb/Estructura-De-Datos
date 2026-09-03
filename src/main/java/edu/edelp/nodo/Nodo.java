package edu.edelp.nodo;

public class Nodo<T> {

    private T dato;
    private Nodo<T> enlace;

    public Nodo(T dato) {
        this.dato = dato;
        this.enlace = null;
    }

    // Retorna T (el objeto o dato real), NO int
    public T getDato() {
        return dato;
    }

    public void setDato(T dato) {
        this.dato = dato;
    }

    public Nodo<T> getEnlace() {
        return enlace;
    }

    public void setEnlace(Nodo<T> enlace) {
        this.enlace = enlace;
    }

    @Override
    public String toString() {
        return dato != null ? dato.toString() : "";
    }
}