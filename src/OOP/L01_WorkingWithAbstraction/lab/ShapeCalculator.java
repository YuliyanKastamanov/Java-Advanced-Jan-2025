package OOP.L01_WorkingWithAbstraction.lab;

public class ShapeCalculator {

    private static final int SOME_CONSTANT_VARIABLE = 10;
    public static int SOME_VARIABLE = 20;

    public int instanceVariable;

    static int squareArea(int a) {
        return a * a;
    }

    static class InnerCalculator{
       void printShapeCalcConstantVars(){
            System.out.println(SOME_CONSTANT_VARIABLE);
        }
    }
}
