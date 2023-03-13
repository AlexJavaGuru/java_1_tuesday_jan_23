package student_vladislav_romanov.lesson_8.level_6;

class Varargs {

    public static void main(String[] args) {
        Varargs varargs = new Varargs();
        System.out.println(varargs.getAverage(2,5,4,2,4,6,7,89,7,6,3,2,4,5,6,7,8,43,3,8,9,65,32,3,4,7,8,5));
    }

    public double getAverage(int... numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return (double) sum / numbers.length;
    }
}
