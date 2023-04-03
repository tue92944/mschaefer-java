import java.time.LocalDateTime;

public class ScreenLogger {
    public void timestampedLog(String message){
        System.out.println("Screen Log for: " + message + " : at timestamp: " + LocalDateTime.now());
    }

    public void logToScreen(String message){
        System.out.println("Screen Log for: " + message);
    }
}
