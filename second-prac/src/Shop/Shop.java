package Shop;

import java.util.ArrayList;
import java.util.Scanner;

public class Shop {
    ArrayList<Computer> arrComp;
    int tsArr;
    public Shop()
    {
        this.tsArr = 0;
        this.arrComp = new ArrayList<Computer>();
    }
    public void addComp(Computer computer)
    {
        arrComp.add(computer);
    }

    public void deleteComp(Computer computer)
    {
        arrComp.remove(computer);
    }
    public void deleteComp(int id)
    {
        arrComp.remove(arrComp.get(id-1));
    }
    public void displayArr()
    {
        System.out.printf("%-3s%-10s%-10s%-10s%n","id","model","processor","videocard");
        for(int i = 0;i<arrComp.size();i++)
        {
            System.out.printf("%-3s%-10s%-10s%-10s%n",i+1,arrComp.get(i).getModel(),
                    arrComp.get(i).getProcessor(),
                    arrComp.get(i).getVideocard());
        }
    }
    @Override
    public String toString() {
        return "Shop{" +
                "arrComp=" + arrComp +
                ", tsArr=" + tsArr +
                '}';
    }
    public static void testShop()
    {
        char ch;
        Shop s = new Shop();
        Scanner in = new Scanner(System.in);
        System.out.println("Вы в программе шоп. Введите h для помощи." );
        do
        {
            System.out.println("Ввод: ");
            ch = in.next().charAt(0);
            if(ch == '1') {
                s.addComp(new Computer());
            }
            if(ch == '2') {
                System.out.println("Введите id компьютера:  ");
                s.deleteComp(in.nextInt());
            }
            if(ch == '3') {
                s.displayArr();
            }
            if (ch == 'h')
            {
                System.out.println("\nчтобы добавить элемент нажмите 1" +
                        "\nчтобы удалить элемент нажмите 2" +
                        "\nчтобы показать массив нажмите 3" +
                        "\nчтобы выйти нажмите q:   ");
            }

        }while(ch != 'q');

    }
    public static void main(String[] args) {
        //Huawei intel RTX3060ti
        //HyperX Amd 1660s
        //Xiaomi intel none
        //MSI Amd RTX2050

//        new Computer("Huawei", "intel", "RTX3060ti")
//        new Computer("HyperX","Amd","1660s")
//        new Computer("Xiaomi","intel","none")
//        new Computer("MSI","Amd","RTX2050")

        Shop s = new Shop();
        s.addComp(new Computer("Huawei", "intel", "RTX3060ti"));
        s.addComp(new Computer("HyperX","Amd","1660s"));
        s.addComp(new Computer("Xiaomi","intel","none"));
        s.addComp(new Computer("MSI","Amd","RTX2050"));
        s.displayArr();
        s.deleteComp(1);
        s.displayArr();

    }
}
