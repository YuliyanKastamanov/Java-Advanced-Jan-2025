package L10_Exam_Preparation.Exercise;

import java.util.*;

public class ClimbThePeaks_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Integer> foodStack = new ArrayDeque<>();
        Arrays.stream(scanner.nextLine().split(", "))
                .mapToInt(Integer::parseInt)
                .forEach(foodStack::push);

        ArrayDeque<Integer> staminaQueue = new ArrayDeque<>();
        Arrays.stream(scanner.nextLine().split(", "))
                .mapToInt(Integer::parseInt)
                .forEach(staminaQueue::offer);

        Map<String, Integer> peaks = new LinkedHashMap<>();
        peaks = fillThePeaks(peaks);

        List<String> peakConquered = new ArrayList<>();

        for (int day = 1; day <= 7 ; day++) {
            if(peaks.isEmpty()){
                break;
            }

            int dailyBoost = foodStack.pop() + staminaQueue.poll();
            int peakDifficultyLevel = peaks.entrySet().stream().findFirst().get().getValue();

            if(dailyBoost >= peakDifficultyLevel){
                String peak = peaks.entrySet().stream().findFirst().get().getKey();
                peakConquered.add(peak);
                peaks.remove(peak);
            }
        }

        if(peaks.isEmpty()){
            System.out.println("Alex did it! He climbed all top five Pirin peaks in one week -> @FIVEinAWEEK");
        }else {
            System.out.println("Alex failed! He has to organize his journey better next time -> @PIRINWINS");
        }

        if(!peakConquered.isEmpty()){
            System.out.println("Conquered peaks:");
            peakConquered.forEach(peak -> System.out.println(peak));
        }




    }

    private static Map<String, Integer> fillThePeaks(Map<String, Integer> peaks) {

        //Vihren	80
        //Kutelo	90
        //Banski Suhodol	100
        //Polezhan	60
        //Kamenitza	70
        peaks.put("Vihren", 80);
        peaks.put("Kutelo", 90);
        peaks.put("Banski Suhodol", 100);
        peaks.put("Polezhan", 60);
        peaks.put("Kamenitza", 70);

        return peaks;
    }
}
