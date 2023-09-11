package Ball;

import Ball.Ball;

public class testBall {
    public static void start() {
        Ball b1 = new Ball(1,1);
        Ball b2 = new Ball();
        System.out.printf("b1 " + b1.getX() + " " + b1.getY());
        b1.setX(2);
        b1.setY(2);
        System.out.printf("\nb1 " + b1.getX() + " " + b1.getY());
        System.out.println("\nb2 "+b2.toString());
        b2.setXY(1,1);
        System.out.println("b2 "+b2.toString());

    }
}
