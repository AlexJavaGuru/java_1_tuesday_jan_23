package student_natalija_rasponomarjova.lesson_6.level_3;

class ArrayServiceDemo {
    public static void main(String[] args) {
        int[] numbers = new int[]{2, 4, 6, 89, 3, 90, 23, 45, 87, 2};
        ArrayService arrayService = new ArrayService();
        System.out.println(arrayService.contains(numbers, 45));
    }
}
