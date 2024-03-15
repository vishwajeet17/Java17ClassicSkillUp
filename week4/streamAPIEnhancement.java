import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class streamAPIEnhancement {
    public static void main(String[] args) {
        // Example data
        List<String> words = List.of("apple", "banana", "orange", "grape", "pear");

        // TakeWhile: Takes elements from the stream until the predicate is false
        List<String> takenWhile = words.stream()
                .takeWhile(word -> word.length() < 6)
                .collect(Collectors.toList());
        System.out.println("TakeWhile: " + takenWhile);

        // DropWhile: Drops elements from the stream until the predicate is false
        List<String> droppedWhile = words.stream()
                .dropWhile(word -> word.length() < 6)
                .collect(Collectors.toList());
        System.out.println("DropWhile: " + droppedWhile);

        // Iterate: Generates a stream by iterating a seed value and applying a function
        List<Integer> iterated = Stream.iterate(1, n -> n * 2)
                .limit(5)
                .collect(Collectors.toList());
        System.out.println("Iterate: " + iterated);
    }
}
