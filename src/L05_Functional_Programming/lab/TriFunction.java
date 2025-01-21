package L05_Functional_Programming.lab;

@FunctionalInterface
public interface TriFunction<A, B, C, Y> {

    Y apply(A a, B b, C c);
}
