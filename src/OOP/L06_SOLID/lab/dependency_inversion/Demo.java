package dependency_inversion;

public class Demo {

    public static void main(String[] args) {

        Button lampButton = new Button(new Lamp());
        lampButton.poll();
        lampButton.poll();
        System.out.println();

        Button tvButton = new Button(new Tv());
        tvButton.poll();
        tvButton.poll();

        tvButton.switchh(new Lamp());

    }
}
