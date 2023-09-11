package Circle;

public class testCircle {
    Circle[] arrC;
    int sArrC;
    public testCircle(int s)
    {
        this.sArrC = s;
        this.arrC = new Circle[s];
    }
    public static void start() {

        testCircle c = new testCircle(2);
        c.arrC[0] = new Circle();
        c.arrC[1] = new Circle(2);

        System.out.println(c.arrC[0].toString());

        c.arrC[0].getCenter().setX(6);
        c.arrC[0].getCenter().setY(9);
        System.out.println(c.arrC[0].toString());

        c.arrC[0].setR(8);
        c.arrC[0].setCenter(new Point(9,6));
        System.out.println(c.arrC[0].toString());

        System.out.println(c.arrC[1].toString());
    }

    public static void main(String[] args) {
        Circle c1 = new Circle();
        Circle c2 = new Circle(2);
        System.out.print("c1 sq " );
        System.out.printf("%.2f", c1.square());
        System.out.print("\nc1 sq " );
        System.out.printf("%.2f", c2.square());
        System.out.print("\nc1 lg " );
        System.out.printf("%.2f", c1.length());
        System.out.print("\nc1 lg " );
        System.out.printf("%.2f", c2.length());
        System.out.printf("\nc2 " + Circle.comparison(c2,c1) + " c1");

    }
}
