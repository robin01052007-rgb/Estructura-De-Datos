package edu.edelp.queue;

import edu.edelp.nodo.Nodo;
import edu.edelp.exception.udelpException;

public class Queue<T> {

    private Nodo<T> front;
    private Nodo<T> rear;
    private int size;

    public Queue() {
        this.front = null;
        this.rear = null;
        this.size = 0;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public int size() {
        return size;
    }

    // CORREGIDO: Ahora recibe 'T valor' en vez de 'int valor'
    public void enqueue(T valor) {
        Nodo<T> nuevo = new Nodo<>(valor);
        if (isEmpty()) {
            front = nuevo;
            rear = nuevo;
        } else {
            rear.setEnlace(nuevo);
            rear = nuevo;
        }
        size++;
    }

    public T dequeue() {
        if (isEmpty()) {
            throw new udelpException("Cola vacia");
        }

        T valor = front.getDato();
        front = front.getEnlace();
        size--; // CORREGIDO: Resta el tamaño al sacar un elemento

        return valor;
    }

    public T peek() {
        if (isEmpty()) {
            throw new udelpException("Cola Vacia");
        }
        return front.getDato();
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        Nodo<T> aux = front;
        while (aux != null) {
            s.append(aux.getDato()).append(" < ");
            aux = aux.getEnlace();
        }
        return s.toString();
    }
}