package aula06_02;

public class MainContacts {
    public static void main(String[] args) {
        String file = "aula06_contacts";
        System.out.println("0 - Creating our Binary and Text interfaces with filename base as: " + file);
        ContactStorageInterface textStorage = AbstractContactStorage.createStorage(file, "txt");
        ContactStorageInterface binStorage  = AbstractContactStorage.createStorage(file, "bin");
        Contact placeHolder = Contact.newContact("TestContact", "+3123123123");

        ContactsInterface contactManager;
        System.out.println("1 - We create a ContactManager without specifying the storage type (it will default to text)");
        contactManager = new ContactManager();

        System.out.println("2 - Adding a new contact to the list");
        contactManager.add(placeHolder);
        System.out.println("3 - And we save the changes");
        contactManager.saveAndClose();

        System.out.println("4 - Creating a new contact manager with the storage being a text file ");
        contactManager = new ContactManager(textStorage);

        System.out.println("5 - We add a new contact but without affecting original file");
        contactManager.add(placeHolder);

        System.out.println("6 - We check if the contact list contains the contact we just tried to add");
        System.out.println(placeHolder.getName() + " exists? " + contactManager.exist(placeHolder));

        System.out.println("7 - Saving our Contact List in Binary format (which doesn't affect previous txt file)");
        contactManager.saveAndClose(binStorage);

        System.out.println("8 - We open the binary file we just tried to save to");
        contactManager.openAndLoad(binStorage);

        System.out.println("9 - We check if the name exists in the contact list we just tried to read to");
        System.out.println(placeHolder.getName() + " exists? " + contactManager.exist(placeHolder));

        System.out.println("10 - We open the original text file");
        contactManager.openAndLoad(textStorage);

        System.out.println("11 - And we check if the contact added exists or not (spoiler: if there's no bug, it wasn't added)");
        System.out.println(placeHolder.getName() + " exists? " + contactManager.exist(placeHolder));

    }
}
