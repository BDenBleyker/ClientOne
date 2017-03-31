package clienttwo;

import java.time.LocalDateTime;

public class Message {
    private final String username;
    private String message;
    private final LocalDateTime time;
    
    public Message (String username, String message) {
        this.username = username;
        this.message = message;
        time = LocalDateTime.now();
    }
    
    public Message (String username, String message, LocalDateTime time) {
        this.username = username;
        this.message = message;
        this.time = time;
    }
    
    public String getUsername () {
        return username;
    }
    
    public String getMessage () {
        return message;
    }
    
    public LocalDateTime getTime () {
        return time;
    }
    
    public void setMessage (String message) {
        this.message = message;
    }
    
    public String toFormattedString (String formatCode) {
        return String.format(formatCode, time, username, message);
    }
}
