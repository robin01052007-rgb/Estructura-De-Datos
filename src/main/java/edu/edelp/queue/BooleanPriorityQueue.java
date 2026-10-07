package edu.edelp.queue;

import edu.edelp.exception.udelpException;
import edu.edelp.queue.PriorityNodo;

public class BooleanPriorityQueue <T> {
    // ATRIBUTOS
    private PriorityNodo<T> front;
    private PriorityNodo<T> rear;
    private int size;

    // CONSTRUCTOR
    public BooleanPriorityQueue(){
        this.front = null;
        this.rear = null;
        this.size = 0;
    }

    // isEmpty() --> está vacía o no la cola
    public boolean isEmpty(){
        return front == null;
    }

    // size() --> tamaño de la cola
    public int size(){
        return size;
    }

    // enqueue() --> agreagar al final de la cola
    public void enqueue(T valor, boolean priority){
        PriorityNodo<T> nuevo = new PriorityNodo<>(valor, priority);

        if(isEmpty()){
            front = nuevo;
            rear = nuevo;

        } else {
            if(!priority){
                rear.setEnlace(nuevo);
                rear = nuevo;
            } else {
                // Comparar valores de la cola
                //  - actual = toma el valor del 'front'
                //  - aux = toma el valor enterior del 'front'
                PriorityNodo<T> actual = front;
                PriorityNodo<T> anterior = null;

                while(actual != null && actual.getPriority()){
                    anterior = actual;
                    actual = actual.getEnlace();
                }

                if(actual == null){
                    rear.setEnlace(nuevo);
                    rear = nuevo;

                } else {
                    nuevo.setEnlace(actual);

                    if(null != anterior){
                        anterior.setEnlace(nuevo);
                    } else {
                        front = nuevo;
                    }
                }
            }
        }
        size++;
    }

    // dequeue() --> recorrer la cola de atrás hacia enfrente
    public T dequeue(){
        if(isEmpty()){
            throw new udelpException("[!] LA COLA SE ENCUENTRA VACÍA [!]");
        }

        T valor = front.getDato();
        front = front.getEnlace();
        size--;

        if(null == front){
            rear = null;
        }

        return valor;
    }

    // peek() --> solicitar el elemento del frente
    public T peek(){
        if(isEmpty()){
            throw new udelpException("[!] LA COLA SE ENCUENTRA VACÍA [!]");
        }

        return front.getDato();
    }

    // toString() -->
    public String imprimir(){
        StringBuilder s = new StringBuilder();
        PriorityNodo<T> aux = front;

        while (aux != null){
            s.append(aux.getDato()).append(" < ");
            aux = aux.getEnlace();
        }

        return s.toString();
    }

}
