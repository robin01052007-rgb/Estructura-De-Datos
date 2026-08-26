package edu.edelp.ejercicios;

import edu.edelp.stack.ArrayStack;

import java.util.Locale;

public class palindromo {

    public boolean evalua(String palabra){
        String revez = "";
        String palabrasSinEspacios = palabra.replaceAll("","").toUpperCase(Locale.ROOT);
        ArrayStack stack = new ArrayStack(palabrasSinEspacios.length());

        for (int i = 0; i < palabrasSinEspacios.length(); i++){
            stack.push(palabrasSinEspacios.charAt(i));
        }

        for (int i = 0; i < palabrasSinEspacios.length(); i++){
            revez += stack.pop();
        }

        if (palabrasSinEspacios == revez){
            return true;
        }

        return palabra.equals(revez);
    }

}
