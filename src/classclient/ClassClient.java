/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classclient;

import java.util.Scanner;

/**
 *
 * @author Bennett.DenBleyker
 */
public class ClassClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your username: ");
        PrettyPrompts prompter = new PrettyPrompts(scanner.nextLine(), "Computer");
        System.out.println(ClientContext.WarningStatement());
        while (!scanner.nextLine().equals("k")) {}

        String friendMessage;
        String input;

        do {
            System.out.print(prompter.getPromptOne());
            input = scanner.nextLine();
            friendMessage = input;
            if (!input.equalsIgnoreCase("exit")) {
                System.out.println(prompter.getPromptTwo() + friendMessage);
            }
        } while (!input.equalsIgnoreCase("exit"));
    }

}
