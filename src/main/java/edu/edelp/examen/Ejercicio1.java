package edu.edelp.examen;

import edu.edelp.stack.StackString;
import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StackString pila = new StackString();
        StackString pila2 = new StackString();
        StringBuilder palabra = null;

        boolean activo = true;

        while (activo) {

            System.out.println("\n--- Editor con deshacer ---");
            System.out.println("1. Agregar (1 Palabra)");
            System.out.println("2. Eliminar ultima palabra");
            System.out.println("3. Deshacer");
            System.out.println("4. Mostrar Pila");
            System.out.println("5. Salir");
            int opcion = sc.nextInt();

            switch (opcion){
                case 1:

                    System.out.println("--- Agregue Palabra ---");
                    sc.nextLine();
                    String texto = sc.nextLine();
                    pila.push(texto);
                    break;

                case 2:

                    System.out.println("--- Eliminando ultima palabra ----");
                    if(!pila.isEmpty()){
                        String p = pila.pop();
                        pila2.push(p);

                    }

                    break;
                case 3:
                    if(pila.isEmpty()){
                        System.out.println("No existen operaciones para deshacer");
                    } else if (!pila2.isEmpty()){
                        String p = pila2.pop();
                        pila.push(p);
                    } else if (pila2.isEmpty()) {
                        pila.pop();

                    }

                    break;
                case 4:
                    if (pila.isEmpty()){
                        System.out.println("La Pila esta vacia");
                    } else {
                        pila.mostrarPila();
                    }
                    break;
                case 5:
                    activo = false;
                    break;
                default:
                    System.out.println("Esta opcion no valida, intente de nuevo");

            }


        }

    }
}
