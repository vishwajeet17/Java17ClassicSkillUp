import java.util.ArrayList;
import java.util.List;

public class safevargs {
    @SafeVarargs
    public static <T> List<T> createList(T... elements) {
        List<T> list = new ArrayList<>();
        for (T element : elements) {
            list.add(element);
        }
        return list;
    }

    public static void main(String[] args) {
        List<String> stringList = createList("apple", "banana", "cherry");
        System.out.println("String List: " + stringList);

        List<Integer> integerList = createList(1, 2, 3, 4, 5);
        System.out.println("Integer List: " + integerList);
    }
}
