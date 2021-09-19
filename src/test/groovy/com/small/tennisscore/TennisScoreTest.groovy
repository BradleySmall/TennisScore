package com.small.tennisscore

import spock.lang.Specification

class TennisScoreTest extends Specification {
    TennisScore tennisScore
    void setup() {
        tennisScore = new TennisScore()
    }

    def "should show appropriate terms for tennis score"() {
        expect:
            "love - love" == tennisScore.showScore(0, 0)
            "15 - love" == tennisScore.showScore(1, 0)
            "30 - love" == tennisScore.showScore(2, 0)
            "30 - 15" == tennisScore.showScore(2, 1)
            "30 - 30" == tennisScore.showScore(2, 2)
            "40 - love" == tennisScore.showScore(3, 0)
            "40 - 15" == tennisScore.showScore(3, 1)
            "40 - 30" == tennisScore.showScore(3, 2)
            "Game - player1" == tennisScore.showScore(4, 0)
            "Game - player1" == tennisScore.showScore(4, 1)
            "Game - player1" == tennisScore.showScore(4, 2)
            "love - 15" == tennisScore.showScore(0, 1)
            "love - 30" == tennisScore.showScore(0, 2)
            "15 - 30" == tennisScore.showScore(1, 2)
            "love - 40" == tennisScore.showScore(0, 3)
            "15 - 40" == tennisScore.showScore(1, 3)
            "30 - 40" == tennisScore.showScore(2, 3)
            "Game - player2" == tennisScore.showScore(0, 4)
            "Game - player2" == tennisScore.showScore(1, 4)
            "Game - player2" == tennisScore.showScore(2, 4)
            "Deuce" == tennisScore.showScore(3, 3)
            "Deuce" == tennisScore.showScore(300, 300)
            "Advantage - player1" == tennisScore.showScore(4, 3)
            "Advantage - player2" == tennisScore.showScore(3, 4)
            "Game - player1" == tennisScore.showScore(5, 3)
            "Game - player2" == tennisScore.showScore(3, 5)
    }
}
