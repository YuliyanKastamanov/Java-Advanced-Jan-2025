package P09_Linked_List_Traversal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());
        LinkedList list = new LinkedList();

        for (int i = 0; i < n; i++) {
            String[] cmd = reader.readLine().split("\\s+");

            if (cmd[0].equals("Add")){
                list.addLast(Integer.parseInt(cmd[1]));
            }else {
                list.remove(Integer.parseInt(cmd[1]));
            }
        }
        System.out.println(list.getSize());
        for (Node node : list) {
            System.out.print(node.value + " ");
        }
    }
}
