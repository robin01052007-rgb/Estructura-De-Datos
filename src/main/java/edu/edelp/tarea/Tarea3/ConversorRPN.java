package edu.edelp.tarea.Tarea3;

import edu.edelp.exception.udelpException;

public class ConversorRPN {

    private int prioridad(char op) {
        if (op == '*' || op == '/') {
            return 2;
        } else if (op == '+' || op == '-') {
            return 1;
        } else {
            return 0;
        }
    }

    public String convertirAPostfija(String expresion) {
        Stack<Character> StackOperador = new Stack<>();
        StringBuilder postfija = new StringBuilder();

        for (int i = 0; i < expresion.length(); i++) {
            char c = expresion.charAt(i);

            if (c == ' ') {
                continue;
            }

            if (Character.isDigit(c)) {
                StringBuilder numero = new StringBuilder();

                while (i < expresion.length() && Character.isDigit(expresion.charAt(i))) {
                    numero.append(expresion.charAt(i));
                    i++;
                }
                i--;
                postfija.append(numero).append(" ");

            } else if (c == '(') {
                StackOperador.push(c);
            } else if (c == ')') {
                while (!StackOperador.isEmpty() && StackOperador.peek() != '(') {
                    postfija.append(StackOperador.pop()).append(" ");
                }
                if (StackOperador.isEmpty()) {
                    throw new udelpException("Error: Paréntesis incorrectos.");
                }

                StackOperador.pop();
            } else if (c == '+' || c == '-' || c == '*' || c == '/') {
                while (!StackOperador.isEmpty() && prioridad(StackOperador.peek()) >= prioridad(c)) {
                    postfija.append(StackOperador.pop()).append(" ");
                }
                StackOperador.push(c);
            } else {
                throw new udelpException("Error: Carácter no reconocido '" + c + "'.");
            }
        }

        while (!StackOperador.isEmpty()) {
            if (StackOperador.peek() == '(') {
                throw new udelpException("Error: Paréntesis incorrectos.");
            }
            postfija.append(StackOperador.pop()).append(" ");
        }

        return postfija.toString().trim();
    }

    public double evaluarPostFija(String expresionPostFija) {
        Stack<Double> doubleStack = new Stack<>();
        String[] tokens = expresionPostFija.split(" ");

        for (String token : tokens) {
            if (token.isEmpty()) {
                continue;
            }

            if (token.equals("+")) {
                if (doubleStack.isEmpty()) throw new udelpException("Error: Operadores sin suficientes operandos.");
                double b = doubleStack.pop();
                if (doubleStack.isEmpty()) throw new udelpException("Error: Operadores sin suficientes operandos.");
                double a = doubleStack.pop();
                doubleStack.push(a + b);

            } else if (token.equals("-")) {
                if (doubleStack.isEmpty()) throw new udelpException("Error: Operadores sin suficientes operandos.");
                double b = doubleStack.pop();
                if (doubleStack.isEmpty()) throw new udelpException("Error: Operadores sin suficientes operandos.");
                double a = doubleStack.pop();
                doubleStack.push(a - b);

            } else if (token.equals("*")) {
                if (doubleStack.isEmpty()) throw new udelpException("Error: Operadores sin suficientes operandos.");
                double b = doubleStack.pop();
                if (doubleStack.isEmpty()) throw new udelpException("Error: Operadores sin suficientes operandos.");
                double a = doubleStack.pop();
                doubleStack.push(a * b);

            } else if (token.equals("/")) {
                if (doubleStack.isEmpty()) throw new udelpException("Error: Operadores sin suficientes operandos.");
                double b = doubleStack.pop();
                if (doubleStack.isEmpty()) throw new udelpException("Error: Operadores sin suficientes operandos.");
                double a = doubleStack.pop();

                if (b == 0) {
                    throw new udelpException("Error: División entre cero.");
                }
                doubleStack.push(a / b);

            } else {
                doubleStack.push(Double.parseDouble(token));
            }
        }

        if (doubleStack.isEmpty()) {
            throw new udelpException("Error: Expresión incompleta.");
        }

        double resultado = doubleStack.pop();

        if (!doubleStack.isEmpty()) {
            throw new udelpException("Error: Expresión incompleta.");
        }

        return resultado;
    }
}