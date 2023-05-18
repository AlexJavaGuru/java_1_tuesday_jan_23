package student_aleksandrs_lezhennikovs.lesson_13.level_3.services;

import student_aleksandrs_lezhennikovs.lesson_13.level_3.domens.Cell;
import student_aleksandrs_lezhennikovs.lesson_13.level_3.domens.Coord;
import student_aleksandrs_lezhennikovs.lesson_13.level_3.domens.Field;
import student_aleksandrs_lezhennikovs.lesson_13.level_3.rules.*;

public class NextGeneration {

    public Field getNextGeneration(Field field) {
        PopulationRule populationRule = new PopulationRule(field);

        Field newMatrix = new Field(field.getSize());
        for (int x = 0; x < field.getSize().getX() ; x++) {
            for (int y = 0; y < field.getSize().getY(); y++) {
                Cell oldCell = field.getCell(new Coord(x, y));
                Cell newCell = populationRule.checkRules(oldCell);
                newMatrix.setCell(newCell);
            }
        }
        return newMatrix;
    }
}
