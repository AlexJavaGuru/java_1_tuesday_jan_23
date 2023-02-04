package student_oksana_tarasova.lesson_3.level_7;

class CountElectricity {
// Task_29. Объект: расчет за элетроэнергию
    String firstName;
    String lastName;
    String address;
    String month;
    int beginIndication;
    int finIndication;
    int year = 2023;
    double rate = 2.15;

    public CountElectricity(String firstName, String lastName, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
    }
     void subscriber() {
        System.out.println(firstName + " " + lastName);
        System.out.println(address);
     }
     void date(String month) {
        this.month = month;
        System.out.println(month + " " + year);
     }
     void count(int beginIndication, int finIndication) {
        this.beginIndication = beginIndication;
        this.finIndication = finIndication;
        int difference = finIndication - beginIndication;
        double cost = difference * rate;
        String result1 = String.format("%.2f",cost);
        double tax = (cost * 20)/100;
        String result2 = String.format("%.2f",tax);
        double prise = cost + tax;
        String result3 = String.format("%.2f",prise);
        System.out.println( "Cost: " + result1 + " euro");
        System.out.println("Tax " + result2 + " euro");
        System.out.println("Prise: " + result3 + " euro");
     }

}
