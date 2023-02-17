package student_natalija_rasponomarjova.lesson_4.level_7;

/*Написать класс для определения високосный год или нет.
    // return true - если год високосный
    // return false - если год обычный

    public boolean isLeapYear(int year) {
        // Если год не делится на 4, значит он обычный.
        // Иначе надо проверить не делится ли год на 100.
        // Если не делится, значит это не столетие и можно сделать вывод, что год високосный.
        // Если делится на 100, значит это столетие и его следует проверить его делимость на 400.
        // Если год делится на 400, то он високосный.
        // Иначе год обычный.}}*/
class LeapYear {
    public boolean isLeapYear(int year) {
        if (!isDividedBy4(year)) {
            return false;
        }

        if (!isDividedBy100(year)) {
            return true;
        }

        return isDividedBy400(year);
    }

    private boolean isDividedBy4(int year) {

        return year % 4 == 0;
    }

    private boolean isDividedBy100(int year) {

        return year % 100 == 0;
    }

    private boolean isDividedBy400(int year) {

        return year % 400 == 0;
    }
}


