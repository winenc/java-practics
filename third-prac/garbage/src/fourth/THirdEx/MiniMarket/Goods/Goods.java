package fourth.THirdEx.MiniMarket.Goods;


import java.util.ArrayList;

public class Goods {
    String name;
     static int COUNT = 1;

    Float coast;
    int article;
//    public Goods()
//    {
//        this.article = COUNT++;
//        this.coast = 0F;
//        this.name = "f";
//        this.describtion = "f";
//    }
    public Goods(String name,Float coast)
    {
        ;
        this.coast = coast;
        this.name = name;

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getArticle() {
        return article;
    }

    public Float getCoast() {
        return coast;
    }

    public void setCoast(Float coast) {
        this.coast = coast;
    }

    public void displayGood()
    {
        System.out.println(this.getArticle()+") "+this.getName()+" "+this.getCoast()+" R");
    }


    @Override
    public String toString() {
        return "Goods{" +
                "name='" + name + '\'' +
                ", coast=" + coast +
                ", article=" + article +
                '}';
    }
}
