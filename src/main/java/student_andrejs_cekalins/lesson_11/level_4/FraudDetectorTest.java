package student_andrejs_cekalins.lesson_11.level_4;

public class FraudDetectorTest {
    public static void main(String[] args) {
        FraudDetectorTest test = new FraudDetectorTest();
        test.isPokemonTransaction();
        test.notIsPokemonTransaction();
        test.isMoreThanMillionTransaction();
        test.notMoreThanMillionTransaction();
        test.isSydneyTransaction();
        test.notSydneyTransaction();
        test.isJamaicaTransaction();
        test.notJamaicaTransaction();
        test.isGermanMoreThanThousandTransaction();
        test.notGermanMoreThanThousandTransaction();
    }
    public void isPokemonTransaction(){
        Trader trader = new Trader("Pokemon", "Riga", "Latvia");
        Transaction pokemonTransaction = new Transaction(trader, 2000);
        FraudDetector fraudDetector = new FraudDetector();
        boolean expectedResult = true;
        boolean realResult = fraudDetector.isFraud(pokemonTransaction);
        if (realResult==expectedResult) {System.out.println("Is Pokemon transaction test OK");
        }
    }
    public void notIsPokemonTransaction(){
        Trader trader = new Trader("Pikachu", "Riga", "Latvia");
        Transaction pokemonTransaction = new Transaction(trader, 2000);
        FraudDetector fraudDetector = new FraudDetector();
        boolean expectedResult = true;
        boolean realResult = fraudDetector.isFraud(pokemonTransaction);
        if (!realResult==expectedResult) {System.out.println("Not is Pokemon transaction test OK");
        }
    }
    public void isMoreThanMillionTransaction(){
        Trader trader = new Trader("Pikachu", "Riga", "Latvia");
        Transaction pokemonTransaction = new Transaction(trader, 1000001);
        FraudDetector fraudDetector = new FraudDetector();
        boolean expectedResult = true;
        boolean realResult = fraudDetector.isFraud(pokemonTransaction);
        if (realResult==expectedResult) {System.out.println("Is more than 1000000 transaction test OK");
        }
    }
    public void notMoreThanMillionTransaction(){
        Trader trader = new Trader("Pikachu", "Riga", "Latvia");
        Transaction pokemonTransaction = new Transaction(trader, 1000000);
        FraudDetector fraudDetector = new FraudDetector();
        boolean expectedResult = true;
        boolean realResult = fraudDetector.isFraud(pokemonTransaction);
        if (!realResult==expectedResult) {System.out.println("Not more than 1000000 transaction test OK");
        }
    }
    public void isSydneyTransaction(){
        Trader trader = new Trader("Pikachu", "Sydney", "Latvia");
        Transaction pokemonTransaction = new Transaction(trader, 1000000);
        FraudDetector fraudDetector = new FraudDetector();
        boolean expectedResult = true;
        boolean realResult = fraudDetector.isFraud(pokemonTransaction);
        if (realResult==expectedResult) {System.out.println("Is Sydney transaction test OK");
        }
    }
    public void notSydneyTransaction(){
        Trader trader = new Trader("Pikachu", "Riga", "Latvia");
        Transaction pokemonTransaction = new Transaction(trader, 10000);
        FraudDetector fraudDetector = new FraudDetector();
        boolean expectedResult = true;
        boolean realResult = fraudDetector.isFraud(pokemonTransaction);
        if (!realResult==expectedResult) {System.out.println("Not Sydney transaction test OK");
        }
    }
    public void isJamaicaTransaction(){
        Trader trader = new Trader("Pikachu", "Riga", "Jamaica");
        Transaction pokemonTransaction = new Transaction(trader, 1000000);
        FraudDetector fraudDetector = new FraudDetector();
        boolean expectedResult = true;
        boolean realResult = fraudDetector.isFraud(pokemonTransaction);
        if (realResult==expectedResult) {System.out.println("Is Jamaica transaction test OK");
        }
    }
    public void notJamaicaTransaction(){
        Trader trader = new Trader("Pikachu", "Riga", "Latvia");
        Transaction pokemonTransaction = new Transaction(trader, 10000);
        FraudDetector fraudDetector = new FraudDetector();
        boolean expectedResult = true;
        boolean realResult = fraudDetector.isFraud(pokemonTransaction);
        if (!realResult==expectedResult) {System.out.println("Not Jamaica transaction test OK");
        }
    }
    public void isGermanMoreThanThousandTransaction(){
        Trader trader = new Trader("Pikachu", "Riga", "Germany");
        Transaction pokemonTransaction = new Transaction(trader, 1001);
        FraudDetector fraudDetector = new FraudDetector();
        boolean expectedResult = true;
        boolean realResult = fraudDetector.isFraud(pokemonTransaction);
        if (realResult==expectedResult) {System.out.println("Is more than thousand Germany transaction test OK");
        }
    }
    public void notGermanMoreThanThousandTransaction(){
        Trader trader = new Trader("Pikachu", "Riga", "Germany");
        Transaction pokemonTransaction = new Transaction(trader, 1000);
        FraudDetector fraudDetector = new FraudDetector();
        boolean expectedResult = true;
        boolean realResult = fraudDetector.isFraud(pokemonTransaction);
        if (!realResult==expectedResult) {System.out.println("Not more than thousand Germany transaction test OK");
        }
    }
}
