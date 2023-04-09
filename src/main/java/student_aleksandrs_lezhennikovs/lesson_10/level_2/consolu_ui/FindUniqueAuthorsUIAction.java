package student_aleksandrs_lezhennikovs.lesson_10.level_2.consolu_ui;

import student_aleksandrs_lezhennikovs.lesson_10.level_2.core.services.FindUniqueAuthorsService;

public class FindUniqueAuthorsUIAction implements UIAction {
    private FindUniqueAuthorsService uniqueAuthorsService;

    public FindUniqueAuthorsUIAction(FindUniqueAuthorsService uniqueAuthorsService) {
        this.uniqueAuthorsService = uniqueAuthorsService;
    }

    @Override
    public void execute() {
        System.out.println("Authors sets: " + uniqueAuthorsService.execute());
    }
}
