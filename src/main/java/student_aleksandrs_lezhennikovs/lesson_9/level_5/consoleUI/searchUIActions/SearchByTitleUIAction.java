package student_aleksandrs_lezhennikovs.lesson_9.level_5.consoleUI.searchUIActions;

import student_aleksandrs_lezhennikovs.lesson_9.level_5.consoleUI.UIActions;
import student_aleksandrs_lezhennikovs.lesson_9.level_5.consoleUI.UtilitiesUI;
import student_aleksandrs_lezhennikovs.lesson_9.level_5.services.searchServices.SearchByTitleService;

import java.util.Scanner;

public class SearchByTitleUIAction implements UIActions {
    private SearchByTitleService searchByTitleService;
    private UtilitiesUI utilitiesUI = new UtilitiesUI();

    public SearchByTitleUIAction(SearchByTitleService searchByTitleService) {
        this.searchByTitleService = searchByTitleService;
    }

    @Override
    public void execute() {
        System.out.println("Input searching book title please:");
        Scanner input = new Scanner(System.in);
        String title = input.nextLine();
        utilitiesUI.printBookList(searchByTitleService.searchByTitle(title));
    }
}
