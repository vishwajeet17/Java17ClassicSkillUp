public class lambda_runnable {
    public static void main(String[] args) {
        Runnable runnable = () -> {
            System.out.println("Hello, World!");
        };

        Thread thread = new Thread(runnable);
        thread.start();
    }
}
