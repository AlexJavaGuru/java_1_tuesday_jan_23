package student_vladislav_romanov.lesson_15.level_3;

class Tennis implements TennisGame {

    Player player1;
    Player player2;

    public Tennis(String player1Name, String player2Name) {
        player1 = new Player(player1Name);
        player2 = new Player(player2Name);
    }

    @Override
    public void wonPoint(String playerName) {
        Player player = getPlayerByName(playerName);
        player.updateScore();
    }

    @Override
    public String score() {
        if (player1.getScore() >= 4 && (player1.getScore() - player2.getScore() >= 2)) {
            return "Win " + player1.getName();
        } else if (player2.getScore() >= 4 && (player2.getScore() - player1.getScore() >= 2)) {
            return "Win " + player2.getName();
        } else if (player1.getScore() >= 3 && (player1.getScore() - player2.getScore() == 1)) {
            return "Advantage " + player1.getName();
        } else if (player2.getScore() >= 3 && (player2.getScore() - player1.getScore() == 1)) {
            return "Advantage " + player2.getName();
        } else if ((player1.getScore() >= 3 && player1.getScore() == player2.getScore()) || (player2.getScore() >= 3 && player1.getScore() == player2.getScore())) {
            return "Deuce";
        }
        return player1.getScoreName() + " - " + player2.getScoreName();
    }

    public Player getPlayerByName(String playerName) {
        if (player1.getName().equals(playerName)) {
            return player1;
        }
        return player2;
    }
}
