package edu.edelp.stack;

import edu.edelp.exception.udelpException;
import edu.edelp.nodo.Nodo;

public class Stack {

    private Nodo top;
    private int size;

    public Stack(){
        top = null;
        size = 0;
    }

    public int size(){
        return size;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public int peek(){
        if(isEmpty()){
            throw new udelpException("Pila vacia");
        }
        return top.getDato();
    }

    public void push(int dato){

        Nodo nuevo = new Nodo(dato);
        if (top != null) {
            nuevo.setEnlace(top);
        }

        top = nuevo;
        size++;

    }

    public int pop(){

        if (isEmpty()){
            throw new udelpException("Pila vacia");
        }

        int dato = top.getDato();
        top = top.getEnlace();
        size--;
        return dato;

    }

    @Override
    public String toString(){

        StringBuilder s = new StringBuilder();
        Nodo aux = top;
        while(aux != null) {
            s.append(aux.getDato()).append(" > ");
            aux = aux.getEnlace();
        }

        return s.toString();
    }

}
