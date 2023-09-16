package MiniApp;

import Convertor.Convertor;
import Convertor.Currency;
import Convertor.Currency.typeOfCurr;

import java.util.Objects;
import java.util.Scanner;

public class MiniApp {
    public enum goods {
      MILK("MILK", new Currency(typeOfCurr.BAKS,2F)),
        SUGAR("SUGAR", new Currency(typeOfCurr.BAKS,1F )),
        CHIPS("CHIPS",new Currency(typeOfCurr.BAKS,1F)),
        WATER("WATER", new Currency(typeOfCurr.BAKS,0.5F)),
        BREAD("BREAD", new Currency(typeOfCurr.BAKS,0.5F));

        final String type;
        Currency cost;

        goods(String type, Currency c)
        {
            this.type = type;
            this.cost = c;


        }

        public boolean setCurr(String type) {
            Convertor c = new Convertor(cost.getCurr(), cost.getQuan());
            if(Objects.equals(type, "d"))
                this.cost.setCurr(typeOfCurr.BAKS);
            else if(Objects.equals(type, "e"))
                this.cost.setCurr(typeOfCurr.EURO);
            else if(Objects.equals(type, "t"))
                this.cost.setCurr(typeOfCurr.TENGE);
            else if(Objects.equals(type, "r"))
                this.cost.setCurr(typeOfCurr.RUBLE);
            else {
                System.out.println("Нет такой валюты. ");
                return false;
            }
            this.cost.setQuan(c.getDenga(this.cost.getCurr()));
            return true;
        }
        public void display()
        {
            System.out.print(" "+type+" "+cost.getQuan()+" "+cost.getCurr()+" ");
        }
        public void setCost(Currency cost) {
            this.cost = cost;
        }
        public static goods getGood(int n)
        {
            int i = 1;
            for (goods g:goods.values())
            {
                if(n == i )
                {
                    return g;
                }
                i++;
            }
            System.out.println("Нет такого продукта. ");
            return null;
        }
    };

    goods good;

    private static boolean recursiveCheckNum(String str)
    {

        boolean flag = false;
        char[] num = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        if(str.length() == 1) {
            for (char c:num) {
                if(c == str.charAt(0)) {
                    return true;
                }
            }
        }

        if(!str.isEmpty()) {
            return recursiveCheckNum(String.valueOf(str.charAt(0))) && recursiveCheckNum(str.substring(1));
        }
        return false;
    }
    public void start()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Витрина товаров: ");
        displayGoods();
        System.out.print("Введите номер товара с витрины, который хотите купить: ");
        String input = in.nextLine();
        while (!recursiveCheckNum(input)){
            System.out.println("Ошибка ввода. ");
            System.out.print("Введите номер товара с витрины, который хотите купить: ");
            input = in.nextLine();
        }

        this.good = goods.getGood(Integer.parseInt(input));

        do
        {
            System.out.print("Введите валюту, в которой будете оплачивать (EURO(e),DOLLAR(d),TENGE(t),RUBLE(r)): ");
            input = in.nextLine();
        }while (!this.good.setCurr(input));

        System.out.print("С вас ");
        System.out.printf("%.2f",good.cost.getQuan());
        System.out.println(" "+good.cost.getCurr()+" Будете брать?(y/n) ");
        input = in.nextLine();

        if(Objects.equals(input, "y")) {
            System.out.print("");
            System.out.print("Введите номер своей карты: ");
            input = in.nextLine();
            System.out.print("Месяц и год действия вашей карты: ");
            input = in.nextLine();
            System.out.print("CVV: ");
            input = in.nextLine();
            System.out.print("Вы купили " + good.type + ". Пока. ");
        }
        else
            System.out.println("Ладно, пока.");
    }
    public static void displayGoods() {
        int i = 1;
        for (goods g:goods.values())
        {

            System.out.print((i++)+") ");
            g.display();
            System.out.println();
        }
    }

    public static void main(String[] args) {
        MiniApp m = new MiniApp();
        m.start();
    }


}
