package JavaAdvanced.Exam_Examples.halloween;

import java.util.ArrayList;
import java.util.List;

public class House {

    private int capacity;
    private List<Kid> data;

    public House(int capacity) {
        this.capacity = capacity;
        this.data = new ArrayList<>();
    }


    //    •	Method addKid(Kid kid) – adds an entity to the data if there is an empty space for the kid.
    public void addKid(Kid kid) {
        if (this.data.size() < this.capacity) {
            this.data.add(kid);
        }
    }

    //    •	Method removeKid(String name) – removes the kid by given name,
    //    if such exists, and returns boolean.
    public boolean removeKid(String name) {
        return this.data.removeIf(kid -> kid.getName().equals(name));
    }

    //    •	Method getKid(String street) – returns the kid of a given street or null if no such kid exists.
    public Kid getKid(String street) {
        return this.data.stream()
                        .filter(kid -> kid.getStreet().equals(street))
                        .findFirst()
                        .orElse(null);
    }

    //    •	Getter getAllKids() – returns the number of kids.
    public int getAllKids() {
        return this.data.size();
    }

    //    •	getStatistics() – returns a String in the following format:
    //         " Children who visited a house for candy:
    //		               {name} from {street} street
    //                       {name} from {street} street
    //                        (…)"
    public String getStatistics() {

        StringBuilder sb = new StringBuilder();
        sb.append("Children who visited a house for candy:");
        this.data.forEach(kid -> {
            sb.append(System.lineSeparator());
            sb.append("%s from %s street".formatted(kid.getName(), kid.getStreet()));
        });

        return sb.toString();
    }

}
