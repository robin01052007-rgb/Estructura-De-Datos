package edu.edelp;

import edu.edelp.comparator.NumericComparator;
import edu.edelp.exception.udelpException;
import edu.edelp.list.ArrayList;
import edu.edelp.model.Alumno;
import edu.edelp.model.Pagina;
import edu.edelp.queue.BooleanPriorityQueue;
import edu.edelp.queue.PriorityQueue;
import edu.edelp.queue.Queue;
import edu.edelp.stack.PaginaStack;
import edu.edelp.ejercicios.ServiciosEscolares;

import java.util.Comparator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // TEMA: ARRAYLIST (EJERCICIO ACTIVO)
        ArrayList list = new ArrayList<>(5, 2);

        list.add(1);
        imprimir(list);

        list.add(2);
        imprimir(list);

        list.add(3);
        imprimir(list);

        list.add(4);
        imprimir(list);

        // NOTA: Asegúrate de que tu clase ArrayList tenga implementado el metodo add(index, element)
        list.add(3, 7);
        imprimir(list);

        list.add(-1, 8);
        imprimir(list);

        list.add(5);
        imprimir(list);

        list.add(6);
        imprimir(list);

        // Prioridad: los números más pequeños salen primero
        PriorityQueue<Integer> cola = new PriorityQueue<>(Comparator.naturalOrder());

        cola.enqueue(15);
        cola.enqueue(5);
        cola.enqueue(20);

        System.out.println(cola.imprimir());
