package edu.edelp.queue;

import edu.edelp.exception.udelpException;
import java.util.Comparator;

public class PriorityQueue<T> {
    // ATRIBUTOS
    private PriorityNodo<T> front;
    private PriorityNodo<T> rear;
    private int size;
    private Comparator<T> comparator; // <- Nuevo atributo para manejar la prioridad

    // CONSTRUCTOR 1: Recibe un comparador personalizado
    public PriorityQueue(Comparator<T> comparator) {
        this.front = null;
        this.rear = null;
        this.size = 0;
        this.comparator = comparator;
    }

    // CONSTRUCTOR 2: Si los elementos implementan Comparable (orden natural)
    @SuppressWarnings("unchecked")
    public PriorityQueue() {
        this((o1, o2) -> ((Comparable<T>) o1).compareTo(o2));
    }

    // isEmpty() --> está vacía o no la cola
    public boolean isEmpty() {
        return front == null;
    }

    // size() --> tamaño de la cola
    public int size() {
        return size;
    }

    // enqueue() --> agregar según el orden del Comparator
    public void enqueue(T valor) {
        PriorityNodo<T> nuevo = new PriorityNodo<>(valor);

        // Caso 1: La cola está vacía
        if (isEmpty()) {
            front = nuevo;
            rear = nuevo;
        }
        // Caso 2: El nuevo elemento tiene MAYOR prioridad que el 'front' (va al inicio)
        // (Asumiendo que compare < 0 significa mayor prioridad)
        else if (comparator.compare(valor, front.getDato()) < 0) {
            nuevo.setEnlace(front);
            front = nuevo;
        }
        // Caso 3: Buscar la posición correcta en el medio o al final
        else {
            PriorityNodo<T> actual = front;
            PriorityNodo<T> anterior = null;

            // Avanzar mientras el nuevo valor tenga MENOR o IGUAL prioridad que el nodo actual
            while (actual != null && comparator.compare(valor, actual.getDato()) >= 0) {
                anterior = actual;
                actual = actual.getEnlace();
            }

            // Insertar entre 'anterior' y 'actual'
            nuevo.setEnlace(actual);
            anterior.setEnlace(nuevo);

            // Si se insertó al final de la cola, actualizar 'rear'
            if (actual == null) {
                rear = nuevo;
            }
        }
        size++;
    }

    // dequeue() --> eliminar y retornar el elemento con mayor prioridad (frente)
    public T dequeue() {
        if (isEmpty()) {
            throw new udelpException("[!] LA COLA SE ENCUENTRA VACÍA [!]");
        }

        T valor = front.getDato();
        front = front.getEnlace();
        size--;

        if (null == front) {
            rear = null;
        }

        return valor;
    }

    // peek() --> solicitar el elemento del frente
    public T peek() {
        if (isEmpty()) {
            throw new udelpException("[!] LA COLA SE ENCUENTRA VACÍA [!]");
        }

        return front.getDato();
    }

    // imprimir()
    public String imprimir() {
        StringBuilder s = new StringBuilder();
        PriorityNodo<T> aux = front;

        while (aux != null) {
            s.append(aux.getDato()).append(" < ");
            aux = aux.getEnlace();
        }

        return s.toString();
    }
}