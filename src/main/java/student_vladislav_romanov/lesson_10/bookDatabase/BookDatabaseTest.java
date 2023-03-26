package student_vladislav_romanov.lesson_10.bookDatabase;

import student_vladislav_romanov.TestUtil;

import java.util.*;

class BookDatabaseTest extends TestUtil {

    public static void main(String[] args) {
        BookDatabaseTest bookDatabaseTest = new BookDatabaseTest();
        bookDatabaseTest.saveTestSucceed();
        bookDatabaseTest.saveTestFailed();
        bookDatabaseTest.deleteByIdTestSucceed();
        bookDatabaseTest.deleteByIdTestFailed();
        bookDatabaseTest.deleteByBookTestSucceed();
        bookDatabaseTest.deleteByBookTestFailed();
        bookDatabaseTest.findByIdTestSucceed();
        bookDatabaseTest.findByIdTestFailed();
        bookDatabaseTest.findByAuthorTestSucceed();
        bookDatabaseTest.findByAuthorTestFailed();
        bookDatabaseTest.findByTitleTestSucceed();
        bookDatabaseTest.findByTitleTestFailed();
        bookDatabaseTest.countAllBooksTestSucceed();
        bookDatabaseTest.countAllBooksTestFailed();
        bookDatabaseTest.deleteByAuthorTestSucceed();
        bookDatabaseTest.deleteByAuthorTestFailed();
        bookDatabaseTest.deleteByTitleTestSucceed();
        bookDatabaseTest.deleteByTitleTestFailed();
        bookDatabaseTest.authorSearchCriteriaTestSucceed();
        bookDatabaseTest.authorSearchCriteriaTestFailed();
        bookDatabaseTest.titleSearchCriteriaTestSucceed();
        bookDatabaseTest.titleSearchCriteriaTestFailed();
        bookDatabaseTest.yearOfIssueToSearchTestSucceed();
        bookDatabaseTest.yearOfIssueToSearchTestFailed();
        bookDatabaseTest.andSearchCriteriaAuthorYearTestSucceed();
        bookDatabaseTest.andSearchCriteriaAuthorYearTestFailed();
        bookDatabaseTest.andSearchCriteriaAuthorTitleTestSucceed();
        bookDatabaseTest.andSearchCriteriaAuthorTitleTestFailed();
        bookDatabaseTest.andSearchCriteriaTitleYearTestSucceed();
        bookDatabaseTest.andSearchCriteriaTitleYearTestFailed();
        bookDatabaseTest.orSearchCriteriaAuthorYearTestSucceed();
        bookDatabaseTest.orSearchCriteriaAuthorYearTestFailed();
        bookDatabaseTest.orSearchCriteriaAuthorTitleTestSucceed();
        bookDatabaseTest.orSearchCriteriaAuthorTitleTestFailed();
        bookDatabaseTest.orSearchCriteriaTitleYearTestSucceed();
        bookDatabaseTest.orSearchCriteriaTitleYearTestFailed();
        bookDatabaseTest.complexAndSearchTestSucceed();
        bookDatabaseTest.complexAndSearchTestFailed();
        bookDatabaseTest.complexOrSearchTestSucceed();
        bookDatabaseTest.complexOrSearchTestFailed();
        bookDatabaseTest.findUniqueAuthorsTestSucceed();
        bookDatabaseTest.findUniqueAuthorsTestFailed();
        bookDatabaseTest.findUniqueTitlesTestSucceed();
        bookDatabaseTest.findUniqueTitlesTestFailed();
        bookDatabaseTest.findUniqueBooksTestSucceed();
        bookDatabaseTest.findUniqueBooksTestFailed();
        bookDatabaseTest.printStat();
    }

    public void saveTestSucceed() {
        BookDatabase bookDatabase = new BookDatabaseImpl();
        Book shogun = new Book("Джеймс Клавелл", "Сёгун");

        long expected = 1;
        long current = bookDatabase.save(shogun);
        printResult(current == expected, "saveTestSucceed");
    }

    public void saveTestFailed() {
        BookDatabase bookDatabase = new BookDatabaseImpl();
        Book shogun = new Book("Джеймс Клавелл", "Сёгун");

        long expected = 10;
        long current = bookDatabase.save(shogun);
        printResult(current != expected, "saveTestFailed");
    }

    public void deleteByIdTestSucceed() {
        BookDatabase bookDatabase = new BookDatabaseImpl();
        Book shogun = new Book("Джеймс Клавелл", "Сёгун");

        boolean expected = true;
        bookDatabase.save(shogun);
        boolean current = bookDatabase.delete((long) 1);
        printResult(current == expected, "deleteByIdTestSucceed");
    }

