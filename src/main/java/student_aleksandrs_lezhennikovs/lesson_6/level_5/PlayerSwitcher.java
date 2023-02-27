package student_aleksandrs_lezhennikovs.lesson_6.level_5;

public class PlayerSwitcher {

    private int player;

    PlayerSwitcher(int player) {
        this.player = player;
    }

    int changePlayer(int player) {

        if (player == 0) {
            this.player = 1;
        } else {
            this.player = 0;
        }
        return this.player;
    }
}