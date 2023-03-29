package student_vladislav_romanov.lesson_10.bookDatabase.uIActions;

import student_vladislav_romanov.lesson_10.bookDatabase.core.Book;
import student_vladislav_romanov.lesson_10.bookDatabase.core.BookDatabase;

public class FillUpDbWithDefaultBooks implements UIAction {

    private BookDatabase bookDatabase;

    public FillUpDbWithDefaultBooks(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {
        Book shogun = new Book("Джеймс Клавелл", "Сёгун", "2008");
        Book taipan = new Book("Джеймс Клавелл", "Тай-Пэн", "2008");
        Book falconGuard = new Book("Роберт Торстон", "Соколиная стража", "2010");
        Book mysteryIsland = new Book("Жюль Верн", "Таинственный остров", "2020");
        Book travelToTheCenterOfEarth = new Book("Жюль Верн", "Путешествие к центру Земли", "2020");
        Book treasureIsland = new Book("Роберт Льюис Стивенсон", "Остров сокровищ", "2019");
        bookDatabase.save(shogun);
        bookDatabase.save(taipan);
        bookDatabase.save(falconGuard);
        bookDatabase.save(mysteryIsland);
        bookDatabase.save(travelToTheCenterOfEarth);
        bookDatabase.save(treasureIsland);
        System.out.println("Книги по-умолчанию добавлены");
    }
}
