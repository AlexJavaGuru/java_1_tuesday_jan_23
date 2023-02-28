package student_oksana_maksimova.lesson_4.level_7;

class LeapYear {

        public boolean isLeapYear(int year) {
            if (!(year % 4 == 0)) {
                return false;
            }else if(!(year % 100 == 0)){
                return true;
            }
            return (!(year % 400 == 0));
        }
}