package student_oksana_tarasova.Lesson_9.level_5;

import java.util.Objects;

public class Demo {
    public static void main(String[] args) {


        Book book1 = new Book("Kirill", "Kudryashov", "How I Became a God. Billy");
        Book book2 = new Book("Olga", "Avers", "Guests of Baba Yaga");
        Book book3 = new Book("Mariya", "Rashova", "On the streets of Istanbul");
        System.out.println(book2.toString());
        Book[] books = new Book[1];
        Demo2 demo = new Demo2(books);
        demo.add(book1);
        System.out.println(demo.toString());
        demo.add(book2);
        System.out.println(demo.toString());

        /*


        BookReaderImpl demo = new BookReaderImpl(books);
        demo.add(book1);
        System.out.println(demo.toString());
        demo.add(book2);
        System.out.println(demo.toString());
        demo.add(book3);
        System.out.println(demo.toString());


         */



    }


}
/*
        UserEntity userFirst = new UserEntity(1000000, "Ivan", "Ivanov", 11111111);
        UserEntity userSecond = new UserEntity(2000000, "Petr", "Petrov", 22222222);
        UserEntity userThird = new UserEntity(3000000, "Sidor", "Sidorov", 33333333);
        UserEntity userFour = new UserEntity(4000000, "Ivan", "Ivanov", 44444444);
        System.out.println(userFirst.toString());
        UserEntity[] users = new UserEntity[1];
        Repository userRepository = new Repository(users);
        userRepository.addUser(userFirst);
        System.out.println(userRepository.toString());
        userRepository.addUser(userSecond);
        System.out.println(userRepository.toString());

 */