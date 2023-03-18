package student_aleksandrs_lezhennikovs.lesson_8.level_6;

class Varargs {
    public static void main(String[] args) {
        Varargs varargs = new Varargs();
        varargs.printText("Hello", "my", "dear", "friends", "!");
        varargs.printNumbers(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    }

    void printText(String... text) {
        for (int i = 0; i < text.length; i++) {
            System.out.println(text[i]);
        }
    }

    void printNumbers(int... numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}

