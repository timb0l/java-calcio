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

    private static final String[] Strategy = {
            "Defensive", "Offensive", "Balanced"};

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
        ArrayList<Player> players = new ArrayList<>();
//Goalkeeper
        String goalkeeperName = Players[new Random().nextInt(Players.length)];
        String randomBirthdate = genRanBirthday();

        players.add(new Player(goalkeeperName, randomBirthdate, "Goalkeeper"));

        for (int i = 0; i < 11; i++) {
            String randomName = Players[new Random().nextInt(Players.length)];
            randomBirthdate = genRanBirthday();
            String randomRole = Roles[new Random().nextInt(Roles.length)];

            if (!randomRole.equals("Goalkeeper")){
                players.add(new Player(randomName, randomBirthdate, randomRole));
            } else {
                i--;
            }
        }

        String coachName = Players[new Random().nextInt(Players.length)];
        String coachBirthdate = genRanBirthday();
        String randomStrategy = Strategy[new Random().nextInt(Strategy.length)];

        Coach coach = new Coach(coachName, coachBirthdate, randomStrategy);
        Team team = new Team(players, coach);

        System.out.println("*****************************************");

        System.out.println("Coach: " + team.getCoach().getName() + ", Strategy: " + team.getCoach().getStrategy());
        System.out.println("-----------------------------------------");
        System.out.println("Players:");
        for (Player player : team.getPlayers()) {
            System.out.println("Name: " + player.getName() + ", Role: " + player.getRole()+ ", Birthdate: " + player.getBirthdate());
        }
        System.out.println("*****************************************");
    }
}

