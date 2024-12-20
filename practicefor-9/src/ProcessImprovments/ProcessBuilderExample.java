package ProcessImprovments;

import java.io.IOException;

public class ProcessBuilderExample {
    public static void main(String[] args) {
        ProcessBuilder processBuilder = new ProcessBuilder("notepad.exe");

        try {
            Process process = processBuilder.start();
            System.out.println("Process started: " + process.isAlive());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