// Salida: 5 < 15 < 20 <


        /*
         * TEMA: NODOS ENLAZADOS SIMPLES

        Nodo nodo = new Nodo(10);
        Nodo nodo2 = new Nodo(20);
        Nodo nodo3 = new Nodo(30);

        nodo.setEnlace(nodo2);
        nodo2.setEnlace(nodo3);

        Nodo actual = nodo;

        while (actual != null) {
            System.out.println(actual.getDato());
            actual = actual.getEnlace();
        }
        */


        /*
         * TEMA: PILAS CON ARREGLOS (ARRAYSTACK)
        System.out.println("\n<< ARRAYSTACK >>");
        ArrayStack arrayStack = new ArrayStack(10);

        arrayStack.push(10);
        System.out.println(arrayStack.toString());
        arrayStack.push(20);
        System.out.println(arrayStack.toString());
        arrayStack.push(30);
        System.out.println(arrayStack.toString());
        */


        /*
         * TEMA: EVALUACIÓN DE PARENTESIS (PILAS)
        String ecuacion = "((5*3)-5)";

        parentesis par = new parentesis();
        boolean validacion = par.evaluar(ecuacion);

        if (validacion == true) { // Corregido operador de asignación '=' por comparación '=='
            boolean resultado = par.evaluar(ecuacion);

            if (resultado) {
                System.out.println("Ecuacion Correcta");
            } else {
                System.out.println("Ecuacion Incorrecta");
            }
        } else {
            System.out.println("La ecuacion no es String");
        }
        */


        /*
         * TEMA: PALÍNDROMOS Y MANEJO DE PILA (STACK)

        String cadena = "";
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca una frase:");
        cadena = sc.nextLine();

        polindromo pal = new polindromo();

        Stack stack = new Stack();
        imprimeStack(stack);

        stack.push(5);
        imprimeStack(stack);

        stack.push(6);
        imprimeStack(stack);

        stack.push(7);
        imprimeStack(stack);

        stack.push(8);
        imprimeStack(stack);

        stack.pop();
        imprimeStack(stack);

        stack.pop();
        imprimeStack(stack);
        */


        /*
         * TEMA: PILA APLICADA (HISTORIAL DE PÁGINAS WEB)

        PaginaStack stackPaginas = new PaginaStack();
        PaginaStack stackPaginas2 = new PaginaStack();

        String[] opciones = {"Nueva pagina", "Atras", "Actual", "Adelante", "Salir"};
        boolean salir = false;

        while (!salir) {
            int option = JOptionPane.showOptionDialog(null, "Confirma una opcion", "URL",
                    JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, null);

            switch (option) {
                case 0:
                    Pagina nueva = new Pagina();
                    String dato = JOptionPane.showInputDialog(null, "Dame el nombre de la pagina");
                    nueva.setUrl(dato);
                    stackPaginas.push(nueva);
                    break;
                case 1:
                    if (!stackPaginas.isEmpty()) {
                        Pagina p = stackPaginas.pop();
                        stackPaginas2.push(p);
                    }
                    break;
                case 2:
                    if (!stackPaginas.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Pagina actual: " + stackPaginas.peek());
                    }
                    break;
                case 3:
                    if (!stackPaginas2.isEmpty()) {
                        Pagina p = stackPaginas2.pop();
                        stackPaginas.push(p);
                    }
                    break;
                case 4:
                default:
                    salir = true;
                    break;
            }
        }
        */


        /*
         * TEMA: COLAS (QUEUES) Y COLA CIRCULAR

        Queue q = new Queue<>();
        imprimirQueue(q);

        q.enqueue(6);
        imprimirQueue(q);

        q.enqueue(8);
        imprimirQueue(q);

        q.enqueue(10);
        imprimirQueue(q);

        q.enqueue(12);
        imprimirQueue(q);

        int valor = q.dequeue();
        System.out.println("Salida: " + valor);
        imprimirQueue(q);

        ColaCircular queueCircular = new ColaCircular<>(5);

        queueCircular.enqueue(1);
        imprimirQueueCircular(queueCircular);

        queueCircular.enqueue(2);
        imprimirQueueCircular(queueCircular);

        queueCircular.enqueue(3);
        imprimirQueueCircular(queueCircular);
        */


        /*
         * TEMA: SISTEMA DE SERVICIOS ESCOLARES (SISTEMA DE COLAS)

        Scanner scEscolares = new Scanner(System.in);
        boolean flag = true;

        ServiciosEscolares servicios = new ServiciosEscolares();

        do {
            System.out.println("Seleccione una opcion: ");
            System.out.println("1. Ingresar Alumno");
            System.out.println("2. Atender Alumno");
            System.out.println("3. Terminar atencion Alumno");
            System.out.println("4. Mostrar Alumno Pendiente");
            System.out.println("5. Mostrar Alumno en Caja");
            System.out.println("6. Mostrar proximo Alumno");
            System.out.println("7. Salir\n");

            String opcion = scEscolares.nextLine();
            switch (opcion) {
                case "1":
                    System.out.println("Ingrese el nombre del Alumno");
                    String nombreAlumno = scEscolares.nextLine();

                    System.out.println("Ingrese el tramite del alumno");
                    String tramite = scEscolares.nextLine();

                    Alumno alumno = new Alumno();
                    alumno.setNombre(nombreAlumno);
                    alumno.setTramite(tramite);

                    servicios.formarAlumno(alumno); // Corregido: llamado sobre la instancia instanciada
                    break;

                case "2":
                    servicios.atenderAlumno();
                    break;
                case "3":
                    servicios.terminarAtencionAlumno();
                    break;
                case "4":
                    System.out.println(servicios.mostrarAlumnoPendientes());
                    break;
                case "5":
                    System.out.println(servicios.mostrarCaja());
                    break;
                case "6":
                    System.out.println(servicios.mostrarProximoAlumno());
                    break;
                case "7":
                    flag = false;
                    break;
            }
        } while (flag);
        */


        /*
         * TEMA: COLA CON PRIORIDAD BOOLEANA (BOOLEAN PRIORITY QUEUE)

        BooleanPriorityQueue colaPrioridad = new BooleanPriorityQueue<>();

        colaPrioridad.enqueue(10, false);
        System.out.println(colaPrioridad.toString());
        colaPrioridad.enqueue(20, false);
        System.out.println(colaPrioridad.toString());
        colaPrioridad.enqueue(30, true);
        System.out.println(colaPrioridad.toString());
        colaPrioridad.enqueue(40, false);
        System.out.println(colaPrioridad.toString());
        colaPrioridad.enqueue(50, true);

        System.out.println(colaPrioridad.toString());
        System.out.println("Tamaño de la cola: " + colaPrioridad.size());
        */


        /*
         * TEMA: COMPARADORES (NUMERIC COMPARATOR)

        NumericComparator numericComparator = new NumericComparator();
        int compare = numericComparator.compareTo(15);
        System.out.println(compare);
        */

    } // Fin del main


    //
    // MÉTODOS AUXILIARES DE IMPRESIÓN (IMPRIMIR COMPLETO)


    /*
     * Imprime el contenido de un ArrayList genérico.
     * @param list El ArrayList a imprimir
     */
    public static  void imprimir(ArrayList list) {
        System.out.println("--------------");
        System.out.println(list.toString()); // Corregido invocación de toString()
    }


    /* Métodos auxiliares adicionales encapsulados correctamente para evitar errores sintácticos

    public static void imprimeStack(Stack stack) {
        System.out.println("Stack contenido:");
        System.out.println(stack);
        try {
            System.out.println("peek: " + stack.peek());
        } catch (udelpException e) {
            System.out.println("peek: " + e.getMessage());
        }
    }

    public static void imprimirQueue(Queue queue) {
        System.out.println("--------------");
        System.out.println(queue.toString());
    }

    public static void imprimirQueueCircular(ColaCircular queue) {
        System.out.println("--------------");
        System.out.println(queue.toString());
    }

    public static void imprimirPriorityQueue(BooleanPriorityQueue cola) {
        try {
            System.out.println("--------------");
            System.out.println(cola.toString());
            System.out.println(cola.peek());
            System.out.println();
        } catch (udelpException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    */
}