    public void deleteByIdTestFailed() {
        BookDatabase bookDatabase = new BookDatabaseImpl();
        Book shogun = new Book("Джеймс Клавелл", "Сёгун");

        boolean expected = false;
        bookDatabase.save(shogun);
        boolean current = bookDatabase.delete((long) 2);
        printResult(current == expected, "deleteByIdTestFailed");
    }

    public void deleteByBookTestSucceed() {
        BookDatabase bookDatabase = new BookDatabaseImpl();
        Book shogun = new Book("Джеймс Клавелл", "Сёгун");
        Book taipan = new Book("Джеймс Клавелл", "Тай-Пэн");

        boolean expected = true;
        bookDatabase.save(shogun);
        bookDatabase.save(taipan);
        boolean current = bookDatabase.delete(shogun);
        printResult(current == expected, "deleteByBookTestSucceed");
    }

    public void deleteByBookTestFailed() {
        BookDatabase bookDatabase = new BookDatabaseImpl();
        Book shogun = new Book("Джеймс Клавелл", "Сёгун");
        Book taipan = new Book("Джеймс Клавелл", "Тай-Пэн");

        boolean expected = false;
        bookDatabase.save(shogun);
        boolean current = bookDatabase.delete(taipan);
        printResult(current == expected, "deleteByBookTestFailed");
    }

    public void findByIdTestSucceed() {
        BookDatabase bookDatabase = new BookDatabaseImpl();
        Book shogun = new Book("Джеймс Клавелл", "Сёгун");
        Book taipan = new Book("Джеймс Клавелл", "Тай-Пэн");

        bookDatabase.save(shogun);
        bookDatabase.save(taipan);

        Optional<Book> expected = Optional.of(taipan);
        Optional<Book> current = bookDatabase.findById((long) 2);

        printResult(current.equals(expected), "findByIdTestSucceed");
    }

    public void findByIdTestFailed() {
        BookDatabase bookDatabase = new BookDatabaseImpl();
        Book shogun = new Book("Джеймс Клавелл", "Сёгун");

        bookDatabase.save(shogun);

        Optional<Book> expected = Optional.empty();
        Optional<Book> current = bookDatabase.findById((long) 2);

        printResult(current.equals(expected), "findByIdTestFailed");
    }

    public void findByAuthorTestSucceed() {
        BookDatabase bookDatabase = new BookDatabaseImpl();
        Book shogun = new Book("Джеймс Клавелл", "Сёгун");
        Book taipan = new Book("Джеймс Клавелл", "Тай-Пэн");
        Book falconGuard = new Book("Роберт Торстон", "Соколиная стража");

        bookDatabase.save(shogun);
        bookDatabase.save(taipan);
        bookDatabase.save(falconGuard);

        List<Book> expected = new ArrayList<>();
        expected.add(shogun);
        expected.add(taipan);

        List<Book> current = bookDatabase.findByAuthor("Клавелл");

        printResult(current.equals(expected), "findByAuthorTestSucceed");
    }

    public void findByAuthorTestFailed() {
        BookDatabase bookDatabase = new BookDatabaseImpl();
        Book shogun = new Book("Джеймс Клавелл", "Сёгун");
        Book taipan = new Book("Джеймс Клавелл", "Тай-Пэн");
        Book falconGuard = new Book("Роберт Торстон", "Соколиная стража");

        bookDatabase.save(shogun);
        bookDatabase.save(taipan);
        bookDatabase.save(falconGuard);

        List<Book> expected = new ArrayList<>();
        expected.add(shogun);
        expected.add(taipan);

        List<Book> current = bookDatabase.findByAuthor("Роберт");

        printResult(!current.equals(expected), "findByAuthorTestFailed");
    }

    public void findByTitleTestSucceed() {
        BookDatabase bookDatabase = new BookDatabaseImpl();
        Book mysteryIsland = new Book("Жюль Верн", "Таинственный остров");
        Book travelToTheCenterOfEarth = new Book("Жюль Верн", "Путешествие к центру Земли");
        Book treasureIsland = new Book("Роберт Льюис Стивенсон", "Остров сокровищ");

        bookDatabase.save(mysteryIsland);
        bookDatabase.save(travelToTheCenterOfEarth);
        bookDatabase.save(treasureIsland);

        List<Book> expected = new ArrayList<>();
        expected.add(mysteryIsland);
        expected.add(treasureIsland);

        List<Book> current = bookDatabase.findByTitle("остров");

        printResult(current.equals(expected), "findByTitleTestSucceed");
    }

