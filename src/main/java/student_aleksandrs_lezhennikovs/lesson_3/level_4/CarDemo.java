package student_aleksandrs_lezhennikovs.lesson_3.level_4;

class CarDemo {

    public static void main(String[] args) {

        Car myCar = new Car("Nissan");

        String carModel = myCar.getModel();
        System.out.println("Car model = " + carModel);
    }

}