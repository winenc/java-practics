package Ball;

/*2. По диаграмме UML  класса, представленной на рисунке 2.5 написать программу которая
        состоит из двух классов. Один из них Ball.Ball должен реализовать сущность мяча,
        а другой Ball.testBall должен тестировать работу созданного класса. Класс Ball.Ball должен содержать
        реальзацию методов , представленных на UML. Диаграмма на рисунке описывает сущность мяч
        написать программу. Класс Ball.Ball моделирует движущийся мяч.

                        Ball.Ball
        -x:double = 0.0
        -y:double = 0.0
        +Ball.Ball(x:double,y:double)
        +Ball.Ball()
        +getX():double
        +setX(x:double):void
        +getY():double
        +setY(y:double):void
        +setXY(x:double,y:double):void
        +move(xDisp:double, yDisp:double):void
        +toString():String*/
public class Ball {
    private double x;
    private double y;

    public Ball()
    {
        this.x = 0.0;
        this.y = 0.0;
    }
    public Ball(double x, double y)
    {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
    public void setXY(double x,double y) {
        this.x = x;
        this.y = y;
    }

    public void move(double xDisp, double yDisp)
    {}

    @Override
    public String toString() {
        return "Ball.Ball{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
