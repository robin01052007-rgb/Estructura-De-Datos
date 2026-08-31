package edu.edelp;

import edu.edelp.model.Pagina;
import edu.edelp.stack.PaginaStack;

import javax.swing.*;

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
        System.out.println(arrayStack.toString());

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

        polindromo pal = new polindromo();

        Stack stack = new Stack();
        imprime(stack);

        stack.push(5);
        imprime(stack);

        stack.push(6);
        imprime(stack);

        stack.push(7);
        imprime(stack);

        stack.push(8);
        imprime(stack);

        stack.pop();
        imprime(stack);

        stack.pop();
        imprime(stack);


    }

    public static void imprime(Stack stack){
        System.out.println("Stack contenido:");
        System.out.println(stack);
        try{
            System.out.println("peek: " + stack.peek());
        } catch (udelpException e) {
            System.out.println("peek: " + e.getMessage());
        }

        System.out.println("Size: " + stack.size()); */

        PaginaStack stack = new PaginaStack();
        PaginaStack stack2 = new PaginaStack();

        String [] opciones = {"Nueva pagina", "Atras", "Actual", "Adelante", "Salir" };
        boolean salir = false;

        while (!salir) {
            int option = JOptionPane.showOptionDialog(null, "Confirma una opcion", "URL",
                    JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, null);

            switch (option) {
                case 0:

                    Pagina nueva = new Pagina();
                    String dato = JOptionPane.showInputDialog(null, "Dame el nombre de la pagina");
                    nueva.setUrl(dato);
                    stack.push(nueva);

                    break;
                case 1:

                    if(!stack.isEmpty()){
                        //stack2.push(stack.pop());
                        Pagina p = stack.pop();
                        stack2.push(p);

                    }

                    break;
                case 2:

                    if(!stack.isEmpty()){
                        JOptionPane.showMessageDialog(null, "Pagina actual: " + stack.peek());
                    }

                    break;
                case 3:

                    if(!stack2.isEmpty()){

                        //stack.push(stack.pop());
                        Pagina p = stack2.pop();
                        stack.push(p);

                    }

                    break;
                case 4:
                    salir = true;
                    break;
                default:
                    salir = true;
                    break;
            }
        }

    }
}