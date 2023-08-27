package functional_interface_example02;

import java.util.List;

@FunctionalInterface
public interface NumberListProcessor {
    int process(List<Integer> numbers);
}
