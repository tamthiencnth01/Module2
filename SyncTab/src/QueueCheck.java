import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class QueueCheck {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            list.add(scanner.nextInt());
        }
        int k = scanner.nextInt();
//        for (int i = 0; i < list.size(); i++) {
//            if (i==k)
//        }
        list.remove(k);

    }
}