    public void findByTitleTestFailed() {
        BookDatabase bookDatabase = new BookDatabaseImpl();
        Book mysteryIsland = new Book("Жюль Верн", "Таинственный остров");
        Book travelToTheCenterOfEarth = new Book("Жюль Верн", "Путешествие к центру Земли");
        Book treasureIsland = new Book("Роберт Льюис Стивенсон", "Остров сокровищ");

        bookDatabase.save(mysteryIsland);
        bookDatabase.save(travelToTheCenterOfEarth);
        bookDatabase.save(treasureIsland);

        List<Book> expected = new ArrayList<>();
        expected.add(mysteryIsland);
        expected.add(treasureIsland);

        List<Book> current = bookDatabase.findByTitle("путешествие");

        printResult(!current.equals(expected), "findByTitleTestFailed");
    }

    public void countAllBooksTestSucceed() {
        BookDatabase bookDatabase = new BookDatabaseImpl();
        Book mysteryIsland = new Book("Жюль Верн", "Таинственный остров");
        Book travelToTheCenterOfEarth = new Book("Жюль Верн", "Путешествие к центру Земли");
        Book treasureIsland = new Book("Роберт Льюис Стивенсон", "Остров сокровищ");

        bookDatabase.save(mysteryIsland);
        bookDatabase.save(travelToTheCenterOfEarth);
        bookDatabase.save(treasureIsland);

        int expected = 3;
        int current = bookDatabase.countAllBooks();

        printResult(current == expected, "countAllBooksTestSucceed");
    }

    public void countAllBooksTestFailed() {
        BookDatabase bookDatabase = new BookDatabaseImpl();
        Book mysteryIsland = new Book("Жюль Верн", "Таинственный остров");
        Book travelToTheCenterOfEarth = new Book("Жюль Верн", "Путешествие к центру Земли");
        Book treasureIsland = new Book("Роберт Льюис Стивенсон", "Остров сокровищ");

        bookDatabase.save(mysteryIsland);
        bookDatabase.save(travelToTheCenterOfEarth);
        bookDatabase.save(treasureIsland);

        int expected = 2;
        int current = bookDatabase.countAllBooks();

        printResult(current != expected, "countAllBooksTestFailed");
    }

    public void deleteByAuthorTestSucceed() {
        BookDatabase bookDatabase = new BookDatabaseImpl();
        Book shogun = new Book("Джеймс Клавелл", "Сёгун");
        Book taipan = new Book("Джеймс Клавелл", "Тай-Пэн");
        Book falconGuard = new Book("Роберт Торстон", "Соколиная стража");

        bookDatabase.save(shogun);
        bookDatabase.save(taipan);
        bookDatabase.save(falconGuard);
        bookDatabase.deleteByAuthor("торстон");

        BookDatabase expected = new BookDatabaseImpl();
        expected.save(shogun);
        expected.save(taipan);

        BookDatabase current = bookDatabase;

        printResult(current.equals(expected), "deleteByAuthorTestSucceed");
    }

    public void deleteByAuthorTestFailed() {
        BookDatabase bookDatabase = new BookDatabaseImpl();
        Book shogun = new Book("Джеймс Клавелл", "Сёгун");
        Book taipan = new Book("Джеймс Клавелл", "Тай-Пэн");
        Book falconGuard = new Book("Роберт Торстон", "Соколиная стража");

        bookDatabase.save(shogun);
        bookDatabase.save(taipan);
        bookDatabase.save(falconGuard);
        bookDatabase.deleteByAuthor("торстон");

        BookDatabase expected = new BookDatabaseImpl();
        expected.save(shogun);

        BookDatabase current = bookDatabase;

        printResult(!current.equals(expected), "deleteByAuthorTestFailed");
    }

    public void deleteByTitleTestSucceed() {
        BookDatabase bookDatabase = new BookDatabaseImpl();
        Book mysteryIsland = new Book("Жюль Верн", "Таинственный остров");
        Book travelToTheCenterOfEarth = new Book("Жюль Верн", "Путешествие к центру Земли");
        Book treasureIsland = new Book("Роберт Льюис Стивенсон", "Остров сокровищ");

        bookDatabase.save(mysteryIsland);
        bookDatabase.save(travelToTheCenterOfEarth);
        bookDatabase.save(treasureIsland);
        bookDatabase.deleteByTitle("путешествие");

        BookDatabase expected = new BookDatabaseImpl();
        expected.save(mysteryIsland);
        expected.save(treasureIsland);

        BookDatabase current = bookDatabase;

        printResult(current.equals(expected), "deleteByTitleTestSucceed");
    }

