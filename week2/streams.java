import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class streams {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        // 1. Filter: Get even numbers
        numbers.stream()
                .filter(n -> n % 2 == 0)
                .forEach(System.out::println); // Output: 2, 4

        // 2. Map: Double each number
        numbers.stream()
                .map(n -> n * 2)
                .forEach(System.out::println); // Output: 2, 4, 6, 8, 10

        // 3. Reduce: Get sum of all numbers
        int sum = numbers.stream()
                .reduce(0, (a, b) -> a + b);
        System.out.println("Sum: " + sum); // Output: Sum: 15

        // 4. Collect: Create a new list containing even numbers
        List<Integer> evenNumbers = numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
        System.out.println("Even numbers: " + evenNumbers); // Output: Even numbers: [2, 4]
    }
}