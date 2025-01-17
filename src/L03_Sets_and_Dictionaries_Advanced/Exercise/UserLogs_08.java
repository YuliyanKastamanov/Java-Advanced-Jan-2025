package L03_Sets_and_Dictionaries_Advanced.Exercise;

import java.util.*;

public class UserLogs_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, Map<String, Integer>> dataMap = new TreeMap<>();

        while (!input.equals("end")){

            String[] inputData = input.split("\\s+");
            String ip = inputData[0].split("=")[1];//"IP=192.23.30.40" -> "192.23.30.40"
            String username = inputData[2].split("=")[1];

            if(!dataMap.containsKey(username)){
                dataMap.put(username, new LinkedHashMap<>(){
                    {
                        put(ip, 1);

                    }
                });
            } else {
                Map<String, Integer> currentIps = dataMap.get(username);

                if(currentIps.containsKey(ip)){
                    int countMessages = currentIps.get(ip);
                    currentIps.put(ip, countMessages + 1);
                }else {
                    currentIps.put(ip, 1);
                }
            }

            input = scanner.nextLine();
        }

        dataMap.entrySet().forEach(username -> {
            System.out.printf("%s: %n", username.getKey());
            Map<String, Integer> currentIps = new LinkedHashMap<>(username.getValue());

            int countIPs = currentIps.size();
            for (Map.Entry<String, Integer> entry : currentIps.entrySet()){

                if(countIPs == 1){
                    System.out.printf("%s => %d.%n", entry.getKey(), entry.getValue());
                }else {
                    System.out.printf("%s => %d, ", entry.getKey(), entry.getValue());
                    countIPs--;
                }
            }


        });


        
    }
}
