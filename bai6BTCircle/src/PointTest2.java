public class PointTest2 {
    public static void main(String[] args) {
        Point point = new Point();
        System.out.println(point);
        point = new Point(2,3);
        float[] arr1 = point.getXY();
        System.out.println(point);
        System.out.println(point.toString());
        System.out.println(arr1[0] + arr1[1]);
        MoveablePoint moveablePoint = new MoveablePoint();
        System.out.println(moveablePoint);
        point = new Point(2,3);
        moveablePoint = new MoveablePoint(5,6,7,8);
        System.out.println(moveablePoint);
        System.out.println(moveablePoint.move());
    }
}
