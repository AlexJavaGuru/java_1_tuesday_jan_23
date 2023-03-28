package student_aleksandrs_lezhennikovs.lesson_10.level_2.consolu_ui;

import student_aleksandrs_lezhennikovs.lesson_10.level_2.core.services.SaveBookService;
import student_aleksandrs_lezhennikovs.lesson_10.level_2.domain.Book;

import java.util.Scanner;

public class SaveBookUIAction implements UIAction {

    private SaveBookService saveBookService;

    public SaveBookUIAction(SaveBookService saveBookService) {
        this.saveBookService = saveBookService;
    }

    public void execute() {
        Scanner input = new Scanner(System.in);
        System.out.println("Input book's author");
        String author = input.nextLine();

        System.out.println("Input book's title");
        String title = input.nextLine();

        System.out.println("Input book's issue year");
        Integer issuerYear = input.nextInt();
        Book book = new Book(author, title, issuerYear);
        saveBookService.saveBook(book);
    }
}
