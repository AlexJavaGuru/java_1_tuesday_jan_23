package student_julija_raudive.lesson_12.level_4;


import java.util.ArrayList;
import java.util.List;

class Task_25 {

     public static void main(String[] args) throws Exception{

         List<byte[]> list = new ArrayList<>();

         while (true) {
             byte[] b = new byte[10 * 1024 * 1024];
             list.add(b);
         }

     }
}
