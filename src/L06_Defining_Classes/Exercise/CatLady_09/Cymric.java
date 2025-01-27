package cat_lady;

public class Cymric extends Cat {
    private double furLen;

    public Cymric(String name, double furLen) {
        super(name);
        this.furLen = furLen;
    }

    @Override
    public String toString() {
        return String.format("%s %s %.2f",this.getClass().getSimpleName(),super.getName(),this.furLen);
    }
}
