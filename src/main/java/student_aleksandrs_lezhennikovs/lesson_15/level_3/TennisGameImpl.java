package student_aleksandrs_lezhennikovs.lesson_15.level_3;

class TennisGameImpl implements TennisGame {
    private Player firstPlayer;
    private Player secondPlayer;

    public TennisGameImpl(String player1Name, String player2Name) {
        this.firstPlayer = new Player(player1Name);
        this.secondPlayer = new Player(player2Name);
    }

    @Override
    public void wonPoint(String playerName) {
        if (firstPlayer.getName().equals(playerName)) {
            firstPlayer.setPoints();
        } else {
            secondPlayer.setPoints();
        }
    }

    @Override
    public String getScore() {
        int firstPlayerPoints = firstPlayer.getPoints();
        int secondPlayerPoints = secondPlayer.getPoints();

        if (firstTreePointCheck(firstPlayerPoints, secondPlayerPoints)) {
            return getFirstThreePointSMessage(firstPlayerPoints, secondPlayerPoints);
        } else if (firstPlayerPoints == secondPlayerPoints) {
            return getDrawMessage();
        } else {
            int difference = getDifference(firstPlayerPoints, secondPlayerPoints);
            return getWinMessage(difference);
        }
    }

    private static String getFirstThreePointSMessage(int firstPlayerPoints, int secondPlayerPoints) {
        return getPointsMessage(firstPlayerPoints)
                + "-" +
                getPointsMessage(secondPlayerPoints);
    }

    private String getDrawMessage() {
        return "Deuce";
    }
    private static String getWinMessage(int difference) {
        String result = switch (difference) {
            case 4, 3, 2 -> "Win for player1";
            case -2, -3, -4 -> "Win for player2";
            case 1 -> "Advantage player1";
            case -1 -> "Advantage player2";
            default -> "ERROR";
        };
        return result;
    }

    private static int getDifference(int firstPlayerPoints, int secondPlayerPoints) {
        return firstPlayerPoints - secondPlayerPoints;
    }

    private static String getPointsMessage(int playerPoints) {
        String transferredPoints = switch (playerPoints) {
            case 0 -> "Love";
            case 1 -> "Fifteen";
            case 2 -> "Thirty";
            case 3 -> "Forty";
            default -> "ERROR";
        };
        return transferredPoints;
    }
    private static boolean firstTreePointCheck(int firstPlayerPoints, int secondPlayerPoints) {
        return firstPlayerPoints < 3 && secondPlayerPoints < 3 ||
              (firstPlayerPoints == 3 && secondPlayerPoints < 3) ||
              (firstPlayerPoints < 3 && secondPlayerPoints == 3);
    }
}
