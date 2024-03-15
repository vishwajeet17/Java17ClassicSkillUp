public class lambda_privateInterface {
    public static void main(String[] args) {
        MyFunction addition = (a, b) -> a + b;
        MyFunction subtraction = (a, b) -> a - b;

        System.out.println("Addition: " + addition.apply(5, 3)); // Output: Addition: 8
        System.out.println("Subtraction: " + subtraction.apply(5, 3)); // Output: Subtraction: 2
    }

    private interface MyFunction {
        int apply(int x, int y);
    }
}