    public void deleteByTitleTestFailed() {
        BookDatabase bookDatabase = new BookDatabaseImpl();
        Book mysteryIsland = new Book("Жюль Верн", "Таинственный остров");
        Book travelToTheCenterOfEarth = new Book("Жюль Верн", "Путешествие к центру Земли");
        Book treasureIsland = new Book("Роберт Льюис Стивенсон", "Остров сокровищ");

        bookDatabase.save(mysteryIsland);
        bookDatabase.save(travelToTheCenterOfEarth);
        bookDatabase.save(treasureIsland);
        bookDatabase.deleteByTitle("путешествие");

        BookDatabase expected = new BookDatabaseImpl();
        expected.save(mysteryIsland);

        BookDatabase current = bookDatabase;

        printResult(!current.equals(expected), "deleteByTitleTestFailed");
    }

    public void authorSearchCriteriaTestSucceed() {
        AuthorSearchCriteria authorSearchCriteria = new AuthorSearchCriteria("Жюль Верн");
        Book mysteryIsland = new Book("Жюль Верн", "Таинственный остров");

        boolean expected = true;
        boolean current = authorSearchCriteria.match(mysteryIsland);
        printResult(current == expected, "authorSearchCriteriaTestSucceed");
    }

    public void authorSearchCriteriaTestFailed() {
        AuthorSearchCriteria authorSearchCriteria = new AuthorSearchCriteria("Жюль Верн");
        Book treasureIsland = new Book("Роберт Льюис Стивенсон", "Остров сокровищ");

        boolean expected = false;
        boolean current = authorSearchCriteria.match(treasureIsland);
        printResult(current == expected, "authorSearchCriteriaTestFailed");
    }

    public void titleSearchCriteriaTestSucceed() {
        TitleSearchCriteria titleSearchCriteria = new TitleSearchCriteria("Таинственный остров");
        Book mysteryIsland = new Book("Жюль Верн", "Таинственный остров");

        boolean expected = true;
        boolean current = titleSearchCriteria.match(mysteryIsland);
        printResult(current == expected, "titleSearchCriteriaTestSucceed");
    }

    public void titleSearchCriteriaTestFailed() {
        TitleSearchCriteria titleSearchCriteria = new TitleSearchCriteria("Таинственный остров");
        Book treasureIsland = new Book("Роберт Льюис Стивенсон", "Остров сокровищ");

        boolean expected = false;
        boolean current = titleSearchCriteria.match(treasureIsland);
        printResult(current == expected, "titleSearchCriteriaTestFailed");
    }

    public void yearOfIssueToSearchTestSucceed() {
        YearOfIssueSearchCriteria yearOfIssueSearchCriteria = new YearOfIssueSearchCriteria("2020");
        Book mysteryIsland = new Book("Жюль Верн", "Таинственный остров", "2020");

        boolean expected = true;
        boolean current = yearOfIssueSearchCriteria.match(mysteryIsland);
        printResult(current == expected, "yearOfIssueToSearchTestSucceed");
    }

    public void yearOfIssueToSearchTestFailed() {
        YearOfIssueSearchCriteria yearOfIssueSearchCriteria = new YearOfIssueSearchCriteria("2020");
        Book treasureIsland = new Book("Роберт Льюис Стивенсон", "Остров сокровищ", "2023");

        boolean expected = false;
        boolean current = yearOfIssueSearchCriteria.match(treasureIsland);
        printResult(current == expected, "yearOfIssueToSearchTestFailed");
    }

    public void andSearchCriteriaAuthorYearTestSucceed() {
        AuthorSearchCriteria authorSearchCriteria = new AuthorSearchCriteria("Жюль Верн");
        YearOfIssueSearchCriteria yearOfIssueSearchCriteria = new YearOfIssueSearchCriteria("2020");
        AndSearchCriteria andSearchCriteria = new AndSearchCriteria(authorSearchCriteria, yearOfIssueSearchCriteria);
        Book mysteryIsland = new Book("Жюль Верн", "Таинственный остров", "2020");

        boolean expected = true;
        boolean current = andSearchCriteria.match(mysteryIsland);

        printResult(current == expected, "andSearchCriteriaAuthorYearTestSucceed");
    }

    public void andSearchCriteriaAuthorYearTestFailed() {
        AuthorSearchCriteria authorSearchCriteria = new AuthorSearchCriteria("Жюль Верн");
        YearOfIssueSearchCriteria yearOfIssueSearchCriteria = new YearOfIssueSearchCriteria("2020");
        AndSearchCriteria andSearchCriteria = new AndSearchCriteria(authorSearchCriteria, yearOfIssueSearchCriteria);
        Book treasureIsland = new Book("Роберт Льюис Стивенсон", "Остров сокровищ", "2023");

        boolean expected = false;
        boolean current = andSearchCriteria.match(treasureIsland);

        printResult(current == expected, "andSearchCriteriaAuthorYearTestFailed");
    }

