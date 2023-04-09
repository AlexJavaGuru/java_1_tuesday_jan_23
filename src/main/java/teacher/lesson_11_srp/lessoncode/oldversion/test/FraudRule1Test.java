package teacher.lesson_11_srp.lessoncode.oldversion.test;

import teacher.lesson_11_srp.lessoncode.oldversion.FraudRule1;
import teacher.lesson_11_srp.lessoncode.oldversion.Trader;
import teacher.lesson_11_srp.lessoncode.oldversion.Transaction;

public class FraudRule1Test {

    static void isPokemonTransactio() {
        Trader pokemon = new Trader("Pokemon", "Riga", "Latvia");
        Transaction pokemonTransaction = new Transaction(pokemon, 2000);
        FraudRule1 fraudRule1 = new FraudRule1("isPokemonTransaction");
        boolean expectResult = true;
        boolean calculateResult = fraudRule1.isFraud(pokemonTransaction);
        if (expectResult == calculateResult) {
            System.out.println("Test not allowed Traders name has PASSED!");
        } else {
            System.out.println("Test not allowed Traders name has FAILED");
        }
    }

}
