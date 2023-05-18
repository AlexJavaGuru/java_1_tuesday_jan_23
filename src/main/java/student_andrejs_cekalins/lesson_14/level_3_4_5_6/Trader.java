package student_andrejs_cekalins.lesson_14.level_3_4_5_6;

import java.util.Objects;

public class Trader {
   private String name;
   private String city;

    public Trader(String name, String city) {
        this.name = name;
        this.city = city;
    }

    public String getName() {
        return this.name;
    }

    public String getCity() {
        return this.city;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Trader trader = (Trader) o;
        return name.equals(trader.name) && city.equals(trader.city);
    }

    @Override
    public String toString() {
        return "Trader:" + this.name + " in " + this.city;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, city);
    }
}

