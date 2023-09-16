package FirstEx;

public enum Seasons {
    SUMMER(25F),
    SPRING(15F),
    АUTUMN(5F),
    WINTER(-5F);

    Float temp;
    Seasons(Float t)
    {
        this.temp = t;
    }

    public static void switchSeason(Seasons season)
    {
        switch (season)
        {
            case SUMMER:
                System.out.println(" "+season+"! ");
                break;
            case АUTUMN:
                System.out.println(" "+season+"! ");
                break;
            case WINTER:
                System.out.println(" "+season+"! ");
                break;
            case SPRING:
                System.out.println(" "+season+"! ");
                break;
        }

    }

    public static void start() {
        for(Seasons s:Seasons.values())
        {
            System.out.println(s+" "+s.temp+" градусов "+s.getDescription());
        }
    }
    public String getDescription()
    {
        if (this.equals(SUMMER))
        {
            return "Теплое время года";
        }
        return ("Холодное время года");
    }

    public static void main(String[] args) {
        System.out.println( WINTER.getDescription());


    }
}
