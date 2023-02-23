package student_vladislav_romanov.lesson_6.level_4;

class WhileLoopContinue {

    public static void main(String[] args) {
        WhileLoopContinue whileLoopContinue = new WhileLoopContinue();
        System.out.println("Month with 31 day has " + whileLoopContinue.countWorkingDays(31) + " working days.");
        System.out.println("Month with 28 day has " + whileLoopContinue.countWorkingDays(28) + " working days.");
    }

    public int countWorkingDays(int daysInMonth) {
        int workingDays = 0;
        while(daysInMonth > 0) {
            if (daysInMonth % 6 == 0 || daysInMonth % 7 == 0) {
                daysInMonth--;
                continue;
            }
            workingDays++;
            daysInMonth--;
        }
        return workingDays;
    }

}
