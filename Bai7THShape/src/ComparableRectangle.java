public class ComparableRectangle extends Rectangle implements Comparable<ComparableRectangle>{
    public ComparableRectangle() {
    }

    public ComparableRectangle(double width, double length) {
        super(width, length);
    }

    public ComparableRectangle(String color, boolean filled, double width, double length) {
        super(color, filled, width, length);
    }
    public int compareTo(ComparableRectangle o){
        if ((getLength()>o.getLength())&& (getWidth()>o.getWidth())) return 1;
        else if ((getLength()<o.getLength()) && (getWidth()<o.getWidth())) return -1;
        else return 1;
    }
}
