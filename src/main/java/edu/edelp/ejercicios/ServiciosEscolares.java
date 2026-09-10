package edu.edelp.ejercicios;

import edu.edelp.model.Alumno;
import edu.edelp.queue.Queue;
import edu.edelp.exception.udelpException;

public class ServiciosEscolares {

    private Queue <Alumno> queue;

    private Alumno caja = null;

    public ServiciosEscolares(){

        queue = new Queue<>();
    }

    public void formarAlumno(Alumno a){
        if(null == a){
            queue.enqueue(a);
        }

    }

    public void atenderAlumno(){
        try{
            caja = queue.dequeue();

        } catch (udelpException e){
            System.out.println("Sin alumno");
        }

    }

    public void terminarAtencionAlumno(){
        caja = null;
    }

    public String mostrarProximoAlumno(){
        StringBuilder builder = new StringBuilder();

        Alumno a = queue.peek();

        builder.append("--------------\n");
        builder.append("Nombre:" + a.getNombre()).append("\n");
        builder.append("Tramite:" + a.getTramite()).append("\n");

        return builder.toString();
    }

    public String mostrarCaja(){
        StringBuilder builder = new StringBuilder();

        if(null == caja){
            builder.append("Sin alumnos por atender");
        } else {
            builder.append("-------------\n");
            builder.append("Nombre: ").append(caja.getNombre()).append("\n");
            builder.append("Tramite: ").append(caja.getTramite()).append("\n");
        }

        builder.append("--------------\n");
        builder.append("Nombre:" + caja.getNombre()).append("\n");
        builder.append("Tramite:" + caja.getTramite()).append("\n");

        return builder.toString();
    }

    public String mostrarAlumnosPendientes(){
        return queue.toString();
    }

}
