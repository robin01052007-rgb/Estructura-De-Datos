package edu.edelp.comparator;

public class NumericComparator implements Comparable <Integer> {


    //compareTo revisa si aplica o no Aplica
    @Override
    public int compareTo(Integer o){

        if(o > 10){
            return 1;
        }
        return -1;
    }



}
