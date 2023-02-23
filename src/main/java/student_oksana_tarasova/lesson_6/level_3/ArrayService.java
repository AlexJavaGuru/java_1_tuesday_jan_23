package student_oksana_tarasova.lesson_6.level_3;

class ArrayService {

    int givenNumber;

    public boolean containsTheGivenNumberInTheArray(int[] array, int givenNumber) {
        for (int numberArray : array) {
            if (givenNumber == numberArray) {
            }
        }
    }

    public void checkResult(boolean state, ) {
        if(state) {
            System.out.println("The array contains the number " + givenNumber);
        }
        System.out.println("The array does not contains the number " + givenNumber);
    }
}

