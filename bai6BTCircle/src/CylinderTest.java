public class CylinderTest {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder);
        cylinder = new Cylinder(5.0);
        System.out.println(cylinder);
        cylinder = new Cylinder(6.0, "red",7.0);
        System.out.println("Ban kinh la:" + cylinder.getRadius());
        System.out.println("Chieu cao la: "+cylinder.getHeight());
        System.out.println("The tich la: "+ cylinder.getVolume());
    }
}
