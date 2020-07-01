package aula06_02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class TextStorage implements ContactStorageInterface {
    private String DEFAULT_SEPARATOR = "\t";
    private String filename;

    /**
     * {@inheritDoc}
     */
    private TextStorage(String filename) {
        this.filename = filename;
    }

    /**
     * {@inheritDoc}
     */
    public static TextStorage getInstance(String file) {
        return new TextStorage(file);
    }

    @Override
    public List<Contact> loadContacts() {
        List<Contact> contacts = new ArrayList<>();
        try (BufferedReader reader = Files.newBufferedReader(Paths.get(filename))) {
            String line;
            try {
                while ((line = reader.readLine()) != null) {
                    // we assume it's only name, cellphone
                    String[] contactInfo = line.split(DEFAULT_SEPARATOR);
                    contacts.add(Contact.newContact(contactInfo[0], contactInfo[1]));
                }
                return contacts;
            } catch (IOException e) {
                System.err.println("Error reading file");
            }
        } catch (IOException e) {
            System.err.println("Error opening file \"" + filename + "\"");
        }
        return null;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean saveContacts(List<Contact> list) {
        try (BufferedWriter writer = Files.newBufferedWriter(Paths.get(filename))) {
            for (Contact c : list) {
                try {
                    writer.write(String.format("%s %s %s", c.getName(), DEFAULT_SEPARATOR, c.getPhone()));
                } catch (IOException e) {
                    System.err.println("Error writing Contact to file\nContact: " + c.toString());
                }
            }

        } catch (IOException e) {
            System.err.println("Error opening file \"" + filename + "\"");
        }
        return false;
    }
}
