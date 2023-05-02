package student_vladislav_romanov.lesson_15.level_2;

import student_vladislav_romanov.lesson_11.level_4_5_6.Trader;

class FraudDetector {

    boolean isFraud(Trader trader) {
        return isTraderBlacklisted(trader) || (isCityBlacklisted(trader));
    }

    private boolean isTraderBlacklisted(Trader trader) {
        String traderName = trader.getFullName();
        return "Pokemon".equals(traderName);
    }

    private boolean isCityBlacklisted(Trader trader) {
        String traderCity = trader.getCity();
        return "Sidney".equals(traderCity);
    }

}
