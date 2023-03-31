package student_aleksandrs_lezhennikovs.lesson_11.level_1.task_4;

class SafeBoxHack {
    public static void main(String[] args) {
        SafeBox notSafeBox = new SafeBox();
        notSafeBox.deposit = 200;
        notSafeBox.pinCode = 000;
        notSafeBox.deposit = 0;

    }


}
