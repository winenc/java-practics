package FirstEx;

import java.util.Random;

public class FirstEx
{
    float[] arr;

    public FirstEx(int n)
    {
        arr = new float[n];
    }
    public  void displayArrF()
    {
        for (float v : this.arr) {
            System.out.println(v);
        }
        System.out.println("\n\n");
    }

    public  void bubbleSortF() {
        for (int i = 0; i < this.arr.length - 1; i++) {
            for (int j = 0; j < this.arr.length - i - 1; j++) {
                if (this.arr[j + 1] < this.arr[j]) {
                    float swap = this.arr[j];
                    this.arr[j] = this.arr[j + 1];
                    this.arr[j + 1] = swap;
                }
            }
        }
    }
    public  void randomFillNumF(int type) {
        if ( type == 1 ) {
            Random random = new Random();
            for (int i = 0; i < this.arr.length; i++) {
                this.arr[i] = random.nextFloat();
            }
        }
        if ( type == 2){
            for (int i = 0; i < arr.length; i++ ){
                this.arr[i] = (float)Math.random();
            }
        }

    }
    public void start()
    {
        randomFillNumF(1);
        this.displayArrF();
        this.bubbleSortF();
        this.displayArrF();
        randomFillNumF(2);
        this.displayArrF();
        this.bubbleSortF();
        this.displayArrF();
    }
}
