package student_anastasiia_bokareva.lesson11.level4;

public class Trader {
    private String fullName;
    private String city;
    private String country;




    public Trader(String fullName, String city, String country){
        this.fullName=fullName;
        this.city=city;
        this.country=country;
    }

    public String getCountry() {
        return country;
    }
    public String getFullName() {
        return fullName;
    }

    public String getCity() {
        return city;
    }

    @Override
    public String toString() {
        return "Trader{" +
                "fullName='" + fullName + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}



