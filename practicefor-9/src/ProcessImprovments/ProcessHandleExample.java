package ProcessImprovments;

import java.util.stream.Stream;

public class ProcessHandleExample {
    public static void main(String[] args) {
        Stream<ProcessHandle> processStream = ProcessHandle.allProcesses();

        processStream.forEach(process -> {
            ProcessHandle.Info info = process.info();
            
            System.out.println("Process ID: " + process.pid());
            System.out.println("Command: " + info.command().orElse("Not Available"));
            System.out.println("User: " + info.user().orElse("Not Available"));
            System.out.println("Start Time: " + info.startInstant().orElse(null));
            System.out.println("-------------------------------------");
        });
    }
}
