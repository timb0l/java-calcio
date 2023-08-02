package com.java.calcio;

import java.util.ArrayList;
import java.util.Random;

public class Match {
    private final Team homeTeam;
    private final Team awayTeam;
    private final Referee referee;
    private String status;
    private int goals;

    public Match(Team homeTeam, Team awayTeam, Referee referee) {
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
        this.referee = referee;
        this.status = "Not started";
        this.goals = 0;
    }

    public void startMatch() {
        this.status = "Started";
    }

    public void scoreGoal() {
        if (!this.status.equals("Started")) {
            System.out.println("The match has not started yet!");
            return;
        }

        Team scoringTeam;
        if (new Random().nextBoolean()) {
            scoringTeam = homeTeam;
        } else {
            scoringTeam = awayTeam;
        }

        ArrayList<Player> players = scoringTeam.getPlayers();
        if (!players.isEmpty()){
            Player scorer = players.get(new Random().nextInt(players.size()));
            this.goals++;
            System.out.println("Goal scored by " + scorer.getName() + " of " + scoringTeam.getTeam());
        } else {
            System.out.println("The team " + scoringTeam + " hasn't made a goal yet!");
        }
    }

    public void printScore(){
        System.out.println("Score: " + homeTeam.getTeam() + " " + getHomeTeamGoals() + " - " + getAwayTeamGoals() + " " + awayTeam.getTeam());
    }
    private int getHomeTeamGoals() {
        return goals;
    }

    private int getAwayTeamGoals() {
        return goals;
    }

    public void concludeMatch() {
    this.status = "Concluded";
    }
}
