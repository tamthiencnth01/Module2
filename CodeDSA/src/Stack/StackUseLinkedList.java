package Stack;

import java.util.LinkedList;

public class StackUseLinkedList<E> {
    private int size;
    public LinkedList<E> stack;

    public StackUseLinkedList() {
        stack = new LinkedList<>();
    }
    public boolean isEmpty(){
        return stack.isEmpty();
    }
    public void push(E e){
        size++;
        stack.addFirst(e);
    }
    public E pop(){
        if (isEmpty()){
            return null;
        }
        size--;
        return stack.removeFirst();
    }
    public E peek(){
        if (isEmpty()){
            return null;
        }
        return stack.get(0);
    }
    public void display(){
        for (int i = 0; i < size; i++) {
            System.out.println(stack.get(i));
        }
    }
}
