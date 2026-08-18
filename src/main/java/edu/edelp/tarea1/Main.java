package edu.edelp.tarea1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] ventas = new int[10];

        System.out.println("Sistema de ventas");
        capturarVentas(ventas, scanner);

        System.out.println("Ventas originales: ");
        mostrarArreglo(ventas);
        System.out.println("\n");

        System.out.println("Ordenando...");
        ordenarBurbuja(ventas);

        System.out.println("Ventas ordenadas:");
        mostrarArreglo(ventas);

        System.out.println("Venta más baja: " + ventas[0]);
        System.out.println("Venta más alta: " + ventas[ventas.length - 1]);
        System.out.println("Promedio de ventas: " + calcularPromedio(ventas));

        scanner.close();
    }

    public static void capturarVentas(int[] arreglo, Scanner sc) {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("Ingrese las ventas del vendedor " + (i + 1) + ": ");
            arreglo[i] = sc.nextInt();
        }
    }

    public static void mostrarArreglo(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + " ");
        }
        System.out.println();
    }

    public static void ordenarBurbuja(int[] arreglo) {
        int n = arreglo.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arreglo[j] > arreglo[j + 1]) {
                    int aux = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = aux;
                }
            }
        }
    }

    public static double calcularPromedio(int[] arreglo) {
        double suma = 0;
        for (int i = 0; i < arreglo.length; i++) {
            suma += arreglo[i];
        }
        return suma / arreglo.length;
    }
}