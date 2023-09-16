package Convertor;

public class Currency {
    public enum typeOfCurr {EURO,BAKS,TENGE,RUBLE;};

    typeOfCurr curr;
    Float weight;

    public Currency(typeOfCurr t, Float quan )
    {
        this.curr = t;
        this.weight = quan;
    }

    public Float getQuan() {
        return weight;
    }

    public void setQuan(Float quan) {
        this.weight = quan;
    }

    public typeOfCurr getCurr() {
        return curr;
    }

    public void setCurr(typeOfCurr curr) {
        this.curr = curr;

    }

    @Override
    public String toString() {
        return "Currency{" +
                "curr=" + curr +
                ", quan=" + weight +
                '}';
    }
}
