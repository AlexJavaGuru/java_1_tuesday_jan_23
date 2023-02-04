package student_natalija_rasponomarjova.lesson_3.level_7;

class MyFitness {

    private String memberShip;
    private double monthlyPayment;
    private int userAge;
    private String userName;

    void getMonthlyPayment (String memberShip, int userAge, String userName) {
        if(userAge <= 65) {
            monthlyPayment = 88.50;
        }
        else { monthlyPayment = 58.50;
        }

        System.out.println("Total amount for" + " " + userName + " " + "monthly payment is: " + monthlyPayment +
                " " + "Euro");
        }
    }

