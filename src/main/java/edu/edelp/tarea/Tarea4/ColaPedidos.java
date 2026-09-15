package edu.edelp.tarea.Tarea4;

public class ColaPedidos {
    private Nodo frente;
    private Nodo fin;

    public ColaPedidos() {
        this.frente = null;
        this.fin = null;
    }

    public boolean isEmpty() {
        return frente == null;
    }

    public void enqueue(Pedido pedido) {
        Nodo nuevo = new Nodo(pedido);
        if (isEmpty()) {
            frente = nuevo;
            fin = nuevo;
        } else {
            fin.setEnlace(nuevo);
            fin = nuevo;
        }
    }

    public Pedido dequeue() {
        if (isEmpty()) {
            return null;
        }

        Pedido pedidoAtendido = frente.getDato();
        frente = frente.getEnlace();

        if (frente == null) {
            fin = null;
        }

        return pedidoAtendido;
    }

    public Pedido peek() {
        if (isEmpty()) {
            return null;
        }
        return frente.getDato();
    }

    public void mostrar() {
        if (isEmpty()) {
            System.out.println("No hay pedidos pendientes.");
            return;
        }
        Nodo actual = frente;
        while (actual != null) {
            System.out.println(actual.getDato().getNumero() + " - " + actual.getDato().getPlatillo());
            actual = actual.getEnlace();
        }
    }

    public Pedido buscar(int numero) {
        Nodo actual = frente;
        while (actual != null) {
            if (actual.getDato().getNumero() == numero) {
                return actual.getDato();
            }
            actual = actual.getEnlace();
        }
        return null;
    }

    public int calcularTiempoTotal() {
        int total = 0;
        Nodo actual = frente;
        while (actual != null) {
            total += actual.getDato().getTiempoEstimado();
            actual = actual.getEnlace();
        }
        return total;
    }

    public Pedido obtenerMayorTiempo() {
        if (isEmpty()) {
            return null;
        }

        Nodo actual = frente;
        Pedido mayor = frente.getDato();

        while (actual != null) {
            if (actual.getDato().getTiempoEstimado() > mayor.getTiempoEstimado()) {
                mayor = actual.getDato();
            }
            actual = actual.getEnlace();
        }
        return mayor;
    }
}