    public void andSearchCriteriaAuthorTitleTestSucceed() {
        AuthorSearchCriteria authorSearchCriteria = new AuthorSearchCriteria("Жюль Верн");
        TitleSearchCriteria titleSearchCriteria = new TitleSearchCriteria("Таинственный остров");
        AndSearchCriteria andSearchCriteria = new AndSearchCriteria(authorSearchCriteria, titleSearchCriteria);
        Book mysteryIsland = new Book("Жюль Верн", "Таинственный остров", "2020");

        boolean expected = true;
        boolean current = andSearchCriteria.match(mysteryIsland);

        printResult(current == expected, "andSearchCriteriaAuthorTitleTestSucceed");
    }

    public void andSearchCriteriaAuthorTitleTestFailed() {
        AuthorSearchCriteria authorSearchCriteria = new AuthorSearchCriteria("Жюль Верн");
        TitleSearchCriteria titleSearchCriteria = new TitleSearchCriteria("Таинственный остров");
        AndSearchCriteria andSearchCriteria = new AndSearchCriteria(authorSearchCriteria, titleSearchCriteria);
        Book treasureIsland = new Book("Роберт Льюис Стивенсон", "Остров сокровищ", "2023");

        boolean expected = false;
        boolean current = andSearchCriteria.match(treasureIsland);

        printResult(current == expected, "andSearchCriteriaAuthorTitleTestFailed");
    }

    public void andSearchCriteriaTitleYearTestSucceed() {
        TitleSearchCriteria titleSearchCriteria = new TitleSearchCriteria("Таинственный остров");
        YearOfIssueSearchCriteria yearOfIssueSearchCriteria = new YearOfIssueSearchCriteria("2020");
        AndSearchCriteria andSearchCriteria = new AndSearchCriteria(titleSearchCriteria, yearOfIssueSearchCriteria);
        Book mysteryIsland = new Book("Жюль Верн", "Таинственный остров", "2020");

        boolean expected = true;
        boolean current = andSearchCriteria.match(mysteryIsland);

        printResult(current == expected, "andSearchCriteriaTitleYearTestSucceed");
    }

    public void andSearchCriteriaTitleYearTestFailed() {
        TitleSearchCriteria titleSearchCriteria = new TitleSearchCriteria("Таинственный остров");
        YearOfIssueSearchCriteria yearOfIssueSearchCriteria = new YearOfIssueSearchCriteria("2020");
        AndSearchCriteria andSearchCriteria = new AndSearchCriteria(titleSearchCriteria, yearOfIssueSearchCriteria);
        Book treasureIsland = new Book("Роберт Льюис Стивенсон", "Остров сокровищ", "2023");

        boolean expected = false;
        boolean current = andSearchCriteria.match(treasureIsland);

        printResult(current == expected, "andSearchCriteriaTitleYearTestFailed");
    }

    public void orSearchCriteriaAuthorYearTestSucceed() {
        AuthorSearchCriteria authorSearchCriteria = new AuthorSearchCriteria("Жюль Верн");
        YearOfIssueSearchCriteria yearOfIssueSearchCriteria = new YearOfIssueSearchCriteria("2023");
        OrSearchCriteria orSearchCriteria = new OrSearchCriteria(authorSearchCriteria, yearOfIssueSearchCriteria);
        Book mysteryIsland = new Book("Жюль Верн", "Таинственный остров", "2020");

        boolean expected = true;
        boolean current = orSearchCriteria.match(mysteryIsland);

        printResult(current == expected, "orSearchCriteriaAuthorYearTestSucceed");
    }

    public void orSearchCriteriaAuthorYearTestFailed() {
        AuthorSearchCriteria authorSearchCriteria = new AuthorSearchCriteria("Жюль Верн");
        YearOfIssueSearchCriteria yearOfIssueSearchCriteria = new YearOfIssueSearchCriteria("2020");
        OrSearchCriteria orSearchCriteria = new OrSearchCriteria(authorSearchCriteria, yearOfIssueSearchCriteria);
        Book treasureIsland = new Book("Роберт Льюис Стивенсон", "Остров сокровищ", "2023");

        boolean expected = false;
        boolean current = orSearchCriteria.match(treasureIsland);

        printResult(current == expected, "orSearchCriteriaAuthorYearTestFailed");
    }

