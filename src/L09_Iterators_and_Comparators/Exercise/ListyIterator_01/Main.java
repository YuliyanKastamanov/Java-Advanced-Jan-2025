package L09_Iterators_and_Comparators.Exercise.ListyIterator_01;


import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        ListyIterator<String> listyIterator = null;

        while(!line.equals("END")){
            String[] parameters = line.split(" ");

            switch (parameters[0]) {
                case "Create":
                    if(parameters.length > 1){
                        listyIterator = new ListyIterator<>(Arrays.copyOfRange(parameters,1,parameters.length));
                    }
                    else{
                        listyIterator = new ListyIterator<>();
                    }
                    break;
                case "Move":
                    System.out.println(listyIterator.move());
                    break;
                case "HasNext":
                    System.out.println(listyIterator.hasNext());
                    break;
                case "Print":
                    try {
                        listyIterator.print();
                    } catch (IllegalStateException ex) {
                        System.out.println(ex.getMessage());
                    }
                    break;
            }

            line = scanner.nextLine();
        }
    }
}
