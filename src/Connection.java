import java.io.IOException;

public class Connection {
    public static void main(String[] args) {
        try {
            ProcessBuilder pb = new ProcessBuilder("ncat", "-lnvp", "4444");
            pb.inheritIO();  // Redirect output & error streams to the Java console
            Process process = pb.start();
            process.waitFor();  // Wait for ncat to complete
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
