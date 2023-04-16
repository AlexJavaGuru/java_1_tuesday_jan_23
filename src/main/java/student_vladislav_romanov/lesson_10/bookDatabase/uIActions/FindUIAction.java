package student_vladislav_romanov.lesson_10.bookDatabase.uIActions;

import student_vladislav_romanov.lesson_10.bookDatabase.core.Book;
import student_vladislav_romanov.lesson_10.bookDatabase.core.BookDatabase;
import student_vladislav_romanov.lesson_10.bookDatabase.search.*;

import java.util.List;
import java.util.Scanner;

public class FindUIAction implements UIAction {

    BookDatabase bookDatabase;

    public FindUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        int criteria;
        String leftCondition = "";
        String rightCondition = "";
        List<Book> findResult;

        criteria = askSearchCriteria();

        if (criteria > 0 && criteria <= 3) {
            System.out.print("Пожалуйста введите условие поиска: ");
            leftCondition = scanner.nextLine();
        } else if (criteria > 3 && criteria <= 9) {
            System.out.print("Пожалуйста введите 1 условие поиска: ");
            leftCondition = scanner.nextLine();
            System.out.print("Пожалуйста введите 2 условие поиска: ");
            rightCondition = scanner.nextLine();
        }

        findResult = findResults(criteria, leftCondition, rightCondition);

        findResult = askPagination(findResult);

        findResult = askSort(findResult);

        printFindResults(findResult);

    }

    private List<Book> findResults(int criteria, String leftCondition, String rightCondition) {
        List<Book> findResult = null;
        switch (criteria) {
            case 1 -> findResult = bookDatabase.find(new AuthorSearchCriteria(leftCondition));
            case 2 -> findResult = bookDatabase.find(new TitleSearchCriteria(leftCondition));
            case 3 -> findResult = bookDatabase.find(new YearOfIssueSearchCriteria(leftCondition));
            case 4 -> findResult = bookDatabase.find(new AndSearchCriteria(new AuthorSearchCriteria(leftCondition), new TitleSearchCriteria(rightCondition)));
            case 5 -> findResult = bookDatabase.find(new AndSearchCriteria(new AuthorSearchCriteria(leftCondition), new YearOfIssueSearchCriteria(rightCondition)));
            case 6 -> findResult = bookDatabase.find(new AndSearchCriteria(new TitleSearchCriteria(leftCondition), new YearOfIssueSearchCriteria(rightCondition)));
            case 7 -> findResult = bookDatabase.find(new OrSearchCriteria(new AuthorSearchCriteria(leftCondition), new TitleSearchCriteria(rightCondition)));
            case 8 -> findResult = bookDatabase.find(new OrSearchCriteria(new AuthorSearchCriteria(leftCondition), new YearOfIssueSearchCriteria(rightCondition)));
            case 9 -> findResult = bookDatabase.find(new OrSearchCriteria(new TitleSearchCriteria(leftCondition), new YearOfIssueSearchCriteria(rightCondition)));
            default -> System.out.println("Такого критерия не существует");
        }
        return findResult;
    }

    private int askSearchCriteria() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("----------------------------------------------------------");
        System.out.println("Поиск по автору - 1");
        System.out.println("Поиск по названию - 2");
        System.out.println("Поиск по году - 3");
        System.out.println("Поиск по автору и названию - 4");
        System.out.println("Поиск по автору и году - 5");
        System.out.println("Поиск по названию и году - 6");
        System.out.println("Поиск по автору или названию - 7");
        System.out.println("Поиск по автору или году - 8");
        System.out.println("Поиск по названию или году - 9");
        System.out.print("Пожалуйста введите критерий поиска: ");

        return Integer.parseInt(scanner.nextLine());
    }

    private List<Book> askPagination(List<Book> findResult) {
        Scanner scanner = new Scanner(System.in);
        Paginate paginate = new Paginate();
        int pagination;

        System.out.print("Пожалуйста введите номер страницы результатов (0 для вывода всех результатов): ");
        pagination = Integer.parseInt(scanner.nextLine());

        if (pagination > 0) {
            findResult = paginate.split(findResult, pagination);
        }

        return findResult;
    }

    private List<Book> askSort(List<Book> findResult) {
        Scanner scanner = new Scanner(System.in);
        Sort sort = new Sort();
        String sorting;

        System.out.print("Пожалуйста введите тип сортировки (По-возрастанию - asc, по-убыванию - desc или оставьте пустым если сортировка не нужна): ");
        sorting = scanner.nextLine();

        if (sorting.equals("asc")) {
            findResult = sort.ascSorting(findResult);
        } else if (sorting.equals("desc")) {
            findResult = sort.descSorting(findResult);
        }

        return findResult;
    }

    private void printFindResults(List<Book> findResult) {
        System.out.println(findResult);
    }

}
