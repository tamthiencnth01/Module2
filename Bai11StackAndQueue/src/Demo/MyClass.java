package Demo;

public class MyClass<E> {
    private int size;
    public static final int DEFAULTCAPACITY = 10;
    private E[] elements;

    public MyClass() {
        elements =(E[]) new Object[DEFAULTCAPACITY];
    }

    boolean isEmpty(){
        if (size<=0){
            return false;
        }
        return true;
    }
    public E pop(){
        if (size<=0){
            System.out.println("Stack is empty");
            return null;
        }
            return elements[--size];


    }
    public void push(E entry){
        if(size>=DEFAULTCAPACITY){
            System.out.println("Stack Overflow");
        }
        else {
            elements[size++]= entry;
        }
    }
    public E peek(){
        if (size<0){
            System.out.println("Stack is empty");
            return null;
        }
        else {
            return elements[size-1];
        }
    }
    public void display(){
        for (int i = 0; i < size; i++) {
            System.out.println(elements[i]+" ");
        }
    }
}
