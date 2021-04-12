public class ComparableRectangleTest {
    public static void main(String[] args) {
        ComparableRectangle[] comparableRectangles = new ComparableRectangle[3];
        comparableRectangles[0] = new ComparableRectangle(7,8);
        comparableRectangles[1] = new ComparableRectangle();
        comparableRectangles[2] =new ComparableRectangle("red",false,5,6);
        System.out.println("Pre sorted");
        for (ComparableRectangle compareble: comparableRectangles
             ) {
            System.out.println(compareble);
            
        }
    }
}
