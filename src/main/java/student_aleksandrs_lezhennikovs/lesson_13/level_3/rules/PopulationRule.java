package student_aleksandrs_lezhennikovs.lesson_13.level_3.rules;

import student_aleksandrs_lezhennikovs.lesson_13.level_3.domens.Cell;
import student_aleksandrs_lezhennikovs.lesson_13.level_3.domens.Field;

import java.util.List;

public class PopulationRule {
    private Field matrix;

    public PopulationRule(Field matrix) {
        this.matrix = matrix;
    }

    public Cell checkRules(Cell cellInitial) {
        List<Cell> checkList = matrix.getAroundCoord(cellInitial.getCoord());
        Cell newCell = new Cell(false, cellInitial.getCoord());

        long countLiveNeighbor = checkList.stream().filter(cell -> cell.isLiveGetter() == true).count();

        if (cellInitial.isLiveGetter()) {
            if (countLiveNeighbor < 2 || countLiveNeighbor > 3) {
                newCell.setLive(false);
            } else if (countLiveNeighbor == 2 || countLiveNeighbor == 3) {
                newCell.setLive(true);
            }
        } else {
            if (countLiveNeighbor == 3) {
                newCell.setLive(true);
            }
        }
        return newCell;
    }
}
