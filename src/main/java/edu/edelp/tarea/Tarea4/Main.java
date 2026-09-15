package edu.edelp.tarea.Tarea4;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ColaPedidos cola = new ColaPedidos();
        int opcion = 0;

        do {
            System.out.println("\n===== PEDIDOS DE COCINA =====");
            System.out.println("1. Registrar pedido");
            System.out.println("2. Preparar siguiente pedido");
            System.out.println("3. Consultar siguiente pedido");
            System.out.println("4. Mostrar pedidos pendientes");
            System.out.println("5. Buscar pedido por número");
            System.out.println("6. Mostrar tiempo total pendiente");
            System.out.println("7. Salir");
            System.out.println("8. Mostrar pedido con mayor tiempo de preparación");
            System.out.print("Seleccione una opción: ");

            try {
                opcion = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                opcion = 0;
            }

            switch (opcion) {
                case 1:
                    System.out.print("Número de pedido: ");
                    int num = Integer.parseInt(scanner.nextLine());
                    System.out.print("Nombre del cliente: ");
                    String cliente = scanner.nextLine();
                    System.out.print("Platillo: ");
                    String platillo = scanner.nextLine();
                    System.out.print("Cantidad: ");
                    int cant = Integer.parseInt(scanner.nextLine());
                    System.out.print("Tiempo estimado (min): ");
                    int tiempo = Integer.parseInt(scanner.nextLine());

                    cola.enqueue(new Pedido(num, cliente, platillo, cant, tiempo));
                    System.out.println("¡Pedido registrado exitosamente!");
                    break;

                case 2:
                    Pedido atendido = cola.dequeue();
                    if (atendido != null) {
                        System.out.println("Preparando pedido " + atendido.getNumero());
                        System.out.println("Cliente: " + atendido.getCliente());
                        System.out.println("Platillo: " + atendido.getPlatillo());
                    } else {
                        System.out.println("No hay pedidos en la cola.");
                    }
                    break;

                case 3:
                    Pedido siguiente = cola.peek();
                    if (siguiente != null) {
                        System.out.println("Siguiente pedido:");
                        System.out.println(siguiente);
                    } else {
                        System.out.println("No hay pedidos pendientes.");
                    }
                    break;

                case 4:
                    System.out.println("--- Lista de Pedidos ---");
                    cola.mostrar();
                    break;

                case 5:
                    System.out.print("Ingrese número a buscar: ");
                    int idBuscar = Integer.parseInt(scanner.nextLine());
                    Pedido encontrado = cola.buscar(idBuscar);
                    if (encontrado != null) {
                        System.out.println("Pedido encontrado: " + encontrado);
                    } else {
                        System.out.println("Pedido no encontrado.");
                    }
                    break;

                case 6:
                    System.out.println("Tiempo total pendiente: " + cola.calcularTiempoTotal() + " minutos");
                    break;

                case 7:
                    System.out.println("Saliendo del sistema...");
                    break;

                case 8:
                    Pedido mayor = cola.obtenerMayorTiempo();
                    if (mayor != null) {
                        System.out.println("Pedido que requiere más tiempo:");
                        System.out.println(mayor);
                    } else {
                        System.out.println("No hay pedidos pendientes.");
                    }
                    break;

                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 7);

    }
}
