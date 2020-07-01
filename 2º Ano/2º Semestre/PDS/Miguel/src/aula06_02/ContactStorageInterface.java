package aula06_02;

import java.util.List;

/**
 *
 */
public interface ContactStorageInterface {
    /**
     * Method for reading the Contacts from a file
     *
     * @return Null if an error occurred, otherwise the list of contacts
     */
    List<Contact> loadContacts();

    /**
     * Method for saving a Contact list
     * @param list the list of contacts to save to file
     * @return true if the save was successful
     */
    boolean saveContacts(List<Contact> list);

}
