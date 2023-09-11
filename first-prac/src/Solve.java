import java.text.DecimalFormat;
import java.util.Scanner;

public class Solve {
    private static float mid(int[] arr, int s)
    {
        return sum(arr,s)/s;
    }
    private static int sum(int[] arr, int s)
    {

        int ans = 0;
        for(int i = 0;i<s;i++)
        {
            ans += arr[i];
        }


        return ans;
    }
    private static int sumwhile(int[] arr, int s)
    {

        int ans = 0;
        int i = 0;
        while(i<s){

            ans = ans + arr[i];
            i++;
        }
        return ans;
    }
    private static void input(int[] arr, int s, int type)
    {
        if(type == 1) {
            Scanner in = new Scanner(System.in);
            for(int i = 0;i<s;i++)
            {
                arr[i] = in.nextInt();
            }
        }
        if(type == 2) {
            for (int i = 0; i < s; i++) {
                arr[i] = i;
            }
        }
    }
    private static void outputIntArr(int[] arr,int s)
    {
        for(int i = 0;i<s;i++)
        {
            System.out.println(arr[i]);
        }

    }
    private static void outputStrArr(String[] arr,int s)
    {
        for(int i = 0;i<s;i++)
        {
            System.out.println(arr[i]);
        }

    }
    private static int minimax(int[] arr,int s,int type)
    {
        int ans = 0;
        if(type == 1)
        {
            // min
            ans = Integer.MAX_VALUE;
            for(int i = 0;i<s;i++)
            {
                if(arr[i]<ans)ans=arr[i];
            }
        }
        if(type == 2)
        {
            //max
            ans = -Integer.MAX_VALUE;
            for(int i = 0;i<s;i++)
            {
                if(arr[i]>ans)ans=arr[i];
            }

        }
        return ans;
    }
    private static double garmoRyad(double q) {
        if(q == 1)
            return 1;
        else
            return ((double) (1/q) + garmoRyad(q-1));
    }

    private static int factorial(int num)
    {
        int ans = 1;
        while(num > 0)
            ans *= num--;

        return ans;
    }
    public static void ex3(int[] arr,int s)
    {
        input(arr,s,2);
        System.out.println(sum(arr,s));
        System.out.println(mid(arr,s));
    }
    public static void ex4(int[] arr,int s)
    {
        input(arr,s,1);
        System.out.println(sumwhile(arr,s));
        System.out.println(minimax(arr,s,1));
        System.out.println(minimax(arr,s,2));
    }
    public static void ex5(String[] arr)
    {
        outputStrArr(arr,arr.length);
    }
    public static void ex6()
    {
//        DecimalFormat dF = new DecimalFormat("#.###");
//        System.out.printf(dF.format(garmoRyad(10)));
        double d;
        d = garmoRyad(10);
        System.out.println(garmoRyad(10));
        System.out.printf("%.1f", d);
    }
//    public static void ex7(int num)
//    {
//        System.out.println(factorial(num));
//    }
}
