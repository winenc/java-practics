package TenthEx;

import java.sql.Time;

public abstract class Transport {
    Float time;
    Float coastCargo;

    Float coastPassangers;

    public Float getCoastCargo() {
        return coastCargo;
    }

    public void setCoastCargo(Float coastCargo) {
        this.coastCargo = coastCargo;
    }

    public Float getCoastPassangers() {
        return coastPassangers;
    }

    public void setCoastPassangers(Float coastPassangers) {
        this.coastPassangers = coastPassangers;
    }

    public Float getTime() {
        return time;
    }

    public void setTime(Float time) {
        this.time = time;
    }
}
