package edu.edelp.tarea.Tarea3;

import edu.edelp.exception.udelpException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("===== CALCULADORA RPN =====");
        System.out.println("Ingresa una expresión:");
        String expresion = sc.nextLine();

        try {
            ConversorRPN conversor = new ConversorRPN();
            String postfija = conversor.convertirAPostfija(expresion);
            double resultado = conversor.evaluarPostFija(postfija);


            System.out.println("Expresión infija:");
            System.out.println(expresion);

            System.out.println("Expresión postfija::");
            System.out.println(postfija);

            System.out.println("Resultado: ");
            System.out.println(resultado);
        } catch (udelpException e){
            System.out.println(e.getMessage());
        }


    }

}
