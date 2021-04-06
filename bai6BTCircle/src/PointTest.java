public class PointTest {
    public static void main(String[] args) {
        Point2D p2a = new Point2D(1, 2);
        System.out.println(p2a);
        p2a = new Point2D();



        System.out.println(p2a);
        p2a.setXY(3, 4);
        float[] arr = p2a.getXY();
        System.out.println(p2a);
        System.out.println("x is: "+p2a.getX());
        System.out.println("y is: "+p2a.getY());
        System.out.println("xy is: "+ arr[0]+ " " + arr[1]);
        //Test Point 3d
        Point3D point3D = new Point3D(1,2,3);
        System.out.println(point3D);
        point3D =  new Point3D();
        System.out.println(point3D);
        point3D.setX(21);
        point3D.setY(22);
        point3D.setZ(23);
        float[] arr1 = point3D.getXYZ();
        System.out.println(point3D);
        System.out.println("x is: "+ point3D.getX());
        System.out.println("y is: "+ point3D.getY());
        System.out.println("z is: "+ point3D.getZ());
        System.out.println("xy is: "+ arr1[0]+ " " + arr1[1]+ " "+arr1[2]);
    }
}
