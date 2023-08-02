package com.java.calcio;

import java.util.ArrayList;

public class Team {
    private final String team;
    private final ArrayList<Player> players;
    private final Coach coach;

    public Team(String team, ArrayList<Player> players, Coach coach) {
        this.team = team;
        this.players = players;
        this.coach = coach;
    }

    public String getTeam() {
        return team;
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public Coach getCoach() {
        return coach;
    }

}