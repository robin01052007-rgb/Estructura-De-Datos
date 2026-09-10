package edu.edelp.model;

public class Alumno {

    private String nombre;

    private String tramite;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTramite() {
        return tramite;
    }

    public void setTramite(String tramite) {
        this.tramite = tramite;
    }

    @Override
    public String toString() {
        return "Alumno{" + "nombre='" + nombre + '\'' + ", tramite='" + tramite + '\'' + '}';
    }
}
