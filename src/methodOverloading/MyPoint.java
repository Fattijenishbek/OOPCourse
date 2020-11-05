package methodOverloading;

public class MyPoint {
    private int x=0;
    private int y=0;

    public MyPoint() {
    }

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int[] getXY() {
        int[] arr = new int[2];
        arr[0]=x;
        arr[1]=y;

        return arr;
    }
    public void setXY(int x,int y) {
        this.x = x;
        this.y = y;
    }
    @Override
    public String toString() {
        return String.format("(%d,%d)",x,y);
    }
    public double distance(int x1, int y1){
        double dis1=Math.sqrt(Math.pow((x-x1),2)+(Math.pow((y-y1),2)));
        return dis1;
    }
    public double distance(MyPoint another){
        double dis2=Math.sqrt(Math.pow((x-another.getX()),2)+(Math.pow((y-another.getY()),2)));
        return dis2;
    }
    public double distance(){
        double dis3=Math.sqrt(Math.pow(x,2)+(Math.pow(y,2)));
        return dis3;
    }
}