package student_oksana_tarasova.lesson_12.level_4;

class Recursion {
    int values[];

    Recursion(int i) {
        values = new int[i];
    }


    void printArray(int i) {
            printArray(i - 1);
            System.out.println("[" + (i - 1) + "] " + values[i - 1]);
    }

    public static void main(String[] args) {
        Recursion recursion = new Recursion(100);
        recursion.printArray(100);
    }
}

/*
C:\Users\Оксана\.jdks\openjdk-19.0.2\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.2.4\lib\idea_rt.jar=55287:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.2.4\bin" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath C:\Users\Оксана\IdeaProjects\java_1_tuesday_jan_23\out\production\java_1_tuesday_jan_23 student_oksana_tarasova.lesson_12.level_4.Recursion
Exception in thread "main" java.lang.StackOverflowError
	at student_oksana_tarasova.lesson_12.level_4.Recursion.printArray(Recursion.java:12)
	at student_oksana_tarasova.lesson_12.level_4.Recursion.printArray(Recursion.java:12)
	at student_oksana_tarasova.lesson_12.level_4.Recursion.printArray(Recursion.java:12)
 */

