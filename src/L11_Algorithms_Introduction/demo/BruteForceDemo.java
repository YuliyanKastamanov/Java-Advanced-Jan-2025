package L11_Algorithms_Introduction.demo;

public class BruteForceDemo {

    public static void main(String[] args) {
        // [0-9][0-9][0-9][0-9][0-9]
        String code = "99999";
        int combinationCount = 0;

        for (int first = 0; first <= 9; first++) {
            for (int second = 0; second <= 9; second++) {
                for (int third = 0; third <= 9; third++) {
                    for (int fourth = 0; fourth <= 9; fourth++) {
                        for (int fifth = 0; fifth <= 9; fifth++) {
                            String combination = String.format("%d%d%d%d%d",
                                                               first,
                                                               second,
                                                               third,
                                                               fourth,
                                                               fifth);
                            combinationCount++;
                            if (combination.equals(code)) {
                                System.out.println("You unlocked my case with combination " + combinationCount);
                            }
                        }
                    }
                }
            }
        }


    }
}
