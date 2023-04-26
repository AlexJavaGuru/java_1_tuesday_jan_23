package student_aleksandrs_lezhennikovs.lesson_15.level_2.task_9;

class FraudDetector {

    public boolean isFraud(Trader trader) {
        return notAllowedTraderPokemon(trader) || notAllowedCitySidney(trader);
    }

    private static boolean notAllowedTraderPokemon(Trader trader) {
        String traderName = trader.getFullName();
        return traderName.equals("Pokemon");
    }

    private static boolean notAllowedCitySidney(Trader trader) {
        String cityName = trader.getCity();
        return cityName.equals("Sidney");
    }
}