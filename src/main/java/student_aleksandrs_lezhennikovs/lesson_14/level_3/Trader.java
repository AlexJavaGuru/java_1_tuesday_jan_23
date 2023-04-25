package student_aleksandrs_lezhennikovs.lesson_14.level_3;

import java.util.Objects;

class Trader {
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

    public String toString() {
        return "Trader:"+this.name + " in " + this.city;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Trader trader)) return false;
        return name.equals(trader.name) && city.equals(trader.city);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, city);
    }
}
