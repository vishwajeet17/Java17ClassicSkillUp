import java.util.*;

public class unmodible {
    public static void main(String[] args) {
        // Creating unmodifiable lists
        List<String> fruits = List.of("Apple", "Banana", "Orange");

        // Creating unmodifiable sets
        Set<Integer> numbers = Set.of(1, 2, 3, 4, 5);

        // Creating unmodifiable maps
        Map<String, Integer> scores = Map.of("Alice", 90, "Bob", 85, "Charlie", 88);

        // Creating unmodifiable maps using Map.ofEntries()
        Map<String, Integer> moreScores = Map.ofEntries(
                Map.entry("David", 92),
                Map.entry("Eva", 87));

        System.out.println("Fruits: " + fruits);
        System.out.println("Numbers: " + numbers);
        System.out.println("Scores: " + scores);
        System.out.println("More Scores: " + moreScores);
    }
}
