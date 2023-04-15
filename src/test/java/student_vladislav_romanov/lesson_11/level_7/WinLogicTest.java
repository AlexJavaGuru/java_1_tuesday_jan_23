package student_vladislav_romanov.lesson_11.level_7;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class WinLogicTest {

    private static WinLogic logic;

    @BeforeAll
    static void setup(){
        Board board = new Board(4, 4);
        board.placeChip(1, new Move(0, 0));
        board.placeChip(1, new Move(0, 1));
        board.placeChip(1, new Move(0, 2));
        board.placeChip(1, new Move(0, 3));
        board.placeChip(-1, new Move(1, 0));
        board.placeChip(1, new Move(1, 1));
        board.placeChip(1, new Move(1, 2));
        board.placeChip(1, new Move(1, 3));
        board.placeChip(-1, new Move(2, 0));
        board.placeChip(1, new Move(2, 1));
        board.placeChip(1, new Move(2, 2));
        board.placeChip(1, new Move(2, 3));
        board.placeChip(1, new Move(3, 0));
        board.placeChip(-1, new Move(3, 1));
        board.placeChip(-1, new Move(3, 2));
        board.placeChip(1, new Move(3, 3));
        logic = new WinLogic(board, 1);
    }

    @Test
    void hasWinningSequenceForHorizontal() {
        boolean expected = true;
        boolean current = logic.hasWinningSequenceForHorizontal(3);
        assertThat(expected).isEqualTo(current);
    }

    @Test
    void hasWinningSequenceForHorizontals() {
        boolean expected = true;
        boolean current = logic.hasWinningSequenceForHorizontals();
        assertThat(expected).isEqualTo(current);
    }

    @Test
    void hasWinningSequenceForVertical() {
        boolean expected = true;
        boolean current = logic.hasWinningSequenceForVertical(0);
        assertThat(expected).isEqualTo(current);
    }

    @Test
    void hasWinningSequenceForVerticals() {
        boolean expected = true;
        boolean current = logic.hasWinningSequenceForVerticals();
        assertThat(expected).isEqualTo(current);
    }

    @Test
    void hasWinningSequenceForMainDiagonal() {
        boolean expected = true;
        boolean current = logic.hasWinningSequenceForMainDiagonal(0, 0);
        assertThat(expected).isEqualTo(current);
    }

    @Test
    void hasWinningSequenceForMainDiagonals() {
        boolean expected = true;
        boolean current = logic.hasWinningSequenceForMainDiagonals();
        assertThat(expected).isEqualTo(current);
    }

    @Test
    void hasWinningSequenceForSideDiagonal() {
        boolean expected = true;
        boolean current = logic.hasWinningSequenceForSideDiagonal(0, 3);
        assertThat(expected).isEqualTo(current);
    }

    @Test
    void hasWinningSequenceForSideDiagonals() {
        boolean expected = true;
        boolean current = logic.hasWinningSequenceForSideDiagonals();
        assertThat(expected).isEqualTo(current);
    }

    @Test
    void hasWinningSequenceForBothDiagonals() {
        boolean expected = true;
        boolean current = logic.hasWinningSequenceForBothDiagonals();
        assertThat(expected).isEqualTo(current);
    }

    @Test
    void hasWinningSequence() {
        boolean expected = true;
        boolean current = logic.hasWinningSequence();
        assertThat(expected).isEqualTo(current);
    }

    @Test
    void isDrawPosition() {
        boolean expected = true;
        boolean current = logic.isDrawPosition();
        assertThat(expected).isEqualTo(current);
    }
}