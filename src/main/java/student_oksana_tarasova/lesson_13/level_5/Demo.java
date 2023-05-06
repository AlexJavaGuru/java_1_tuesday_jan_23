package student_oksana_tarasova.lesson_13.level_5;

public class Demo {
    public static void main(String[] args) {

        StringCalculator stringCalculator = new StringCalculator(new WithThreeDelimiter(";", "&", "\\n"));
       System.out.println(stringCalculator.add("!2,2,2"));
       System.out.println(stringCalculator.add(""));
        StringCalculator stringCalculator1 = new StringCalculator(new WithOneDelimiter("&"));
        System.out.println(stringCalculator.add("2;2&222"));
        System.out.println(stringCalculator.add("*22,2"));
        System.out.println(stringCalculator.add("22,2,3,4,5,5,"));
        System.out.println(stringCalculator1.add("22,22&23;33"));
    }
}
