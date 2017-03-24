
package clienttwo;

import classclient.PrettyPrompts;
import java.util.Scanner;

/**
 *
 * @author Bennett.DenBleyker
 */
public class ClientTwo {
    
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your username: ");
        PrettyPrompts prompter = new PrettyPrompts(scanner.nextLine(), "Computer");
        MessageClient sender = new DelayedClient();

        String friendMessage;
        String input;

        do {
            System.out.print(prompter.getPromptOne());
            input = scanner.nextLine();
            friendMessage = sender.send(input);
            if (!input.equalsIgnoreCase("exit")) {
                System.out.println(prompter.getPromptTwo() + friendMessage);
            }
        } while (!input.equalsIgnoreCase("exit"));
    }
    
}
