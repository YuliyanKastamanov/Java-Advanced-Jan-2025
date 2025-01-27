package cat_lady;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        final String StreetExtraordinaire = "StreetExtraordinaire";
        final String Cymric = "Cymric";
        final String Siamese = "Siamese";

        List<Cat> cats = new ArrayList<>();

        while (true) {
            String[] input = console.readLine().split("\\s+");
            if ("End".equals(input[0])) {
                break;
            }

            String breed = input[0];
            String name = input[1];
            double prop = Double.parseDouble(input[2]);
            Cat cat = null;

            switch (breed){
                case StreetExtraordinaire:
                    cat = new StreetExtraordinaire(name,prop);
                    break;
                case Cymric:
                    cat = new Cymric(name,prop);
                    break;
                case Siamese:
                    cat = new Siamese(name,prop);
                    break;
            }

            cats.add(cat);
        }

        String findCat = console.readLine();

        for (Cat cat : cats) {
            if(cat.isCatPresented(findCat)){
                System.out.println(cat.toString());
            }
        }
    }
}
