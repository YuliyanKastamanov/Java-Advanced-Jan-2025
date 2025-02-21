package OOP.L01_WorkingWithAbstraction.lab;

public class DemoStatic {

    static int n;

    public static void main(String[] args) {

        //        System.out.println(ShapeCalculator.squareArea(5));
        //        System.out.println(ShapeCalculator.SOME_VARIABLE);


        ShapeCalculator shapeCalculator = new ShapeCalculator();
        //        System.out.println(shapeCalculator.instanceVariable);


        ShapeCalculator.InnerCalculator innerCalculator = new ShapeCalculator.InnerCalculator();

//        innerCalculator.printShapeCalcConstantVars();


        System.out.println("From main");
        System.out.println(n);

    }

    static {
        System.out.println("From static block");
        n = 10;
    }

}
