import java.util.Arrays;

public class ComparableCircleTest {
    public static void main(String[] args) {
        ComparableCircle[] comparableCircles = new ComparableCircle[3];
        comparableCircles[0] = new ComparableCircle(3.6);
        comparableCircles[1] = new ComparableCircle();
        comparableCircles[2] = new ComparableCircle("red",false,3.5);
        System.out.println("Pre-sorted:");
        for (ComparableCircle comparableCircle: comparableCircles
             ) {
            System.out.println(comparableCircle);
            
        }
        Arrays.sort(comparableCircles);
        System.out.println("After-sorted: ");
        for (ComparableCircle comparableCircle: comparableCircles
        ) {
            System.out.println(comparableCircle);

        }
    }
}
