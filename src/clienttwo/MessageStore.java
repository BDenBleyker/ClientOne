
package clienttwo;

/**
 *
 * @author Bennett.DenBleyker
 */
public interface MessageStore {
    public void store(String username, String message);
    public void dumpAll();
}
