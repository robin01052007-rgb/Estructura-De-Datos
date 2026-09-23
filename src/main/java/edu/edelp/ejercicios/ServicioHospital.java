package edu.edelp.ejercicios;

import edu.edelp.exception.udelpException;

import edu.edelp.model.Paciente;
import edu.edelp.queue.Queue;

public class ServicioHospital {

    private static Queue<Paciente> queue;
    private static Paciente caja = null;

    public ServicioHospital(){

        queue = new Queue<>();
    }

    public static void formarPaciente(Paciente a){
        if(null == a){
            queue.enqueue(a);
        }

    }

    public static void atenderPaciente(){
        try{
            caja = queue.dequeue();

        } catch (udelpException e){
            System.out.println("Sin alumno");
        }

    }

    public static void terminarAtencionPaciente(){
        caja = null;
    }

    public static String mostrarPacientesPendientes() {
        return queue.toString();
    }

    public String mostrarProximoPaciente(){
        StringBuilder builder = new StringBuilder();

        Paciente a = queue.peek();

        builder.append("--------------\n");
        builder.append("Nombre:" + a.getNombre()).append("\n");
        builder.append("Motivo:" + a.getMotivo()).append("\n");

        return builder.toString();
    }

    public String mostrarAlumnosPendientes(){
        return queue.toString();
    }
}
