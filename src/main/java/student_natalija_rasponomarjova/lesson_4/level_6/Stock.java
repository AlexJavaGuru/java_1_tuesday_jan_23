package student_natalija_rasponomarjova.lesson_4.level_6;

class Stock {

    String companyName;
    int currentValue;
    int minValue;
    int maxValue;

    public Stock(String companyName, int currentValue) {
        this.companyName = companyName;
        this.currentValue = currentValue;
        this.minValue = minValue;
        this.maxValue = maxValue;
    }

    public String getPriceInformation() {
        return "Company = " + companyName + ", Current Value = " + currentValue + " , " +
                "Min Price = " + minValue + ", Max Price = " + maxValue;
    }

    void updateValue(int currentValue) {
        this.currentValue = currentValue;
        if (currentValue > maxValue) {
            maxValue = currentValue;
        } else {
            minValue = currentValue;
        }
    }

    public int getCurrentValue() {
        return currentValue;
    }

    public int getMaxValue() {
        return maxValue;
    }


    public int getMinValue() {
        return minValue;
    }

}


