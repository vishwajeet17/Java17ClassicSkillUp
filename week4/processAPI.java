
import java.util.Optional;

public class processAPI {
    public static void main(String[] args) {
        // Get the current process handle
        ProcessHandle currentProcess = ProcessHandle.current();
        System.out.println("Current Process ID: " + currentProcess.pid());

        // List all running processes
        System.out.println("All Running Processes:");
        ProcessHandle.allProcesses()
                .forEach(process -> System.out.println(process.pid() + ": " + process.info().command()));

        // Get information about a specific process
        Optional<ProcessHandle> processHandle = ProcessHandle.of(18720); // Replace 12345 with the PID of the process
        processHandle.ifPresent(handle -> {
            ProcessHandle.Info info = handle.info();
            System.out.println("Process ID: " + handle.pid());
            System.out.println("Command: " + info.command().orElse("Unknown"));
            //System.out.println("Arguments: " + info.arguments().orElse("Unknown"));
            System.out.println("Start Time: " + info.startInstant().orElse(null));
            System.out.println("CPU Duration: " + info.totalCpuDuration().orElse(null));
        });
    }
}
