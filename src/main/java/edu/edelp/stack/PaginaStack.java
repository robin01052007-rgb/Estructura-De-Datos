package edu.edelp.stack;

import edu.edelp.exception.udelpException;
import edu.edelp.model.Pagina;
import edu.edelp.nodo.NodoPagina;

public class PaginaStack {

    private NodoPagina top;
    private int size;

    public PaginaStack(){
        top = null;
        size = 0;
    }

    public int size(){
        return size;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public Pagina peek(){
        if(isEmpty()){
            throw new udelpException("Pila vacia");
        }
        return top.getPagina();
    }

    public void push(Pagina pagina){

        NodoPagina nuevo = new NodoPagina(pagina);
        if (top != null) {
            nuevo.setEnlace(top);
        }

        top = nuevo;
        size++;

    }

    public Pagina pop(){

        if (isEmpty()){
            throw new udelpException("Pila vacia");
        }

        Pagina pagina = top.getPagina();
        top = top.getEnlace();
        size--;
        return pagina;

    }

    @Override
    public String toString(){

        StringBuilder s = new StringBuilder();
        NodoPagina aux = top;
        while(aux != null) {
            s.append(aux.getPagina()).append(" > ");
            aux = aux.getEnlace();
        }

        return s.toString();
    }

}