package aula06_02;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class BinaryStorage implements ContactStorageInterface {
    private String filename;

    private BinaryStorage(String filename) {
        this.filename = filename;
    }

    /**
     * {@inheritDoc}
     */
    public static BinaryStorage getInstance(String file) {
        return new BinaryStorage(file);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Contact> loadContacts() {
        ArrayList<Contact> contacts;
        try (ObjectInputStream listIn = new ObjectInputStream(new FileInputStream(filename))) {
            contacts = (ArrayList) listIn.readObject();
            return contacts;
        } catch (IOException io) {
            System.err.println("Error opening file \"" + filename + "\"");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public boolean saveContacts(List<Contact> list) {
        try (ObjectOutputStream listOut = new ObjectOutputStream(new FileOutputStream(filename))) {
            listOut.writeObject(list);
            return true;
        } catch (IOException e) {
            System.err.println("Error writing to file" + filename);
        }
        return false;
    }
}
