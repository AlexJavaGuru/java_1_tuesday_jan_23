package student_aleksandrs_lezhennikovs.lesson_10.level_2.consolu_ui;

import student_aleksandrs_lezhennikovs.lesson_10.level_2.core.services.FIndUniqueTitlesService;

import java.util.Set;

public class FindUniqueTitlesUIAction implements UIAction {
    private FIndUniqueTitlesService uniqueTitlesService;

    public FindUniqueTitlesUIAction(FIndUniqueTitlesService uniqueTitlesService) {
        this.uniqueTitlesService = uniqueTitlesService;
    }


    @Override
    public void execute()  {
        System.out.println("Unique Title set:");
        printToSpecialFormat(uniqueTitlesService.execute());
    }

    private void printToSpecialFormat(Set<String> stringSet) {
        for (String title : stringSet) {
            System.out.println(title);
        }
    }
}
