package student_aleksandrs_lezhennikovs.lesson_13.level_5;

class StringCalculatorDemo {
    public static void main(String[] args) {
        String demoText = "[;][&] [*]\n1;2 ; 5,  2 @ 0 \n !#$%^()_+= 3 & 0 * 1";
        StringCalculator stringCalculator = new StringCalculator();
        System.out.println(stringCalculator.add(demoText));
    }
}
