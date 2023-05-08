package student_andrejs_cekalins.lesson_15.level_2.Task_9;

public class FraudDetector {
    boolean isFraud(Trader trader) {
        return (fraudTraderName(trader) || fraudCity(trader));
    }

    private boolean fraudTraderName(Trader trader) {
        return (trader.getFullName().equals("Pokemon"));
    }

    private boolean fraudCity(Trader trader) {
        return (trader.getCity().equals("Sidney"));
    }
}
