/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classclient;

/**
 *
 * @author Bennett.DenBleyker
 */
public class PrettyPrompts {

    String userOne;
    String userTwo;

    public PrettyPrompts(String username, String myFriend) {
        int requiredLength = Math.max(username.length(), myFriend.length());
        for (int i = 0; i < requiredLength; i++) {
            if (username.length() < requiredLength) {
                username += " ";
            }
            if (myFriend.length() < requiredLength) {
                myFriend += " ";
            }
        }
        userOne = username;
        userTwo = myFriend;
    }
    
    public String getPromptOne() {
        return userOne + " > ";
    }
    
    public String getPromptTwo() {
        return userTwo + " > ";
    }
}
