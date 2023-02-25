package student_natalija_rasponomarjova.lesson_6.level_3;

class ArrayService {
    boolean contains(int[] array, int numberToSearch) {
        for (int number : array) {
            if (number == numberToSearch) {
                return true;
            }
        }
        return false;
    }
}

