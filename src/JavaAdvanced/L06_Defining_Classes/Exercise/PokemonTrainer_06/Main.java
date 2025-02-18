package JavaAdvanced.L06_Defining_Classes.Exercise.PokemonTrainer_06;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String command = scan.nextLine();

        LinkedHashMap<String, Trainer> trainers = new LinkedHashMap<>();

        while (!command.equals("Tournament")) {

            String[] tokens = command.split("\\s+");


            String trainerName = tokens[0];
            String pokemonName = tokens[1];
            String pokemonElement = tokens[2];
            int pokemonHealth = Integer.parseInt(tokens[3]);
            Pokemon pokemon = new Pokemon(pokemonName, pokemonElement, pokemonHealth);


            if (!trainers.containsKey(trainerName)) {
                trainers.put(trainerName, new Trainer());
            }
            trainers.get(trainerName).addPokemon(pokemon);


            command = scan.nextLine();
        }

        command = scan.nextLine();

        while (!command.equals("End")) {
            String currentEl=command;

            trainers
                    .forEach((key, value) -> {

                        for (Pokemon pokemon : value.getPokemon()) {
                            if (pokemon.getElement().equals(currentEl)) {

                                value.setNumberOfBadges(value.getNumberOfBadges() + 1);
                                break;


                            } else {

                                pokemon.setHealth(pokemon.getHealth() - 10);

                                if (pokemon.getHealth() <= 0) {
                                    value.getPokemon().remove(pokemon);
                                    break;

                                }
                            }
                            if(value.getPokemon().size()==1){
                                break;
                            }

                        }


                    });



            command = scan.nextLine();
        }

        trainers
                .entrySet()
                .stream()
                .sorted((a,b)->{

                    return b.getValue().getNumberOfBadges()-a.getValue().getNumberOfBadges();
                })
                .forEach(e->{
                    System.out.println(e.getKey()+" "+e.getValue().getNumberOfBadges()+" "+e.getValue().getPokemon().size());


                });
        System.out.println();

    }
}
