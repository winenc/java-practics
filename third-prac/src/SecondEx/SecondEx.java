package SecondEx;

import java.util.Random;

public class SecondEx {
    int[] arr;
    public SecondEx()
    {
        Random random = new Random();
        this.arr = new int[4]; //{(10+random.nextInt()/80),(10+random.nextInt()/80),(10+random.nextInt()/80),(10+random.nextInt()/80)};
        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = 10+ Math.abs(random.nextInt()%80);
        }
    }
    public void display()
    {
        for (int i = 0;i < arr.length; i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public void displayCheck()
    {
        if(this.checkPosl())
        {
            System.out.println("Является возрастающей последовательностью.");
        }
        else
        {
            System.out.println("Не является возрастающей последовательностью.");
        }
    }

    private boolean checkPosl()
    {
        boolean flag = true;
        for (int i = 0;i < arr.length-1; i++)
        {
            if (arr[i] > arr[i + 1]) {
                flag = false;
                break;
            }
        }
        return flag;
    }
    public void start()
    {
        this.display();
        this.displayCheck();
    }

 }
