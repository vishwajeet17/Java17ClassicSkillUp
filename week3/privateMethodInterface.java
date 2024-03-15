interface Vehicle {
    // Regular abstract method
    void start();

    // Default method
    default void stop() {
        System.out.println("Stopping the vehicle");
        // Calling a private method from a default method
        performStopActions();
    }

    // Private method to perform stop actions
    private void performStopActions() {
        System.out.println("Performing additional stop actions");
    }
}

class Car implements Vehicle {
    @Override
    public void start() {
        System.out.println("Starting the car");
    }
}

public class privateMethodInterface {
    public static void main(String[] args) {
        Car car = new Car();
        car.start(); // Output: Starting the car
        car.stop();  // Output: Stopping the vehicle \n Performing additional stop actions
    }
}
