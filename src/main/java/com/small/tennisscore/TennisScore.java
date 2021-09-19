package com.small.tennisscore;

public class TennisScore {
    public String showScore(Integer player1Score, Integer player2Score) {
        StringBuilder scoreBuilder = new StringBuilder();
        int diff = player1Score - player2Score;
        int max = Math.max(player1Score, player2Score);

        if (diff == 0 && max >= 3) {
            scoreBuilder.append("Deuce");
        } else {
            if (max > 3){
                if (Math.abs(diff) == 1) {
                    scoreBuilder.append("Advantage - ");
                } else {
                    scoreBuilder.append("Game - ");
                }
                if (diff > 0) {
                    scoreBuilder.append("player1");
                } else {
                    scoreBuilder.append("player2");
                }
            } else {
                score2String(player1Score, scoreBuilder);
                scoreBuilder.append(" - ");
                score2String(player2Score, scoreBuilder);
            }
        }
        return scoreBuilder.toString();
    }

    private void score2String(Integer playerScore, StringBuilder scoreBuilder) {
        switch (playerScore) {
            case 0 -> scoreBuilder.append("love");
            case 1 -> scoreBuilder.append("15");
            case 2 -> scoreBuilder.append("30");
            case 3 -> scoreBuilder.append("40");
        }
    }
}
