package SixthEx;

public class Manager extends Employer{
    double averageSum;

    public Manager(Float income, double averageSum) {
        super(income);
        this.averageSum = averageSum;
    }

    @Override
    public Float getIncome() {
        return (super.getIncome()+(float)averageSum);
    }

    public static void main(String[] args) {
        Employer employer = new Manager(1000F,100);
        Employer[] employers = new Employer[5];
        for(int i = 0; i < 5; i++)
        {
            if(i%2 == 0)
            {
                employers[i] = new Manager((i+1)*1000F,500);
            }
            else
            {
                employers[i] = new Employer((i+1)*1000F);
            }
        }
        for (int i = 0; i< employers.length; i++)

        {
            if(i%2 == 0)
            {
                System.out.print("man ");
            }
            else
            {
                System.out.print("emp ");
            }
            System.out.println(employers[i].getIncome()+" ");
        }

    }
}
