package student_oksana_tarasova.lesson_11.level_4;

class FraudDetectorTest {
    public static void main(String[] args) {
        FraudDetectorTest test = new FraudDetectorTest();
        test.pokemonTest();
        test.pokemonTest1();
        test.millionTest();
        test.millionTest1();
        test.cityTest();
        test.cityTest1();
        test.countryTest();
        test.germanyTest();
        test.germanyTest1();
    }

    public void pokemonTest() {
        Transaction transaction = new Transaction(new Trader("Pokemon", "Turin", "Italia"), 1000);
        FraudDetector fraudDetector = new FraudDetector();
        boolean realResult = fraudDetector.isFraud(transaction);
        boolean expectedResult = true;
        check(realResult == expectedResult, "Pokemon test ");

    }

    public void pokemonTest1() {
        Transaction transaction = new Transaction(new Trader("Ivanov", "Turin", "Italia"), 1000);
        FraudDetector fraudDetector = new FraudDetector();
        boolean realResult = fraudDetector.isFraud(transaction);
        boolean expectedResult = false;
        check(realResult == expectedResult, "not Pokemon test ");

    }

    public void millionTest() {
        Transaction transaction = new Transaction(new Trader("Ivanov", "Turin", "Italia"), 1000001);
        FraudDetector fraudDetector = new FraudDetector();
        boolean realResult = fraudDetector.isFraud(transaction);
        boolean expectedResult = true;
        check(realResult == expectedResult, "million test");

    }

    public void millionTest1() {
        Transaction transaction = new Transaction(new Trader("Ivanov", "Turin", "Italia"), 100000);
        FraudDetector fraudDetector = new FraudDetector();
        boolean realResult = fraudDetector.isFraud(transaction);
        boolean expectedResult = false;
        check(realResult == expectedResult, "million test");

    }

    public void cityTest() {
        Transaction transaction = new Transaction(new Trader("Ivanov", "Sidney", "Australia"), 100000);
        FraudDetector fraudDetector = new FraudDetector();
        boolean realResult = fraudDetector.isFraud(transaction);
        boolean expectedResult = true;
        check(realResult == expectedResult, "Sidney test");

    }

    public void cityTest1() {
        Transaction transaction = new Transaction(new Trader("Ivanov", "Turin", "Italia"), 100000);
        FraudDetector fraudDetector = new FraudDetector();
        boolean realResult = fraudDetector.isFraud(transaction);
        boolean expectedResult = false;
        check(realResult == expectedResult, "Sidney test ");

    }

    public void countryTest() {
        Transaction transaction = new Transaction(new Trader("Ivanov", "Kingston", "Jamaica"), 100000);
        FraudDetector fraudDetector = new FraudDetector();
        boolean realResult = fraudDetector.isFraud(transaction);
        boolean expectedResult = true;
        check(realResult == expectedResult, "Jamaica test");

    }

    public void germanyTest() {
        Transaction transaction = new Transaction(new Trader("Ivanov", "Berlin", "Germany"), 1001);
        FraudDetector fraudDetector = new FraudDetector();
        boolean realResult = fraudDetector.isFraud(transaction);
        boolean expectedResult = true;
        check(realResult == expectedResult, "Germany > 1000 test");

    }

    public void germanyTest1() {
        Transaction transaction = new Transaction(new Trader("Ivanov", "Berlin", "Germany"), 1000);
        FraudDetector fraudDetector = new FraudDetector();
        boolean realResult = fraudDetector.isFraud(transaction);
        boolean expectedResult = false;
        check(realResult == expectedResult, "Germany = 1000 test");

    }

    public void check(boolean state, String nameTest) {
        if (state) {
            System.out.println(nameTest + " = ok");
        } else {
            System.out.println(nameTest + " = fail");
        }
    }
}
