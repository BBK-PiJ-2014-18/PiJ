package lambda;

@FunctionalInterface
public interface MyFunc {
	int fred(int x, int y);
	default void myMethod() {}
	default void anotherMethod() {}
	default void yetAnotherMethod(){}
}