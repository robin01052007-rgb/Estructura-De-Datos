package edu.edelp.nodo;

import edu.edelp.model.Pagina;

public class NodoPagina {

    private Pagina Dato;

    private NodoPagina enlace;


    public NodoPagina(Pagina pagina){
        this.Dato = pagina;
    }

    public Pagina getPagina() {
        return Dato;
    }

    public void setPagina(Pagina pagina) {
        this.Dato = pagina;
    }

    public NodoPagina getEnlace() {
        return enlace;
    }

    public void setEnlace(NodoPagina enlace) {
        this.enlace = enlace;
    }

    @Override
    public String toString(){
        return this.Dato.toString();
    }
}
