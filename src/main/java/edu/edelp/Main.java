package edu.edelp;

import edu.edelp.nodo.Nodo;

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


    }
}