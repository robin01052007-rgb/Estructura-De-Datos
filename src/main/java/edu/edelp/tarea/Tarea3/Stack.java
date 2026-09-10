package edu.edelp.tarea.Tarea3;

import edu.edelp.exception.udelpException;
import edu.edelp.nodo.Nodo;

public class Stack <T> {

    private Nodo<T> top; // Especificamos <Integer>
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

    public T peek(){
        if(isEmpty()){
            throw new udelpException("Pila vacia");
        }
        return top.getDato();
    }

    public void push(T dato){

        Nodo<T> nuevo = new Nodo<>(dato); // Especificamos <Integer>
        if (top != null) {
            nuevo.setEnlace(top);
        }

        top = nuevo;
        size++;

    }

    public T pop(){

        if (isEmpty()){
            throw new udelpException("Pila vacia");
        }

        T dato = top.getDato();
        top = top.getEnlace();
        size--;
        return dato;

    }

    @Override
    public String toString(){

        StringBuilder s = new StringBuilder();
        Nodo<T> aux = top; // Especificamos <Integer>
        while(aux != null) {
            s.append(aux.getDato()).append(" > ");
            aux = aux.getEnlace();
        }

        return s.toString();
    }
}
