package aula06_02;

public interface ContactsInterface {
    /**
     * Opens a file and loads the list of contacts into the Contact interface
     *
     * @param store
     */
    void openAndLoad(ContactStorageInterface store);

    /**
     * <pre>
     * Saves the current list to a default file.
     * Note: The way of creating and naming the default file is implementation-based
     * </pre>
     */
    void saveAndClose();

    /**
     * <pre>
     * Saves the current list to the file associated with the storage passed
     * </pre>
     *
     * @param store the storage to save to
     */
    void saveAndClose(ContactStorageInterface store);

    /**
     * <pre>
     * Checks if a contact exists in the list
     * </pre>
     *
     * @param contact
     *
     * @return
     */
    boolean exist(Contact contact);

    /**
     * <pre>
     * Gets a contact based on the name, if it exists, otherwise returns null
     * </pre>
     *
     * @param name the to search for. Case-sensitive
     *
     * @return the contact if it exists, or null
     */
    Contact getByName(String name);

    /**
     * Adds a new contact to the list, if he doesn't not exist
     *
     * @param contact the contact to add
     *
     * @return
     */
    boolean add(Contact contact);

    /**
     * Removes a contact from the list, if he exists
     * @param contact
     * @return
     */
    boolean remove(Contact contact);

}
