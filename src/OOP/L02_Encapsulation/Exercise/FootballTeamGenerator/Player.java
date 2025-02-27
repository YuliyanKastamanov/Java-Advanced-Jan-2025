package OOP.L02_Encapsulation.Exercise.FootballTeamGenerator;

public class Player {
    private String name;
    private int endurance;
    private int sprint;
    private int dribble;
    private int passing;
    private int shooting;

    public Player(String name, int endurance, int sprint, int dribble, int passing, int shooting) {
        this.setName(name);
        this.setEndurance(endurance);
        this.setSprint(sprint);
        this.setDribble(dribble);
        this.setPassing(passing);
        this.setShooting(shooting);
    }

    public String getName() {
        return this.name;
    }

    public double overallSkillLevel() {
        double overallSkillLevel = (this.endurance + this.sprint + this.dribble + this.passing + this.shooting) / 5.0;

        return overallSkillLevel;
    }

    private void setName(String name) {
        if (name == null || name.trim().length() < 1) {
            throw new IllegalArgumentException("A name should not be empty.");
        }

        this.name = name;
    }

    private void setEndurance(int endurance) {
        validateStat(endurance, "Endurance");

        this.endurance = endurance;
    }

    private void setSprint(int spring) {
        validateStat(spring, "Sprint");

        this.sprint = spring;
    }

    private void setDribble(int dribble) {
        validateStat(dribble, "Dribble");

        this.dribble = dribble;
    }

    private void setPassing(int passing) {
        validateStat(passing, "Passing");

        this.passing = passing;
    }

    private void setShooting(int shooting) {
        validateStat(shooting, "Shooting");

        this.shooting = shooting;
    }

    private void validateStat(int statVal, String statName) {
        if (statVal < 0 || statVal > 100) {
            throw new IllegalArgumentException(statName + " should be between 0 and 100.");
        }
    }
}
