package com.java.calcio;

import java.util.ArrayList;

public class Team {
    private ArrayList<Player> players;
    private Coach coach;

    public Team(ArrayList<Player> players, Coach coach) {
        this.players = players;
        this.coach = coach;
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public Coach getCoach() {
        return coach;
    }
}