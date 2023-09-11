package Circle;

import static java.lang.Math.sin;

public class Circle{
    Point center;
    double R;

    public Circle()
    {
        this.R = 1;
        this.center = new Point(0,0);
    }
    public Circle(double R)
    {
        this.R = R;
        this.center = new Point(0,0);
    }
    public Circle(double R, double x, double y)
    {
        this.R = R;
        this.center = new Point(x,y);
    }

    public double getR() {
        return R;
    }

    public void setR(double r) {
        R = r;
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public double square()
    {
        return Math.PI*R*R;
    }

    public double length()
    {
        return 2*Math.PI*R;
    }
    public static char comparison(Circle c1, Circle c2)
    {
        if (c1.square() > c2.square())
        {
            return '>';
        }
        if (c1.square() < c2.square())
        {
            return '<';
        }
        if (c1.square() == c2.square())
        {
            return '=';
        }
        return '0';
    }
    @Override
    public String toString() {
        return "Circle{" +
                "center=" + center.toString() +
                ", R=" + R +
                '}';
    }
}
