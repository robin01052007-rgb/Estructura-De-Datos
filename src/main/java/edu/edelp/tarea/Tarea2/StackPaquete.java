package edu.edelp.tarea.Tarea2;

public class StackPaquete {

    private Nodo top;
    private int size;

    public StackPaquete() {
        this.top = null;
        this.size = 0;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public int size() {
        return size;
    }

    public void push(Paquetes paquete) {
        Nodo nuevo = new Nodo(paquete);
        if (top != null) {
            nuevo.setEnlace(top);
        }
        top = nuevo;
        size++;
    }

    public Paquetes pop() {
        if (isEmpty()) {
            System.out.println("Error: El almacén está vacío. No hay paquetes para retirar.");
            return null;
        }
        Paquetes paquete = top.getPaquete();
        top = top.getEnlace();
        size--;
        return paquete;
    }

    public Paquetes peek() {
        if (isEmpty()) {
            System.out.println("Error: El almacén está vacío.");
            return null;
        }
        return top.getPaquete();
    }

    public void mostrar() {
        if (isEmpty()) {
            System.out.println("El almacén está vacío.");
            return;
        }

        Nodo aux = top;
        System.out.println("\n=== PAQUETES EN ALMACÉN ===");
        while (aux != null) {
            System.out.println(aux.getPaquete());
            System.out.println("---------------------------------");
            aux = aux.getEnlace();
        }
    }

    public void buscar(int id) {
        if (isEmpty()) {
            System.out.println("El almacén está vacío.");
            return;
        }

        Nodo aux = top;
        while (aux != null) {
            if (aux.getPaquete().getId() == id) {
                System.out.println("\nPaquete encontrado:");
                System.out.println(aux.getPaquete());
                return;
            }
            aux = aux.getEnlace();
        }

        System.out.println("No existe un paquete con el ID " + id + ".");
    }
}