    public void orSearchCriteriaAuthorTitleTestSucceed() {
        AuthorSearchCriteria authorSearchCriteria = new AuthorSearchCriteria("Роберт Льюис Стивенсон");
        TitleSearchCriteria titleSearchCriteria = new TitleSearchCriteria("Таинственный остров");
        OrSearchCriteria orSearchCriteria = new OrSearchCriteria(authorSearchCriteria, titleSearchCriteria);
        Book mysteryIsland = new Book("Жюль Верн", "Таинственный остров", "2020");

        boolean expected = true;
        boolean current = orSearchCriteria.match(mysteryIsland);

        printResult(current == expected, "orSearchCriteriaAuthorTitleTestSucceed");
    }

    public void orSearchCriteriaAuthorTitleTestFailed() {
        AuthorSearchCriteria authorSearchCriteria = new AuthorSearchCriteria("Жюль Верн");
        TitleSearchCriteria titleSearchCriteria = new TitleSearchCriteria("Таинственный остров");
        OrSearchCriteria orSearchCriteria = new OrSearchCriteria(authorSearchCriteria, titleSearchCriteria);
        Book treasureIsland = new Book("Роберт Льюис Стивенсон", "Остров сокровищ", "2023");

        boolean expected = false;
        boolean current = orSearchCriteria.match(treasureIsland);

        printResult(current == expected, "orSearchCriteriaAuthorTitleTestFailed");
    }

    public void orSearchCriteriaTitleYearTestSucceed() {
        TitleSearchCriteria titleSearchCriteria = new TitleSearchCriteria("Остров сокровищ");
        YearOfIssueSearchCriteria yearOfIssueSearchCriteria = new YearOfIssueSearchCriteria("2020");
        OrSearchCriteria orSearchCriteria = new OrSearchCriteria(titleSearchCriteria, yearOfIssueSearchCriteria);
        Book mysteryIsland = new Book("Жюль Верн", "Таинственный остров", "2020");

        boolean expected = true;
        boolean current = orSearchCriteria.match(mysteryIsland);

        printResult(current == expected, "orSearchCriteriaTitleYearTestSucceed");
    }

    public void orSearchCriteriaTitleYearTestFailed() {
        TitleSearchCriteria titleSearchCriteria = new TitleSearchCriteria("Таинственный остров");
        YearOfIssueSearchCriteria yearOfIssueSearchCriteria = new YearOfIssueSearchCriteria("2020");
        OrSearchCriteria orSearchCriteria = new OrSearchCriteria(titleSearchCriteria, yearOfIssueSearchCriteria);
        Book treasureIsland = new Book("Роберт Льюис Стивенсон", "Остров сокровищ", "2023");

        boolean expected = false;
        boolean current = orSearchCriteria.match(treasureIsland);

        printResult(current == expected, "orSearchCriteriaTitleYearTestFailed");
    }

    public void complexAndSearchTestSucceed() {
        BookDatabase bookDatabase = new BookDatabaseImpl();
        Book shogun = new Book("Джеймс Клавелл", "Сёгун", "2020");
        Book taipan = new Book("Джеймс Клавелл", "Тай-Пэн", "2020");
        Book falconGuard = new Book("Роберт Торстон", "Соколиная стража");

        bookDatabase.save(shogun);
        bookDatabase.save(taipan);
        bookDatabase.save(falconGuard);

        List<Book> expected = new ArrayList<>();
        expected.add(shogun);
        expected.add(taipan);

        List<Book> current = bookDatabase.find(new AndSearchCriteria(new AuthorSearchCriteria("Джеймс Клавелл"), new YearOfIssueSearchCriteria("2020")));

        printResult(current.equals(expected), "complexAndSearchTestSucceed");
    }

    public void complexAndSearchTestFailed() {
        BookDatabase bookDatabase = new BookDatabaseImpl();
        Book shogun = new Book("Джеймс Клавелл", "Сёгун", "2020");
        Book taipan = new Book("Джеймс Клавелл", "Тай-Пэн", "2020");
        Book falconGuard = new Book("Роберт Торстон", "Соколиная стража");

        bookDatabase.save(shogun);
        bookDatabase.save(taipan);
        bookDatabase.save(falconGuard);

        List<Book> expected = new ArrayList<>();
        expected.add(shogun);
        expected.add(falconGuard);

        List<Book> current = bookDatabase.find(new AndSearchCriteria(new AuthorSearchCriteria("Джеймс Клавелл"), new YearOfIssueSearchCriteria("2020")));

        printResult(!current.equals(expected), "complexAndSearchTestSucceed");
    }

