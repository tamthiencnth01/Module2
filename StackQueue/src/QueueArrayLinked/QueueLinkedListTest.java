package QueueArrayLinked;

public class QueueLinkedListTest {
    public static void main(String[] args) {
        QueueLinkedList<String> list = new QueueLinkedList<>();
        list.add("Tuyen");
        list.add("Ngon");
        list.add("Nghe");
        list.add("Thu");
        list.add("Cong");
        list.add("Phan");
        list.add("Mem");
        list.remove();
        list.display();
    }
}
