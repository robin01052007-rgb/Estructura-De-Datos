package edu.edelp;

import edu.edelp.exception.udelpException;

public class ColaCircular <T> {

    private T[] queue;
    private int size;
    private int front;
    private int rear;

    private ColaCircular(int size){
        this.queue = (T[]) new Object[size];
        this.size = 0;
        this.front = 0;
        this.rear = 0;
    }

    private boolean isEmpty(){
        return size == 0;
    }

    private boolean isFull(){
        return size == queue.length;
    }

    private int size(){
        return size;
    }

    public void enqueue(T element){

        if(isFull()){
            throw new udelpException("Cola llena");
        }
        queue[rear] = element;

    }

    public T dequeue(){

    }

    public T peek (){
        if(isEmpty()){
            throw new udelpException("Cola vacia");
        }

        return queue[front];
    }

    @Override
    public String toString(){
        int i = front;
        int count = 0;
        while(count < size){
            sb.append(queue[i].toString());
            i = (i + 1) % queue.length;
            count++;
        }

        return sb.toString();
    }


}
