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
        Book gaijin = new Book("Джеймс Клавелл", "Гайджин", "2008");
        Book falconGuard = new Book("Роберт Торстон", "Соколиная стража", "2010");
        Book mysteryIsland = new Book("Жюль Верн", "Таинственный остров", "2020");
        Book travelToTheCenterOfEarth = new Book("Жюль Верн", "Путешествие к центру Земли", "2020");
        Book treasureIsland = new Book("Роберт Льюис Стивенсон", "Остров сокровищ", "2019");
        Book houbleHouse = new Book("Джеймс Клавелл", "Благородный дом", "2008");
        Book shamal = new Book("Джеймс Клавелл", "Шамал", "2008");
        Book catriona = new Book("Роберт Льюис Стивенсон", "Катриона", "2019");
        Book twentyThousandLieUnderWater = new Book("Жюль Верн", "20000 лье под водой", "2003");
        Book childrenOfCaptainGrant = new Book("Жюль Верн", "Дети капитана Гранта", "1998");
        Book nightOnSerbia = new Book("Дмитрий Черкасов", "Ночь над Сербией", "1998");
        Book balkanTiger = new Book("Дмитрий Черкасов", "Балканский тигр", "1998");
        Book kosovoFieldBalkan = new Book("Дмитрий Черкасов", "Косово поле: Балканы", "1998");
        Book kosovoFieldRussia = new Book("Дмитрий Черкасов", "Косово поле: Россия", "1998");
        Book presidentsLastSoldier = new Book("Дмитрий Черкасов", "Последний солдат президента", "1998");
        Book guyFromBaghdad = new Book("Дмитрий Черкасов", "Багдадский хлопец", "1998");
        bookDatabase.save(shogun);
        bookDatabase.save(taipan);
        bookDatabase.save(gaijin);
        bookDatabase.save(falconGuard);
        bookDatabase.save(mysteryIsland);
        bookDatabase.save(travelToTheCenterOfEarth);
        bookDatabase.save(treasureIsland);
        bookDatabase.save(houbleHouse);
        bookDatabase.save(shamal);
        bookDatabase.save(catriona);
        bookDatabase.save(twentyThousandLieUnderWater);
        bookDatabase.save(childrenOfCaptainGrant);
        bookDatabase.save(nightOnSerbia);
        bookDatabase.save(balkanTiger);
        bookDatabase.save(kosovoFieldBalkan);
        bookDatabase.save(kosovoFieldRussia);
        bookDatabase.save(presidentsLastSoldier);
        bookDatabase.save(guyFromBaghdad);
        System.out.println("Книги по-умолчанию добавлены");
    }
}
