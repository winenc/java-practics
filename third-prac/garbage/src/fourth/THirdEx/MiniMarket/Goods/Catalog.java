package fourth.THirdEx.MiniMarket.Goods;

import java.util.ArrayList;
import java.util.Objects;

public class Catalog {
    String name;
    ArrayList<Goods> goods;
    public Catalog(String name)
    {
        this.name = name;
        goods = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void addGood(Goods g)
    {
        this.goods.add(g);
    }
    public void removeGood(String name)
    {
        goods.stream().filter(g -> Objects.equals(g.name, name)).forEach(g -> goods.remove(g));
    }

    public void displayGoods()
    {
        for (int i = 0; i<goods.size();i++)
        {
            System.out.println("Catalog "+this.name);
            goods.get(i).displayGood();
        }
    }

    public Goods getGoods(String name) {
        for(Goods g:goods)
        {
            if(Objects.equals(g.name, name))
            {
                return g;
            }
        }
        return null;
    }
    public Goods getGoods(int index) {
        int i = 0;
        for(Goods g:goods)
        {
            if(i == index)
            {
                return g;
            }
            i++;
        }
        return null;
    }
}
