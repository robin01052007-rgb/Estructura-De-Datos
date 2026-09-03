package edu.edelp.stack;

import edu.edelp.exception.udelpException;
import edu.edelp.nodo.Nodo;

public class Stack {

    private Nodo<Integer> top; // Especificamos <Integer>
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

        Nodo<Integer> nuevo = new Nodo<>(dato); // Especificamos <Integer>
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
        Nodo<Integer> aux = top; // Especificamos <Integer>
        while(aux != null) {
            s.append(aux.getDato()).append(" > ");
            aux = aux.getEnlace();
        }

        return s.toString();
    }
}