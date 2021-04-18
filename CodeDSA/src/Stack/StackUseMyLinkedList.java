package Stack;
import com.thien.MyLinkedList;
import org.w3c.dom.Node;

public class StackUseMyLinkedList<E> {
    private MyLinkedList<E> stack;

    public StackUseMyLinkedList() {
        stack = new MyLinkedList<>();
    }
    public boolean isEmpty(){
        return stack.isEmpty();
    }
    public void push(E e){
        stack.addLast(e);
    }
    public E pop(){
        if (isEmpty()){
            return null;
        }
        return stack.removeLast();
    }
    public E peek(){
        if (isEmpty()){
            System.out.println("Stack is Empty");
            return null;
        }
        else{
            return stack.get(stack.size()-1);
        }

    }
    public void display(){
        for (int i = 0; i < stack.size(); i++) {
            System.out.println(stack.get(i));
        }
      //  System.out.println(stack.get(0));
    }
}
