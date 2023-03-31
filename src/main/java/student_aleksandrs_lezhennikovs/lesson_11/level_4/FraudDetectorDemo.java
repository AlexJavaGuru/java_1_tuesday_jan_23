package student_aleksandrs_lezhennikovs.lesson_11.level_4;

import student_aleksandrs_lezhennikovs.lesson_11.level_4.console_ui.FraudDetectorUIAction;
import student_aleksandrs_lezhennikovs.lesson_11.level_4.domen.FraudDetector;
import student_aleksandrs_lezhennikovs.lesson_11.level_4.domen.Trader;
import student_aleksandrs_lezhennikovs.lesson_11.level_4.domen.Transaction;
import student_aleksandrs_lezhennikovs.lesson_11.level_4.rules.*;


import java.util.List;

class FraudDetectorDemo {
    public static void main(String[] args) {
        List<FraudRule> fraudRules = List.of (
                new NotAllowedTraders("Not allowed Traders", List.of("Pokemon")),
                new NotAllowedCity("Not allowed Cities", List.of("Berlin")),
                new NotAllowedCountries("Not allowed countries", List.of("Yamaika")),
                new NotAllowedMoreThanAmount("Not allowed amount more than", List.of(1000000)),
                new NotAllowedGerAnd1000("Germany and 1000")
        );
        Trader pokemon = new Trader("Pokemon", "Berlin", "Yamaika");
        Transaction pokemonTransaction = new Transaction(pokemon, 1000001);
        FraudDetector fraudDetector = new FraudDetector(fraudRules);
        FraudDetectorUIAction fraudDetectorUIAction = new FraudDetectorUIAction(fraudDetector);
        fraudDetectorUIAction.printToConsoleIsFraudResult(pokemonTransaction);
    }

}
