package aula06_02;

import java.io.Serializable;
import java.util.Objects;

public class Contact implements Serializable {
    private String name;
    private String phone;

    private Contact(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }


    public static Contact newContact(String name, String phone) {

        return new Contact(name, phone);
    }

    @Override
    public String toString() {
        return String.format("Name: %s\tPhone:%s", name, phone);
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Contact contact = (Contact) o;
        return Objects.equals(name, contact.name) &&
                Objects.equals(phone, contact.phone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, phone);
    }

}
