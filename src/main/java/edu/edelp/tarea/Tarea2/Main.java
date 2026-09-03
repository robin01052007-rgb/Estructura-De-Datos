package edu.edelp.tarea.Tarea2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StackPaquete almacen = new StackPaquete();
        boolean salir = false;

            while (!salir) {
                System.out.println("===== Menu =====");
                System.out.println("1. Registrar Paquete ");
                System.out.println("2. Retirar Paquete ");
                System.out.println("3. Consultar siguiente paquete ");
                System.out.println("4. Mostrar Paquetes ");
                System.out.println("5. Buscar Paquete ");
                System.out.println("6. Salir ");
                int opcion = sc.nextInt();

                switch (opcion) {
                    case 1:
                        //Registrar el paquete

                        System.out.println("ID del Paquete: ");
                        int id = sc.nextInt();
                        sc.nextLine();
                        System.out.println("Descripcion del Paquete: ");
                        String descripcion = sc.nextLine();
                        System.out.println("Peso del paquete: ");
                        double peso = sc.nextDouble();

                        Paquetes nuevoPaquete = new Paquetes(id, descripcion, peso);
                        almacen.push(nuevoPaquete);
                        break;

                    case 2:
                        //Retirar Paquete

                        Paquetes retirado = almacen.pop();
                        if (retirado != null) {
                            System.out.println(retirado);
                        }
                        break;

                    case 3:
                        //Consultar Siguiente Paquete

                        Paquetes siguiente = almacen.peek();
                        if (siguiente != null) {
                            System.out.println(siguiente);
                        }
                        break;

                    case 4:
                        //Mostrar Paquete

                        almacen.mostrar();
                        break;

                    case 5:
                        //Buscar Paquete

                        System.out.println("ID a buscar: ");
                        int idbusqueda = sc.nextInt();
                        almacen.buscar(idbusqueda);
                        break;

                    case 6:
                        //Salir
                        salir = true;
                        break;

                    default:
                        System.out.println("Esta opcion no es posible, Intente de nuevo");
                        break;
                }

        }
    }
}
