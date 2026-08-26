package edu.edelp;

import edu.edelp.ejercicios.palindromo;
import edu.edelp.ejercicios.parentesis;
import edu.edelp.nodo.Nodo;
import edu.edelp.stack.ArrayStack;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        /*
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

        Mandar llamar el arraystack
        CLASE ARRAYSATCK
        System.out.println("\n<< ARRAYSTACK >>");
        ArrayStack arrayStack = new ArrayStack(10);

        arrayStack.push(10);
        System.out.println(arrayStack.toString());
        arrayStack.push(20);
        System.out.println(arrayStack.toString());
        arrayStack.push(30);
        System.out.println(arrayStack.toString()); */

        //Ejercicio de Parentesis
        String ecuacion = "((5*3)-5)";

        parentesis par = new parentesis();
        boolean validacion = par.evaluar(ecuacion);

        if (validacion = true) {
            boolean resultado = par.evaluar(ecuacion);

            if (resultado) {
                System.out.println("Ecuacion Correcta");
            } else {
                System.out.println("Ecuacion Incorrecta");
            }
        } else {
            System.out.println("La ecuacion no es String");
        }

        //Ejercicio de Polindromo
        String cadena = "";
        Scanner sc = new Scanner(System.in);

        System.out.println("Introdusca una frase");
        cadena = sc.nextLine();

        palindromo pal = new palindromo();



    }
}