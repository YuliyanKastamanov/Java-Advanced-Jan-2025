package JavaAdvanced.L09_Iterators_and_Comparators.Exercise.Collection_02;


public class CommandParser {

    private ListyIterator listyIterator;

    public CommandParser() {
        this.listyIterator = new ListyIterator();
    }

    public void go (String line ){
        String[] tokens = line.split(" ");
        switch (tokens[0]){
            case"Move":
                System.out.println(this.listyIterator.move());
                break;
            case"HasNext":
                System.out.println(this.listyIterator.hasNext());
                break;
            case"Print":
                System.out.println(listyIterator.print());
            case"Create":
                listyIterator.transfer(tokens);
                break;
            case"PrintAll":
                for (String s : listyIterator) {
                    System.out.print(s + " ");
                }
                System.out.println();
                break;
        }
    }
}