    public void complexOrSearchTestSucceed() {
        BookDatabase bookDatabase = new BookDatabaseImpl();
        Book shogun = new Book("Джеймс Клавелл", "Сёгун", "2020");
        Book taipan = new Book("Джеймс Клавелл", "Тай-Пэн", "2020");
        Book falconGuard = new Book("Роберт Торстон", "Соколиная стража", "2023");

        bookDatabase.save(shogun);
        bookDatabase.save(taipan);
        bookDatabase.save(falconGuard);

        List<Book> expected = new ArrayList<>();
        expected.add(shogun);
        expected.add(taipan);
        expected.add(falconGuard);

        List<Book> current = bookDatabase.find(new OrSearchCriteria(new AuthorSearchCriteria("Джеймс Клавелл"), new YearOfIssueSearchCriteria("2023")));

        printResult(current.equals(expected), "complexAndSearchTestSucceed");
    }

    public void complexOrSearchTestFailed() {
        BookDatabase bookDatabase = new BookDatabaseImpl();
        Book shogun = new Book("Джеймс Клавелл", "Сёгун", "2020");
        Book taipan = new Book("Джеймс Клавелл", "Тай-Пэн", "2020");
        Book falconGuard = new Book("Роберт Торстон", "Соколиная стража");

        bookDatabase.save(shogun);
        bookDatabase.save(taipan);
        bookDatabase.save(falconGuard);

        List<Book> expected = new ArrayList<>();
        expected.add(shogun);
        expected.add(falconGuard);

        List<Book> current = bookDatabase.find(new OrSearchCriteria(new AuthorSearchCriteria("Джеймс Клавелл"), new YearOfIssueSearchCriteria("2023")));

        printResult(!current.equals(expected), "complexOrSearchTestSucceed");
    }

    public void findUniqueAuthorsTestSucceed() {
        BookDatabase bookDatabase = new BookDatabaseImpl();
        Book shogun = new Book("Джеймс Клавелл", "Сёгун", "2020");
        Book taipan = new Book("Джеймс Клавелл", "Тай-Пэн", "2020");
        Book falconGuard = new Book("Роберт Торстон", "Соколиная стража");
        Book mysteryIsland = new Book("Жюль Верн", "Таинственный остров");
        Book travelToTheCenterOfEarth = new Book("Жюль Верн", "Путешествие к центру Земли");
        Book treasureIsland = new Book("Роберт Льюис Стивенсон", "Остров сокровищ");

        bookDatabase.save(shogun);
        bookDatabase.save(taipan);
        bookDatabase.save(falconGuard);
        bookDatabase.save(mysteryIsland);
        bookDatabase.save(travelToTheCenterOfEarth);
        bookDatabase.save(treasureIsland);

        Set<String> expected = new HashSet<>();
        expected.add("Джеймс Клавелл");
        expected.add("Роберт Торстон");
        expected.add("Жюль Верн");
        expected.add("Роберт Льюис Стивенсон");

        Set<String> current = bookDatabase.findUniqueAuthors();

        printResult(current.equals(expected), "findUniqueAuthorsTestSucceed");
    }

    public void findUniqueAuthorsTestFailed() {
        BookDatabase bookDatabase = new BookDatabaseImpl();
        Book shogun = new Book("Джеймс Клавелл", "Сёгун", "2020");
        Book taipan = new Book("Джеймс Клавелл", "Тай-Пэн", "2020");
        Book falconGuard = new Book("Роберт Торстон", "Соколиная стража");
        Book mysteryIsland = new Book("Жюль Верн", "Таинственный остров");
        Book travelToTheCenterOfEarth = new Book("Жюль Верн", "Путешествие к центру Земли");
        Book treasureIsland = new Book("Роберт Льюис Стивенсон", "Остров сокровищ");

        bookDatabase.save(shogun);
        bookDatabase.save(taipan);
        bookDatabase.save(falconGuard);
        bookDatabase.save(mysteryIsland);
        bookDatabase.save(travelToTheCenterOfEarth);
        bookDatabase.save(treasureIsland);

        Set<String> expected = new HashSet<>();
        expected.add("Джеймс Клавелл");
        expected.add("Роберт Торстон");
        expected.add("Роберт Льюис Стивенсон");

        Set<String> current = bookDatabase.findUniqueAuthors();

        printResult(!current.equals(expected), "findUniqueAuthorsTestFailed");
    }

