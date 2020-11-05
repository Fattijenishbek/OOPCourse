package methodOverloading;

public class MyPointDriver {
    public static void main(String[] args) {
        int x=1;
        int y=1;
        MyPoint[] points = new MyPoint[10];
        for (int i = 0; i < points.length; i++) {
            points[i] = new MyPoint(x,y);
            x++;
            y++;
        }
        for (int i = 0; i <points.length ; i++) {
            System.out.println(points[i].distance(5,2));
        }
    }
}
