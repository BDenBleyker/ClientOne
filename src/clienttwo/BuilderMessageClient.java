
package clienttwo;

/**
 *
 * @author Bennett.DenBleyker
 */
public class BuilderMessageClient implements MessageClient {

    @Override
    public String send(String message) {
        return "Good job unless you are doing a bad one - then do better!";
    }

}
