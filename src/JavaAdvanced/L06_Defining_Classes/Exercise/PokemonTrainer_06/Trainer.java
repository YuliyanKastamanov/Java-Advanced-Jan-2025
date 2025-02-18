package JavaAdvanced.L06_Defining_Classes.Exercise.PokemonTrainer_06;

import java.util.ArrayList;

public class Trainer {
    private int numberOfBadges;
    private ArrayList<Pokemon> pokemon;


    public Trainer() {
        this.numberOfBadges = 0;
        this.pokemon = new ArrayList<>();

    }

    public void addPokemon(Pokemon pokemon) {
        this.pokemon.add(pokemon);
    }


    public ArrayList<Pokemon> getPokemon() {
        return pokemon;

    }

    public void setNumberOfBadges(int numberOfBadges) {
        this.numberOfBadges = numberOfBadges;
    }

    public int getNumberOfBadges() {
        return numberOfBadges;
    }

}
