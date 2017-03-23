package classclient;

public class AngryChatBotClient implements MessageClient {
    
    @Override
    public String send(String message) {
        if (message.toLowerCase().contains("computer") && !message.toLowerCase().contains("mr. computer")) {
            return "That is Mr. Computer to you";
        } else if (message.toLowerCase().contains("hello world")) {
            return "Welcome to the machine Hal";
        } else {
            String backwards = "";
            for (String s : message.split("")) {
                backwards = s + backwards;
            }
            return backwards;
        }
    }
    
}
