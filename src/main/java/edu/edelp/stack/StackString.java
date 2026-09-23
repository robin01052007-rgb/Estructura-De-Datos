package edu.edelp.stack;

import edu.edelp.nodo.Nodo;

public class StackString {
    private Nodo top;

    public StackString(){
        this.top = null;
    }

    public boolean isEmpty(){
        return top == null;
    }

    public void push(String dato){
        //Paso 1: Crear el nuevo nodo con el dato recibido
        Nodo nuevo = new Nodo(dato);

        //Paso 2: El nuevo nodo apunta al nodo que estaba en la cima
        nuevo.setEnlace(top);

        //Paso 3: La cima ahora pasa a ser el nuevo nodo
        top = nuevo;
    }

    public String pop(){
        //Paso 1: Validar si la pila está vacía (Underflow)
        if (isEmpty()){
            throw new RuntimeException("Underflow: La pila está vacía, no se puede realizar pop");

        }

        //Paso 2: Guardar el dato de la cima actual antes de mover el puntero
        String datoGuardado = String.valueOf(top.getDato());

        //Paso 3: Mover la cima al siguiente nodo (El de abajo)
        top = top.getEnlace();

        //Paso 4: Retornar el dato que extrajiste
        return datoGuardado;
    }

    public String peek(){

        //Paso 1: Verificar si la pila esta vacia
        if (isEmpty()){
            throw new RuntimeException("Underflow: La pila está vacía, no se puede realizar peek");
        }

        //Paso 2: Regresar el dato
        return String.valueOf(top.getDato());
    }

    public void mostrarPila(){
        if (isEmpty()){
            System.out.println("Pila vacía: []");
            return;
        }

        System.out.print("Cima -> ");
        //Creamos una variable auxiliar para recorrer los nodos
        Nodo actual = top;

        while (actual != null){
            System.out.print(" [" + actual.getDato() + "] ->");
            actual = actual.getEnlace();
        }
        System.out.println(" NULL");
    }
}