    public void findUniqueTitlesTestSucceed() {
        BookDatabase bookDatabase = new BookDatabaseImpl();
        Book shogun = new Book("Джеймс Клавелл", "Сёгун", "2020");
        Book taipan = new Book("Джеймс Клавелл", "Тай-Пэн", "2020");
        Book falconGuard = new Book("Роберт Торстон", "Соколиная стража");
        Book mysteryIsland = new Book("Жюль Верн", "Таинственный остров");
        Book travelToTheCenterOfEarth = new Book("Жюль Верн", "Путешествие к центру Земли");
        Book treasureIsland = new Book("Роберт Льюис Стивенсон", "Остров сокровищ");

        bookDatabase.save(shogun);
        bookDatabase.save(taipan);
        bookDatabase.save(falconGuard);
        bookDatabase.save(mysteryIsland);
        bookDatabase.save(travelToTheCenterOfEarth);
        bookDatabase.save(treasureIsland);

        Set<String> expected = new HashSet<>();
        expected.add("Сёгун");
        expected.add("Тай-Пэн");
        expected.add("Соколиная стража");
        expected.add("Таинственный остров");
        expected.add("Путешествие к центру Земли");
        expected.add("Остров сокровищ");

        Set<String> current = bookDatabase.findUniqueTitles();

        printResult(current.equals(expected), "findUniqueTitlesTestSucceed");
    }

    public void findUniqueTitlesTestFailed() {
        BookDatabase bookDatabase = new BookDatabaseImpl();
        Book shogun = new Book("Джеймс Клавелл", "Сёгун", "2020");
        Book taipan = new Book("Джеймс Клавелл", "Тай-Пэн", "2020");
        Book falconGuard = new Book("Роберт Торстон", "Соколиная стража");
        Book mysteryIsland = new Book("Жюль Верн", "Таинственный остров");
        Book travelToTheCenterOfEarth = new Book("Жюль Верн", "Путешествие к центру Земли");
        Book treasureIsland = new Book("Роберт Льюис Стивенсон", "Остров сокровищ");

        bookDatabase.save(shogun);
        bookDatabase.save(taipan);
        bookDatabase.save(falconGuard);
        bookDatabase.save(mysteryIsland);
        bookDatabase.save(travelToTheCenterOfEarth);
        bookDatabase.save(treasureIsland);

        Set<String> expected = new HashSet<>();
        expected.add("Сёгун");
        expected.add("Тай-Пэн");
        expected.add("Таинственный остров");

        Set<String> current = bookDatabase.findUniqueTitles();

        printResult(!current.equals(expected), "findUniqueTitlesTestFailed");
    }

    public void findUniqueBooksTestSucceed() {
        BookDatabase bookDatabase = new BookDatabaseImpl();
        Book shogun = new Book("Джеймс Клавелл", "Сёгун", "2020");
        Book taipan = new Book("Джеймс Клавелл", "Тай-Пэн", "2020");
        Book falconGuard = new Book("Роберт Торстон", "Соколиная стража");
        Book shogun2 = new Book("Джеймс Клавелл", "Сёгун", "2020");
        Book taipan2 = new Book("Джеймс Клавелл", "Тай-Пэн", "2020");

        bookDatabase.save(shogun);
        bookDatabase.save(taipan);
        bookDatabase.save(falconGuard);
        bookDatabase.save(taipan2);
        bookDatabase.save(shogun2);

        Set<Book> expected = new HashSet<>();
        expected.add(new Book("Джеймс Клавелл", "Сёгун", "2020"));
        expected.add(new Book("Джеймс Клавелл", "Тай-Пэн", "2020"));
        expected.add(new Book("Роберт Торстон", "Соколиная стража"));

        Set<Book> current = bookDatabase.findUniqueBooks();

        printResult(current.containsAll(expected), "findUniqueBooksTestSucceed");
    }

    public void findUniqueBooksTestFailed() {
        BookDatabase bookDatabase = new BookDatabaseImpl();
        Book shogun = new Book("Джеймс Клавелл", "Сёгун", "2020");
        Book taipan = new Book("Джеймс Клавелл", "Тай-Пэн", "2020");
        Book falconGuard = new Book("Роберт Торстон", "Соколиная стража");
        Book shogun2 = new Book("Джеймс Клавелл", "Сёгун", "2020");
        Book taipan2 = new Book("Джеймс Клавелл", "Тай-Пэн", "2020");

        bookDatabase.save(shogun);
        bookDatabase.save(taipan);
        bookDatabase.save(falconGuard);
        bookDatabase.save(taipan2);
        bookDatabase.save(shogun2);

        Set<Book> expected = new HashSet<>();
        expected.add(new Book("Джеймс Клавелл", "Сёгун", "2020"));
        expected.add(new Book("Джеймс Клавелл", "Тай-Пэн", "2020"));
        expected.add(new Book("Жюль Верн", "Путешествие к центру Земли", "2023"));

        Set<Book> current = bookDatabase.findUniqueBooks();

        printResult(!current.containsAll(expected), "findUniqueBooksTestFailed");
    }

}
