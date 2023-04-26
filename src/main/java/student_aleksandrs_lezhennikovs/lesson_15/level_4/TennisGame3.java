package student_aleksandrs_lezhennikovs.lesson_15.level_4;


public class TennisGame3 implements TennisGame {
    private int firstPlayerPoints;
    private int secondPlayerPoints;
    private String firstPlayerName;
    private String secondPlayerName;

    public TennisGame3(String firstPlayerName, String secondPlayerName) {
        this.firstPlayerName = firstPlayerName;
        this.secondPlayerName = secondPlayerName;
    }

    public String getScore() {
        if (lessThreePointConditions()) {
            return getMessageForLessThreePoints();
        } else {
            if (isPointEquals()) {
                return drawMessage();
            }
            return getMessageForMoreThreePoints();
        }
    }

    private String drawMessage() {
        return "Deuce";
    }

    private boolean isPointEquals() {
        return firstPlayerPoints == secondPlayerPoints;
    }

    private String getMessageForMoreThreePoints() {
        String getPlayerName = firstPlayerPoints > secondPlayerPoints ? firstPlayerName : secondPlayerName;
        if ((firstPlayerPoints - secondPlayerPoints) * (firstPlayerPoints - secondPlayerPoints) == 1) {
            return "Advantage " + getPlayerName;
        } else {
            return "Win for " + getPlayerName;
        }
    }

    private boolean lessThreePointConditions() {
        return firstPlayerPoints < 4
                && secondPlayerPoints < 4
                && !(firstPlayerPoints + secondPlayerPoints == 6);
    }

    private String getMessageForLessThreePoints() {
        String[] pointsNames = new String[]{"Love", "Fifteen", "Thirty", "Forty"};
        String tempScore = pointsNames[firstPlayerPoints];
        if (firstPlayerPoints == secondPlayerPoints) {
            return tempScore + "-All";
        } else {
            return tempScore + "-" + pointsNames[secondPlayerPoints];
        }
    }

    public void wonPoint(String playerName) {
        if (playerName.equals("player1")) {
            firstPlayerPoints++;
        } else {
            secondPlayerPoints++;
        }
    }

}