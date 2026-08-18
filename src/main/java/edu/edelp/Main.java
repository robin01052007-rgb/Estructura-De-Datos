package edu.edelp;

import edu.edelp.nodo.Nodo;
import edu.edelp.stack.ArrayStack;

public class Main {
    public static void main(String[] args){
        Nodo nodo = new Nodo(10);
        Nodo nodo2 = new Nodo(20);
        Nodo nodo3 = new Nodo(30);

        nodo.setEnlace(nodo2);
        nodo2.setEnlace(nodo3);

        Nodo actual = nodo;

        while (actual != null){

            System.out.println(actual.getDato());
            actual = actual.getEnlace();
        }

        //Mandar llamar el arraystack
        // CLASE ARRAYSATCK
        IO.println("\n<< ARRAYSTACK >>");
        ArrayStack arrayStack = new ArrayStack(10);

        arrayStack.push(10);
        IO.println(arrayStack.toString());
        arrayStack.push(20);
        IO.println(arrayStack.toString());
        arrayStack.push(30);
        IO.println(arrayStack.toString());


    }
}