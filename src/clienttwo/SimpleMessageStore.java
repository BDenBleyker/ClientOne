
package clienttwo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Bennett.DenBleyker
 */
public class SimpleMessageStore implements MessageStore {

    List<Message> messages = new ArrayList();
    
    @Override
    public void store(String username, String message) {
        messages.add (new Message(username, message));
    }

    @Override
    public void dumpAll() {
        String formatCode = "%-15s %-15s %-15s";
        System.out.println(String.format(formatCode, "Date", "From", "Message"));
        for (Message msg : messages) {
            System.out.println(msg.toFormattedString(formatCode));
        }
    }

}
