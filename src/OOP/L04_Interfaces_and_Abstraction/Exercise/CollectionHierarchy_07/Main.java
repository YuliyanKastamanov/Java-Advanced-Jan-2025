package OOP.L04_Interfaces_and_Abstraction.Exercise.CollectionHierarchy_07;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String [] items = scanner.nextLine().split("\\s+");

        StringBuilder addCollectionAddResult = new StringBuilder();
        StringBuilder addRemoveCollectionAddResult = new StringBuilder();
        StringBuilder myListAddResult = new StringBuilder();
        StringBuilder addRemoveCollectionRemoveResult = new StringBuilder();
        StringBuilder myListImplRemoveResult = new StringBuilder();

        Addable addCollection = new AddCollection();

        AddRemovable addRemovableCollection = new AddRemoveCollection();

        MyList myList = new MyListImpl();

        for (String item : items){
            //добавяме елементи към различните инстанции
            addCollectionAddResult.append(addCollection.add(item)).append(" ");
            addRemoveCollectionAddResult.append(addRemovableCollection.add(item)).append(" ");
            myListAddResult.append(myList.add(item)).append(" ");

        }

        int countRemoves = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= countRemoves ; i++) {
            addRemoveCollectionRemoveResult.append(addRemovableCollection.remove()).append(" ");
            myListImplRemoveResult.append(myList.remove()).append(" ");

        }

        System.out.println(addCollectionAddResult);
        System.out.println(addRemoveCollectionAddResult);
        System.out.println(myListAddResult);
        System.out.println(addRemoveCollectionRemoveResult);
        System.out.println(myListImplRemoveResult);





    }
}
