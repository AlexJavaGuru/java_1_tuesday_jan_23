package student_aleksandrs_lezhennikovs.lesson_9.level_5.consoleUI;

import student_aleksandrs_lezhennikovs.lesson_9.level_5.services.SearchByAuthorLettersService;

import java.util.Scanner;

public class SearchByAuthorLettersUIAction implements UIActions{
    private SearchByAuthorLettersService searchByAuthorLettersService;
    private UtilitiesUI utilitiesUI;

    public SearchByAuthorLettersUIAction(SearchByAuthorLettersService searchByAuthorLettersService) {
        this.searchByAuthorLettersService = searchByAuthorLettersService;
    }

    @Override
    public void execute() {
        System.out.println("Input searching part of authors name please:");
        Scanner input = new Scanner(System.in);
        String authorPart = input.nextLine();
        utilitiesUI.printBookList(searchByAuthorLettersService.searchByAuthorLetters(authorPart));
    }
}
