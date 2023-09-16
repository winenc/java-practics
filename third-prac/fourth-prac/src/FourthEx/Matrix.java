package FourthEx;

public class Matrix {
    Float[][] matrix;
    int col;
    int str;

    public Matrix(int s, int n)
    {
        this.col = s;
        this.str = s;
        this.matrix = new Float[s][s];
        for (int i = 0; i < s; i++)
        {
            for (int j = 0; j < s; j++)
            {
                this.matrix[i][j] = Float.parseFloat(String.valueOf(n));
            }
        }
    }

    public Matrix() {
    }

    public Matrix sumMatrix(Matrix summand)
    {
        Matrix sum = new Matrix(summand.col,0);
        if(summand.str == this.str && summand.col == this.col) {
            sum.matrix = new Float[this.str][this.col];
            for (int i = 0; i < summand.str; i++) {
                for (int j = 0; j < summand.col; j++) {
                    sum.matrix[i][j] = this.matrix[i][j] + summand.matrix[i][j];
                }
            }
        }
        return sum;
    }


    public Matrix multMatrix(Float multiplier)
    {
        Matrix mult = new Matrix();
        mult.matrix = new Float[this.str][this.col];
        for (int i = 0; i < this.str; i++) {
            for (int j = 0; j < this.col; j++) {
                mult.matrix[i][j] = this.matrix[i][j] * multiplier;
            }
        }
        return mult;
    }

    public void display()
    {
        for (Float[] floats : this.matrix) {
            for (Float aFloat : floats) {
                System.out.print(aFloat + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Matrix m1 = new Matrix(4,3);
        Matrix m2 = new Matrix(4,5);
        m1.sumMatrix(m2).display();
        System.out.println();
        m1.multMatrix(3F).display();


    }
}
