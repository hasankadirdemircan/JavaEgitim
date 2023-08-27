package functional_interface_example03;

@FunctionalInterface
public interface StringTransformer {
    String transform(String input);
}
