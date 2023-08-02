package com.java.calcio;

import java.text.SimpleDateFormat;
import java.util.*;

public class Main {
    private static final String[] Players = {
            "Marco Rossi", "Alessio Bianchi", "Lorenzo Russo", "Simone Ferrara", "Andrea Martini",
            "Luca Rossetti", "Davide Fontana", "Giovanni Ricci", "Filippo Bellini", "Nicolas De Luca",
            "Emanuele Gallo", "Matteo Rossi", "Paolo Marini", "Riccardo Leone", "Tommaso Vitale",
            "Enrico Longo", "Lorenzo Gatti", "Mattia Barbieri", "Pietro Greco", "Luigi Fiore",
            "Dario Lombardi", "Andrea Mariani", "Fabio Serra", "Stefano Ruggiero", "Davide Palumbo",
            "Nicola Lombardi", "Michele Russo", "Alessio D'Amico", "Gianluca Santoro", "Nicolas Lombardi",
            "Fabrizio Marino", "Simone Barone", "Daniele Pellegrini", "Roberto Mariani", "Andrea Rizzi",
            "Matteo Moretti", "Davide Barbieri", "Stefano Bianchi", "Pietro Marchetti", "Nicolas Santoro",
            "Marco Monti", "Giovanni Martino", "Lorenzo Galli", "Alessandro Marchetti", "Luca Coppola",
            "Davide Palmieri", "Giacomo Leone", "Matteo Santoro", "Fabrizio Marino", "Gianluca Fontana",
            "Alessandro De Angelis", "Leonardo Sorrentino", "Davide Farina", "Federico Romano",
            "Simone Rinaldi", "Francesco Esposito", "Luca Vitale", "Domenico Ferrara", "Antonio Martini",
            "Mario Rossetti", "Angelo Coppola", "Carmine Bellini", "Vincenzo Ricci", "Salvatore Greco",
            "Giovanni Marchetti", "Francesco Barbieri", "Raffaele Lombardi", "Federico Bianchi",
            "Emanuele Pellegrini", "Alessio Marino", "Stefano De Rosa", "Lorenzo Santoro",
            "Gianluca De Luca", "Alberto Monti", "Gabriele Martino", "Roberto Galli", "Matteo Ferri",
            "Alessandro Mariani", "Antonio Vitale", "Nicola Romano", "Massimo Palmieri", "Daniele Ferrari",
            "Vincenzo Greco", "Salvatore Moretti", "Davide Santoro", "Riccardo Marini", "Leonardo Fiore",
            "Angelo Ruggiero", "Carmine Sorrentino", "Emanuele Farina", "Francesco Rinaldi",
            "Luigi Esposito", "Domenico Vitale", "Antonio De Angelis", "Mario Barbieri", "Giovanni Marchetti",
            "Francesco Russo", "Raffaele Martini", "Federico Coppola", "Emanuele Bellini", "Alessio Ricci"
    };
    private static final String[] Roles = {"Goalkeeper", "Defender", "Midfielder", "Forward"};
    private static final String[] Strategy = {"Defensive", "Offensive", "Balanced"};
    private static final String[] Referee ={"Michael Jordan", "Kobe Bryant", "Dua Lipa"};

    private static String genRanBirthday() {
        Calendar calendar = new GregorianCalendar();
        int year = getRanNumber(1985, 2000);
        int month = getRanNumber(0, 11);
        int day = getRanNumber(1, 28);
        calendar.set(year, month, day);
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        return dateFormat.format(calendar.getTime());
    }
    private static int getRanNumber(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min + 1) + min;
    }

    public static void main(String[] args) {
//Home Team
        ArrayList<Player> homePlayers = new ArrayList<>();
//Goalkeeper
        String goalkeeperName = Players[new Random().nextInt(Players.length)];
        String randomBirthdate = genRanBirthday();
        homePlayers.add(new Player(goalkeeperName, randomBirthdate, "Goalkeeper"));
//Player
        for (int i = 0; i < 11; i++) {
            String randomName = Players[new Random().nextInt(Players.length)];
            randomBirthdate = genRanBirthday();
            String randomRole = Roles[new Random().nextInt(Roles.length)];

            if (!randomRole.equals("Goalkeeper")){
                homePlayers.add(new Player(randomName, randomBirthdate, randomRole));
            } else {
                i--;
            }
        }
//Coach
        String homeCoach = Players[new Random().nextInt(Players.length)];
        Coach coach = new Coach(homeCoach, randomBirthdate, Strategy[new Random().nextInt(Strategy.length)]);

        Team homeTeam = new Team("Home Team AC", homePlayers, coach);

//Away Team
        ArrayList<Player> awayPlayers = new ArrayList<>();
//Goalkeeper
        goalkeeperName = Players[new Random().nextInt(Players.length)];
        randomBirthdate = genRanBirthday();
        homePlayers.add(new Player(goalkeeperName, randomBirthdate, "Goalkeeper"));

        for (int i = 0; i < 11; i++) {
            String randomName = Players[new Random().nextInt(Players.length)];
            randomBirthdate = genRanBirthday();
            String randomRole = Roles[new Random().nextInt(Roles.length)];

            if (!randomRole.equals("Goalkeeper")){
                awayPlayers.add(new Player(randomName, randomBirthdate, randomRole));
            } else {
                i--;
            }
        }
        String awayCoach = Players[new Random().nextInt(Players.length)];
        coach = new Coach(awayCoach, randomBirthdate, Strategy[new Random().nextInt(Strategy.length)]);
        Team awayTeam = new Team("Away Team AC", awayPlayers, coach);

//Print
        //home
        System.out.println("***************HOME**TEAM*******************");
        System.out.println("Coach: " + homeTeam.getCoach().getName() + ", Birthdate: " + coach.getBirthdate() + ", Strategy: " + homeTeam.getCoach().getStrategy());
        System.out.println("Players:");
        for (Player player : homeTeam.getPlayers()) {
            System.out.println("Name: " + player.getName() + ", Role: " + player.getRole()+ ", Birthdate: " + player.getBirthdate());
        }
        System.out.println("********************************************");

        //away
        System.out.println("***************AWAY**TEAM*******************");
        System.out.println("Coach: " + awayTeam.getCoach().getName() + ", Birthdate: " + coach.getBirthdate() + ", Strategy: " + homeTeam.getCoach().getStrategy());
        System.out.println("Players:");
        for (Player awayPlayer : awayTeam.getPlayers()) {
            System.out.println("Name: " + awayPlayer.getName() + ", Role: " + awayPlayer.getRole()+ ", Birthdate: " + awayPlayer.getBirthdate());
        }
        System.out.println("********************************************");
//referee
        System.out.println("*******************REFEREE*******************");
        Referee referee = new Referee(Referee[new Random().nextInt(Referee.length)], genRanBirthday(), "Referee");
        System.out.println("Referee: " + referee.getName() + ", Role: " + referee.getRole() + ", Birthdate: " + referee.birthdate);
        System.out.println("********************************************");

//Simulation
        System.out.println("********************************************");
        Match match = new Match(homeTeam, awayTeam, referee);
        match.startMatch();

        match.scoreGoal();
        match.printScore();

        match.scoreGoal();
        match.printScore();

        match.scoreGoal();
        match.printScore();

        match.concludeMatch();
        System.out.println("********************************************");
    }
}

