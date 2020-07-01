package aula06_02;

import java.util.ArrayList;
import java.util.List;

public class ContactManager implements ContactsInterface {
    private ContactStorageInterface storage;
    private List<Contact>           contactList;

    /**
     * <pre>
     * By default, stores things in a TextStorage with the name ContactManager_[CurrentTimeMillis]
     * </pre>
     */
    public ContactManager() {
        storage = AbstractContactStorage.createStorage(this.getClass()
                                                           .getSimpleName() + "_" + System.currentTimeMillis() + ".txt");
        contactList = new ArrayList<>();
    }

    /**
     * Create a Contact Manager with a storage associated to it
     *
     * @param storage the storage type to save the contacts list
     */
    public ContactManager(ContactStorageInterface storage) {
        openAndLoad(storage);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void openAndLoad(ContactStorageInterface store) {
        if (store != null) {
            this.contactList = store.loadContacts();
            this.storage = store;
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void saveAndClose() {
        if (this.storage != null) {
            storage.saveContacts(contactList);
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void saveAndClose(ContactStorageInterface store) {
        if (store != null) {
            store.saveContacts(contactList);
        }

    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean exist(Contact contact) {
        return contactList.contains(contact);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Contact getByName(String name) {
        for (Contact c : contactList) {
            if (c.getName().equals(name)) {
                return c;
            }
        }
        return null;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean add(Contact contact) {
        if (!exist(contact)) {
            contactList.add(contact);
            return true;
        }
        return false;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean remove(Contact contact) {
        if (exist(contact)) {
            contactList.remove(contact);
            return true;
        }
        return false;
    }
}
