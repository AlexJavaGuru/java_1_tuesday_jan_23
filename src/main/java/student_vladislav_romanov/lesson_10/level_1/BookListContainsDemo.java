package student_vladislav_romanov.lesson_10.level_1;

import java.util.ArrayList;
import java.util.List;

class BookListContainsDemo {

    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        Book shogun = new Book("Сёгун", "Джеймс Клавелл");
        Book taipan = new Book("Тай-Пэн", "Джеймс Клавелл");
        Book falconGuard = new Book("Соколиная стража", "Роберт Торстон");

        books.add(shogun);
        books.add(taipan);
        books.add(falconGuard);

        Book newBook = new Book("Сёгун", "Джеймс Клавелл");
        System.out.println(books.contains(newBook)); // true

        Book newBook2 = new Book("Сёгун", "Роберт Торстон");
        System.out.println(books.contains(newBook2)); // false

    }

}
