package OOP.L02_Encapsulation.Exercise.FootballTeamGenerator;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private static final String MISSING_TEAM_ERROR_MESSAGE = "Team %s does not exist.";
    private static final String MISSING_PLAYER_ERROR_MESSAGE = "Player %s is not in %s team.";

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        Map<String, Team> teams = new LinkedHashMap<>();

        String line;
        String playerName = null;
        while (true) {
            if ("END".equals(line = scanner.nextLine())) {
                break;
            }

            String[] tokens = line.split(";");

            String command = tokens[0];
            String teamName = tokens[1];

            switch (command) {
                case "Team":
                    teams.putIfAbsent(teamName, new Team(teamName));
                    break;
                case "Add":
                    try {
                        Team team = teams.get(teamName);

                        if (team == null) {
                            System.out.println(String.format(MISSING_TEAM_ERROR_MESSAGE, teamName));
                            break;
                        }

                        playerName = tokens[2];
                        int endurance = Integer.parseInt(tokens[3]);
                        int sprint = Integer.parseInt(tokens[4]);
                        int dribble = Integer.parseInt(tokens[5]);
                        int passing = Integer.parseInt(tokens[6]);
                        int shooting = Integer.parseInt(tokens[7]);
                        Player player = new Player(playerName, endurance, sprint, dribble, passing, shooting);

                        team.addPlayer(player);

                    } catch (IllegalArgumentException iae) {
                        System.out.println(iae.getMessage());
                    }
                    break;
                case "Remove":
                    try {
                        playerName = tokens[2];
                        teams.get(teamName).removePlayer(playerName);
                    } catch (NullPointerException npe) {
                        System.out.println(String.format(MISSING_PLAYER_ERROR_MESSAGE, playerName, teamName));
                    }
                    break;
                case "Rating":
                    try {
                        System.out.println(String.format("%s - %.0f",teamName, teams.get(teamName).getRating()));
                    } catch (NullPointerException npe) {
                        System.out.println(String.format(MISSING_TEAM_ERROR_MESSAGE, teamName));
                    }
                    break;
            }
        }
    }
}
