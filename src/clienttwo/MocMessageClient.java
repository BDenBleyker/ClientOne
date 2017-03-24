
package clienttwo;

/**
 *
 * @author Bennett.DenBleyker
 */
public class MocMessageClient implements MessageClient {

    @Override
    public String send(String message) {
        return message;
    }

}
