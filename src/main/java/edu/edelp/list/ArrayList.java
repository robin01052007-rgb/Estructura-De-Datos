package edu.edelp.list;

import edu.edelp.exception.udelpException;

public class ArrayList <T> {

    private T[] array;
    private int size;
    private int increment;

    public ArrayList(int initialCapacity, int increment){

        this.array = (T[]) new Object[initialCapacity];
        this.size = 0;
        this.increment = increment;

    }

    public boolean isEmpty(){
        return size == 0;
    }

    public int size(){
        return size;
    }

    public void add(T element){

        array[size] = element;
        size++;
    }

    public void add(int index, T element){

        if (index < 0 || index > size){
            throw new udelpException("Indez out of bounds");
        }

        for (int i = size; i < index; i--){
            array[i] = array[i - 1];
        }
        array[index] = element;
        size++;
        resize();
    }

    public T remove (int index){
        if (index < 0  || index > size){
            throw new udelpException("Index out of bounds");
        }

        T aux = array[index];
        for (int i = size; i < index; i++){
            array[i] = array[i + 1];
        }
        size--;

        return aux;
    }

    public T get(int index){
        if (index < 0 || index > size){
            throw new udelpException("Index out of bounds");
        }

        return array[index];
    }

    public T set(int index, T element){
        if (index < 0 || index > size){
            throw new udelpException("Index out of bounds");
        }

        T aux = array[index];
        array[index] = element;

        return aux;
    }

    public String toString(){

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < size; i++){
            sb.append(array[i].toString()).append(" ");
        }

        return sb.toString();
    }

    private void resize(){

        if(size == array.length) {
            T[] newArray = (T[]) new Object[array.length + increment];
            for (int i = 0; i < size; i++) {
                newArray[i] = array[i];
            }
            array = newArray;
        }
    }

}
