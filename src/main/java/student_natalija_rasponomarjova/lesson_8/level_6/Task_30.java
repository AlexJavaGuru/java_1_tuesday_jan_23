package student_natalija_rasponomarjova.lesson_8.level_6;

class Task_30 {
    public static void main(String args[]) {
        show(1500);
        show();
        show(3, 4, 5, 6, 78, 88, 8);
    }

    static void show(int... numbers) {
        System.out.println("The number of arguments: " + numbers.length);
        for (int i1 : numbers)
            System.out.print(i1 + " ");
        System.out.println();
    }
}




