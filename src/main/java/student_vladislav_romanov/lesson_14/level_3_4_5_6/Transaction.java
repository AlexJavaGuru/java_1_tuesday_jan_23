package student_vladislav_romanov.lesson_14.level_3_4_5_6;

record Transaction(Trader trader, int year, int value) {

    public String toString() {
        return "{" + trader + ", " +
                "year: " + year + ", " +
                "value:" + value + "}";
    }

}
