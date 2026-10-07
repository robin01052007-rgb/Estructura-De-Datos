package edu.edelp.queue;

public class PriorityNodo <T> {
    // ATRIBUTOS
    private T dato;
    private boolean priority;
    private PriorityNodo enlace;

    // CONSTRUCTOR COMPLETO
    public PriorityNodo(T dato, boolean priority) {
        this.dato = dato;
        this.priority = priority;
        this.enlace = null;
    }

    // CONSTRUCTOR SOLO DATO (Prioridad por defecto: false)
    public PriorityNodo(T dato) {
        this(dato, false);
    }

    // GETTERS Y SETTERS
    public T getDato() {
        return dato;
    }

    public void setDato(T dato) {
        this.dato = dato;
    }

    public boolean getPriority() {
        return priority;
    }

    public void setPriority(boolean priority) {
        this.priority = priority;
    }

    public PriorityNodo getEnlace() {
        return enlace;
    }

    public void setEnlace(PriorityNodo enlace) {
        this.enlace = enlace;
    }
}
