package edu.edelp.tarea.Tarea2;

public class Nodo {
    private Paquetes paquete;
    private Nodo enlace;

    public Nodo(Paquetes paquete) {
        this.paquete = paquete;
        this.enlace = null;
    }

    public Paquetes getPaquete() {
        return paquete;
    }

    public void setPaquete(Paquetes paquete) {
        this.paquete = paquete;
    }

    public Nodo getEnlace() {
        return enlace;
    }

    public void setEnlace(Nodo enlace) {
        this.enlace = enlace;
    }
}