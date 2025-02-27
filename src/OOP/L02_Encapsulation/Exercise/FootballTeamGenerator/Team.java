package OOP.L02_Encapsulation.Exercise.FootballTeamGenerator;

import java.util.ArrayList;
import java.util.List;

public class Team {
    private String name;
    private List<Player> players;

    public Team(String name) {
        this.setName(name);
        this.players = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }

    public void addPlayer(Player player) {
        this.players.add(player);
    }

    public void removePlayer(String name) {
        boolean isRemoved = this.players.removeIf(p -> p.getName().equals(name));

        if (!isRemoved) {
            String message = String.format("Player %s is not in %s team.",
                    name, this.getName());

            throw new NullPointerException(message);
        }
    }

    public double getRating() {
        double rating = this.players
                .stream()
                .mapToDouble(Player::overallSkillLevel)
                .average()
                .orElse(0);

        return rating;
    }

    private void setName(String name) {
        this.name = name;
    }
}
