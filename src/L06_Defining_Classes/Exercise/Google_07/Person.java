package L06_Defining_Classes.Exercise.Google_07;

import java.util.ArrayList;
import java.util.List;

public class Person {

    private String name;
    private Company company;
    private List<Pokemon> pokemons;
    private List<Parent> parents;
    private List<Child> children;
    private Car car;

    public Person(String name) {
        this.name = name;
        this.setCompany(new Company());
        this.pokemons = new ArrayList<>();
        this.parents = new ArrayList<>();
        this.children = new ArrayList<>();
        this.car = new Car();
    }
    public void addChild(Child child){
        this.children.add(child);
    }

    public void addParent(Parent parent){
        this.parents.add(parent);
    }

    public void addPokemon(Pokemon pokemon){
        this.pokemons.add(pokemon);
    }

    public void setCompany(Company company){
        this.company = company;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    @Override
    public String toString() {
        StringBuilder sb =  new StringBuilder(this.name);
        sb.append(System.lineSeparator())
            .append(this.company.toString())
            .append(System.lineSeparator())
            .append(this.car.toString())
            .append(System.lineSeparator());

        sb.append("Pokemon:").append(System.lineSeparator());
        for (Pokemon pokemon : pokemons) {
            sb.append(pokemon.toString())
                    .append(System.lineSeparator());
        }
        sb.append("Parents:").append(System.lineSeparator());
        for (Parent parent : parents) {
            sb.append(parent.toString())
                    .append(System.lineSeparator());
        }
        sb.append("Children:").append(System.lineSeparator());
        for (Child child : children) {
            sb.append(child.toString())
                    .append(System.lineSeparator());
        }

        return sb.toString();
    }
}
