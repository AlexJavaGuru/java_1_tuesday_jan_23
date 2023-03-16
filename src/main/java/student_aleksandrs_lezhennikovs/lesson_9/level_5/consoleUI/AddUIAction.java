package student_aleksandrs_lezhennikovs.lesson_9.level_5.consoleUI;

import student_aleksandrs_lezhennikovs.lesson_9.level_5.services.AddService;

import java.util.Scanner;

public class AddUIAction implements UIActions {

    private AddService addBookService;

    public AddUIAction(AddService addBookService) {
        this.addBookService = addBookService;
    }

    @Override
    public void execute() {
        Scanner input = new Scanner(System.in);
        System.out.println("Input book Title");
        String title = input.nextLine();
        System.out.println("Input book Author");
        String author = input.nextLine();
        addBookService.addBook(title, author);
    }
}
