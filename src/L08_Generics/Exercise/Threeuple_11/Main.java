import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        List<Threeuple> threeUples = new ArrayList<>();

        String[] lines = bufferedReader.readLine().split("\\s+");

        threeUples.add(new Threeuple(lines[0] + " " + lines[1], lines[2], lines[3]));
        lines = bufferedReader.readLine().split("\\s+");
        threeUples.add(new Threeuple(lines[0], Integer.parseInt(lines[1]), Boolean.parseBoolean(lines[2].equals("drunk") ? "true" : "false")));
        lines = bufferedReader.readLine().split("\\s+");
        threeUples.add(new Threeuple(lines[0], Double.parseDouble(lines[1]), lines[2]));

        threeUples.forEach(System.out::println);
    }
}
