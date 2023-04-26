package student_oksana_tarasova.lesson_12.level_4;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

class ListBook {

    public static void main(String[] args) {
        List<Object[]> arrays = new LinkedList<>();
        for (; ; ) {
            arrays.add(new Objects[100]);
        }
    }
}
/*
C:\Users\Оксана\.jdks\openjdk-19.0.2\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.2.4\lib\idea_rt.jar=57927:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.2.4\bin" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath C:\Users\Оксана\IdeaProjects\java_1_tuesday_jan_23\out\production\java_1_tuesday_jan_23 student_oksana_tarasova.lesson_12.level_4.ListBook
Exception in thread "main" java.lang.OutOfMemoryError: Java heap space
	at student_oksana_tarasova.lesson_12.level_4.ListBook.main(ListBook.java:14)

Process finished with exit code 1
 */