
package clienttwo;

/**
 *
 * @author Bennett.DenBleyker
 */
public class DelayedClient implements MessageClient {

    @Override
    public String send(String message) {
        System.out.println("One sec........,........");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            System.out.println("STOP IT!!!");
        }
        return message;
    }

}
