package EighthEx;

public class Square extends Rectangle {

    double side;
    public Square() {
    }

    public Square(double side) {
        this.side = side;
    }

    public Square(String color, boolean filled, double side) {
        this.color = color;
        this.filled = filled;
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public void setWidth(double width) {
        this.setSide(width);
    }

    @Override
    public void setLength(double length) {
        this.setSide(length);
    }

    @Override
    public double getArea() {

        return this.side*this.side;
    }

    @Override
    public double getPerimetr() {

        return this.side*4;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}
