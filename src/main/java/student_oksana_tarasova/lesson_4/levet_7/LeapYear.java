package student_oksana_tarasova.lesson_4.levet_7;

class LeapYear {

      public String year(int year) {
        if (!isDividedBy4(year)) {
            return "Non-leap year";
        } else if (isDividedBy4(year) && (!isDivideBy100(year))) {
            return "Leap year";
        } else if (isDivideBy100(year) && isDivideBy400(year)) {
            return "Leap year";
        } else {
            return "Non-leap year";
        }
    }

    public boolean isDividedBy4(int year) {
        return year % 4 == 0;
    }
    public boolean isDivideBy100(int year) {
        return year % 100 == 0;
    }
    public boolean isDivideBy400(int year) {
        return year % 400 == 0;
    }

}
