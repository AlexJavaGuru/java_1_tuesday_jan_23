package student_vladislav_romanov.lesson_6.level_4;

class ForLoopContinue {

    public static void main(String[] args) {
        ForLoopContinue forLoopContinue = new ForLoopContinue();
        System.out.println("Month with 31 day has " + forLoopContinue.countWorkingDays(31) + " working days.");
        System.out.println("Month with 28 day has " + forLoopContinue.countWorkingDays(28) + " working days.");
    }

    public int countWorkingDays(int daysInMonth) {
        int workingDays = 0;
        for(int i = daysInMonth; i >= 0; i--) {
            if (i % 6 == 0 || i % 7 == 0) {
                continue;
            }
            workingDays++;
        }
        return workingDays;
    }

}
