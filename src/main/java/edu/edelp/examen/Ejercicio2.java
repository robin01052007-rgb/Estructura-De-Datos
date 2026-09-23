package edu.edelp.examen;

import java.util.Scanner;
import edu.edelp.ejercicios.ServicioHospital;
import edu.edelp.model.Paciente;

public class Ejercicio2 {


    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean flag = true;

        ServicioHospital servicioHospital = new ServicioHospital();




        do {
            System.out.println("--- Servicio de Hospital --- ");
            System.out.println("1. Ingresar Paciente");
            System.out.println("2. Atender Paciente");
            System.out.println("3. Mostrar Alumnos Pendientes");
            System.out.println("4. Salir");

            String opcion = sc.nextLine();
            switch (opcion){
                case "1":
                    System.out.print("Ingrese el nombre del Paciente: ");
                    String Nombre = sc.nextLine();

                    System.out.print("Ingrese edad del Paciente: ");
                    int edad = sc.nextInt();

                    System.out.print("\nIngrese Motivo: ");
                    String motivo = sc.nextLine();

                    System.out.print("Tipo de paciente: ");
                    int tipo = sc.nextInt();


                    Paciente paciente = new Paciente();

                    ServicioHospital.formarPaciente(paciente);


                    break;
                case "2":
                    ServicioHospital.atenderPaciente();
                    ServicioHospital.terminarAtencionPaciente();
                    break;
                case "3":
                    System.out.println(ServicioHospital.mostrarPacientesPendientes());
                    break;
                case "4":
                    flag = false;
                    break;
                default:
                    System.out.println("Opcion no valida");

            }
        } while (flag);
    }
}
