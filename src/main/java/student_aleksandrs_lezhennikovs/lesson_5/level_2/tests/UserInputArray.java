package student_aleksandrs_lezhennikovs.lesson_5.level_2.tests;

class UserInputArray {

    UserInputArray userInputArray = new UserInputArray() {

    };

    int[] arrayForNumbers = new int[3];

    public void setArrayForNumbers(int index, int numbers) {
        this.arrayForNumbers[index] = numbers;
    }

    public int[] getArrayForNumbers() {
        return arrayForNumbers;
    }
}
