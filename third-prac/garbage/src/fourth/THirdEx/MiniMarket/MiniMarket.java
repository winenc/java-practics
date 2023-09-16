package fourth.THirdEx.MiniMarket;

/*
Создать мини приложение - интернет-магазин. Должны быть
        реализованы следующие возможности:
        1) Аутентификация пользователя. Пользователь вводит логин и пароль с
        клавиатуры.
        2) Просмотр списка каталогов товаров.
        3) Просмотр списка товаров определенного каталога.
        4) Выбор товара в корзину.
        5) Покупка товаров, находящихся в корзине.
        41Для выполнения заданий необходимо создать перечисление согласно
        заданию, можете добавить свои операции или изменить что-то по своему
        усмотрению.
*/

import fourth.THirdEx.MiniMarket.Authorization.Authorization;
import fourth.THirdEx.MiniMarket.Goods.Catalog;
import fourth.THirdEx.MiniMarket.Goods.Goods;

import java.util.ArrayList;
import java.util.Scanner;

public class MiniMarket {
    Catalog[] catalog;
    ArrayList<Goods> backet;
    ArrayList<Authorization> auntification;
    private void constructCatalog()
    {
        String[] catalogNames = new String[]{"Baking", "Water", "Alcohol", "Clothing", "Electronics"};
        catalog = new Catalog[catalogNames.length];

        Goods[] baking = new Goods[]{new Goods("Puff with chees",45F),new Goods("Black bread",60F),new Goods("White bread",50F),new Goods("Samsa",70F)};

        Goods[] water = new Goods[]{new Goods("Water",45F),new Goods("Cola",60F),new Goods("Sprite",50F),new Goods("Red bull",70F), new Goods("Monster",70F)};

        Goods[]  alcohol = new Goods[]{new Goods("Whiskey",1500F),new Goods("Vodka",200F),new Goods("Sidr",100F),new Goods("Bear",50F)};

        Goods[]  clothing = new Goods[]{new Goods("T-shirt",1200F),new Goods("Pants",1000F),new Goods("Socks",300F),new Goods("Hoodi",2500F)};

        Goods[]  electronics = new Goods[]{new Goods("Laptop",150000F),new Goods("Washing machine",3600F),new Goods("Dishwasher",15000F),new Goods("Teapot",500F)};
        Goods[][] catalogs = new Goods[][]{baking,water,alcohol,clothing,electronics};
        for (int i = 0; i < catalogNames.length; i++)
        {
            catalog[i] = new Catalog(catalogNames[i]);
        }
        for (int i = 0; i < baking.length; i++)
        {
            for (int j = 0; j < baking.length; j++)
            {

                    catalog[i].addGood(catalogs[i][j]);
            }
        }
    }

    public MiniMarket(Catalog[] catalog) {
        constructCatalog();
        auntification = new ArrayList<Authorization>();
        this.backet = new ArrayList<Goods>();
    }

    public void start()
    {
        System.out.println("Вы в магазине. Для начала покупок требуется авторизация.");
        char ch;
        auntification.add(new Authorization());
        System.out.println("Отлично, вы авторизованы. Можете продолжить ввод, для помощи введите h.");
        Scanner in = new Scanner(System.in);
        do {
            System.out.print("Ввод: ");
            ch = in.next().charAt(0);
            switch (ch)
            {
                case 'h':
                    System.out.println("1 - Выбрать каталог и товар(q - выход в меню)" +
                            "2 - посмотреть корзину" +
                            "3 - купить товары из корзины" +
                            "q - выход из программы");
                    break;
                case '':
                    break;

                case '':
                    break;

                case '':
                    break;
            }
        }
    }

   public void displayCat()
    {
        for(int i = 0; i< catalog.length;i++)
        {
            System.out.println((i+1)+") "+catalog[i].getName());
        }
    }

    public Goods interactiveSelectGood()
    {
        System.out.println("Выберете католог. ");
        displayCat();

        String str;
        Goods selgood;

        Scanner in = new Scanner(System.in);
        do {
            boolean flag = true;
            System.out.print("Ввод: ");
            str = in.nextLine();
            if(str.charAt(0) == 'q')
            {
                break;
            }
            else if(recursiveCheckNum(str))
            {
                if(Integer.parseInt(str)-1 <= catalog.length && Integer.parseInt(str) > 0) {
                    catalog[Integer.parseInt(str) - 1].displayGoods();
                    System.out.print("Введите номер товара: ");
                    selgood = catalog[Integer.parseInt(str) - 1].getGoods(in.nextInt());
                }
                else
                {
                    System.out.println("Нет такого товара. ");
                    flag = false;
                }
            }
            else
            {
                System.out.println("Неверный ввод ");
                flag = false;
            }
        }wh

    }
    private static boolean recursiveCheckNum(String str)
    {

        boolean flag = false;
        char[] num = {'.', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
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
    public void addInBacket(Goods good)
    {
        this.backet.add(good);
    }

    public void showBacket()
    {
        for (Goods goods : this.backet) {
            goods.displayGood();
        }
    }
}
