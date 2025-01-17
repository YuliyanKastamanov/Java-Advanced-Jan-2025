package L03_Sets_and_Dictionaries_Advanced.Exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class СръбскоUnleashed_12 {
    private static final String REGEX;
    private static Pattern pattern;
    private static Map<String, Venue> venues;

    static {
        REGEX = "^(?<singer>([A-Za-z]+ )+)@(?<venue>([A-Za-z]+ )+)(?<price>\\d+) (?<count>\\d+)$";
        pattern = Pattern.compile(REGEX);
        venues = new LinkedHashMap<>();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input;
        while (! "End".equals(input = reader.readLine())) {
            Matcher matcher = pattern.matcher(input);
            if (matcher.find()) {
                String singer = matcher.group("singer").trim();
                String venue = matcher.group("venue").trim();
                int price = Integer.parseInt(matcher.group("price"));
                int count = Integer.parseInt(matcher.group("count"));

                venues.putIfAbsent(venue, new Venue(venue));
                venues.get(venue).addSinger(singer, count * price);
            }
        }

        venues.values().forEach(System.out::print);
    }
}


class Venue {
    private String name;
    private Map<String, Singer> singers;

    Venue(String name) {
        this.name = name;
        this.singers = new LinkedHashMap<>();
    }

    void addSinger(String singer, int profit) {
        this.singers.putIfAbsent(singer, new Singer(singer));
        this.singers.get(singer).addProfit(profit);
    }

    private String getName() {
        return this.name;
    }

    private Map<String, Singer> getSingers() {
        return this.singers;
    }

    @Override
    public String toString() {
        StringBuilder output = new StringBuilder();
        output.append(this.getName())
                .append(System.lineSeparator());
        this.getSingers().values()
                .stream()
                .sorted()
                .forEach(s -> output.append(s).append(System.lineSeparator()));
        return output.toString();
    }
}

class Singer implements Comparable<Singer> {
    private String name;
    private int moneyMade;

    Singer(String name) {
        this.name = name;
        this.moneyMade = 0;
    }

    private String getName() {
        return this.name;
    }

    private int getMoneyMade() {
        return this.moneyMade;
    }

    void addProfit(int profit) {
        this.moneyMade += profit;
    }

    @Override
    public int compareTo(Singer other) {
        return Integer.compare(other.getMoneyMade(), this.getMoneyMade());
    }

    @Override
    public String toString() {
        return String.format("#  %s -> %d", this.getName(), this.getMoneyMade());
    }
}
