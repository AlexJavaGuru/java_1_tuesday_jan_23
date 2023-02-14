package student_natalija_rasponomarjova.lesson_3.level_7;


class MyFitnessDemo {

    public static void main(String[] args) {

        MyFitness guest1 = new MyFitness();
        guest1.getMonthlyPayment("Full Day", 44, "Natalija");

        MyFitness guest2 = new MyFitness();
        guest2.getMonthlyPayment("Full Day", 66, "Olegs");

        MyFitness guest3 = new MyFitness();
        guest3.getMonthlyPayment("Evening", 35, "Viktorija");

    }

}