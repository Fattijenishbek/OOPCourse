package shapes;

public class Square extends Rectangle {
    protected double side;
    public Square(){}
    public Square(double side){
        this.width=side;
        this.length=side;
    }
    public Square(double side, String color, boolean filled){
        super(side, side, color, filled);
        this.side = side;
    }
    public double getSide(){
        return side;
    }
    public void setSide(double side){
        this.side = side;
    }

    public void setWidth(double side){
        this.width=side;
    }
    public void setLength(double side){
        this.length=side;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                ", width=" + width +
                ", length=" + length +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}
