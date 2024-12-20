package ProcessImprovments;

import java.util.Optional;

public class ProcessDestroyingExample {
    public static void main(String[] args) {
        long pid = 10640; // replace with the desired process ID
        Optional<ProcessHandle> op = ProcessHandle.of(pid);

        if (op.isPresent()) {
            ProcessHandle p = op.get();
            System.out.println("Process with ID " + pid + " is present.");
            System.out.println("Is the process alive? " + p.isAlive());
            
            // Get process information
            ProcessHandle.Info info = p.info();
            System.out.println("Start Time: " + info.startInstant().orElse(null));
            System.out.println("Command: " + info.command().orElse("Not Available"));
            
            // Optionally terminate the process
            p.destroy(); // Gracefully terminates the process
            System.out.println("Process terminated.");
        } else {
            System.out.println("Process with ID " + pid + " is not running.");
        }
    }
}

