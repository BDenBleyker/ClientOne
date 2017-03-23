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

        char[] user = formatFirst(username.toCharArray(), myFriend.toCharArray());
        char[] friend = formatFirst(myFriend.toCharArray(), username.toCharArray());

        userOne = "";
        userTwo = "";
        
        for (int i = 0; i < user.length; i++) {
            userOne += user[i];
        }
        for (int i = 0; i < friend.length; i++) {
            userTwo += friend[i];
        }
    }

    private char[] formatFirst(char[] one, char[] two) {
        String username = "";
        String myFriend = "";
        for (int i = 0; i < one.length; i++) {
            username += one[i];
        }
        for (int i = 0; i < two.length; i++) {
            myFriend += two[i];
        }
        int requiredLength = Math.max(username.length(), myFriend.length());
        username = username.substring(0, 1).toUpperCase() + username.substring(1).toLowerCase();
        for (int i = 0; i < requiredLength; i++) {
            if (username.length() < requiredLength) {
                username += " ";
            }
            if (myFriend.length() < requiredLength) {
                myFriend += " ";
            }
        }
        return username.toCharArray();
    }

    public String getPromptOne() {
        return userOne + " > ";
    }

    public String getPromptTwo() {
        return userTwo + " > ";
    }
}
