package student_oksana_tarasova.lesson_11.level_5;

import student_oksana_tarasova.lesson_11.level_4.Trader;
import student_oksana_tarasova.lesson_11.level_4.Transaction;

public class FraudRuleTest {
    public static void main(String[] args) {
        fraudPokemonTest();
        fraudUserNotPokemonTest1();
        moreMillionTest();
        moreMillionTest1();
        sidneyTest();
        sidneyTest1();
        jamaicaTest();
        jamaicaTest1();
        germanyTest();
        germanyTest2();
    }

    static void fraudPokemonTest() {
        FraudRule1 fraudRule1 = new FraudRule1("User Pokemon");
        boolean realResult = fraudRule1.isFraud(new Transaction(new Trader("Pokemon", "Turin", "Italia"), 1000));
        boolean expectedResult = true;
        if (realResult == expectedResult) {
            System.out.println("userPokemon is passed");
        } else {
            System.out.println("userPokemon is failed");
        }
    }

    static void fraudUserNotPokemonTest1() {
        FraudRule1 fraudRule1 = new FraudRule1("User Pokemon");
        boolean realResult = fraudRule1.isFraud(new Transaction(new Trader("Ivanov", "Turin", "Italia"), 1000));
        boolean expectedResult = false;
        if (realResult == expectedResult) {
            System.out.println("userNotPokemon is passed");
        } else {
            System.out.println("userNotPokemon is failed");
        }
    }

    static void moreMillionTest() {
        FraudRule2 fraudRule2 = new FraudRule2("moreMillion");
        boolean realResult = fraudRule2.isFraud(new Transaction(new Trader("Ivanov", "Turin", "Italia"), 1000001));
        boolean expectedResult = true;
        if (realResult == expectedResult) {
            System.out.println("moreMillion is passed");
        } else {
            System.out.println("mreMillion is failed");
        }
    }

    static void moreMillionTest1() {
        FraudRule2 fraudRule2 = new FraudRule2("moreMillion");
        boolean realResult = fraudRule2.isFraud(new Transaction(new Trader("Ivanov", "Turin", "Italia"), 1000000));
        boolean expectedResult = false;
        if (realResult == expectedResult) {
            System.out.println("moreMillion is passed");
        } else {
            System.out.println("moreMillion is failed");
        }
    }

    static void sidneyTest() {
        FraudRule3 fraudRule3 = new FraudRule3("Sidney");
        boolean realResult = fraudRule3.isFraud(new Transaction(new Trader("Ivanov", "Sidney", "Italia"), 1000000));
        boolean expectedResult = true;
        if (realResult == expectedResult) {
            System.out.println("Sidney is passed");
        } else {
            System.out.println("Sidney is failed");
        }
    }

    static void sidneyTest1() {
        FraudRule3 fraudRule3 = new FraudRule3("Sidney");
        boolean realResult = fraudRule3.isFraud(new Transaction(new Trader("Ivanov", "Turin", "Italia"), 1000000));
        boolean expectedResult = false;
        if (realResult == expectedResult) {
            System.out.println("Sidney is passed");
        } else {
            System.out.println("Sidney is failed");
        }
    }

    static void jamaicaTest() {
        FraudRule4 fraudRule4 = new FraudRule4("Jamaica");
        boolean realResult = fraudRule4.isFraud(new Transaction(new Trader("Ivanov", "Kingston", "Jamaica"), 100000));
        boolean expectedResult = true;
        if (realResult == expectedResult) {
            System.out.println("Jamaica is passed");
        } else {
            System.out.println("Jamaica is failed");
        }
    }

    static void jamaicaTest1() {
        FraudRule4 fraudRule4 = new FraudRule4("Jamaica");
        boolean realResult = fraudRule4.isFraud(new Transaction(new Trader("Ivanov", "Turin", "Italia"), 1000000));
        boolean expectedResult = false;
        if (realResult == expectedResult) {
            System.out.println("Jamaica is passed");
        } else {
            System.out.println("Jamaica is failed");
        }
    }

    static void germanyTest() {
        FraudRule5 fraudRule5 = new FraudRule5("Germany, more 1000");
        boolean realResult = fraudRule5.isFraud(new Transaction(new Trader("Ivanov", "Berlin", "Germany"), 1001));
        boolean expectedResult = true;
        if (realResult == expectedResult) {
            System.out.println("Germany, more 1000 is passed");
        } else {
            System.out.println("Germany, more 1000 is failed");
        }
    }

    static void germanyTest2() {
        FraudRule5 fraudRule5 = new FraudRule5("Germany, = 1000");
        boolean realResult = fraudRule5.isFraud(new Transaction(new Trader("Ivanov", "Turin", "Germany"), 1000));
        boolean expectedResult = false;
        if (realResult == expectedResult) {
            System.out.println("Germany, = 1000 is passed");
        } else {
            System.out.println("Germany, = 1000 is failed");
        }
    }
}
