package aula06_02;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.InputMismatchException;

/**
 * Abstract Factory for managing the creation of the Storage Interfaces
 */
public abstract class AbstractContactStorage {
    /**
     * <pre>
     * Returns a new storage method, respective to the extension asked. <br/> E.g: createStorage("potato","csv")
     * If no file is found, we create it
     * </pre>
     *
     * @param file the filename without the extension
     * @param type the extension or type of the file
     *
     * @return the corresponding storage type
     */
    public static ContactStorageInterface createStorage(String file, String type) {
        // We check if it exists
        Path filePath = Paths.get(file + "." + type);
        if (Files.notExists(filePath)) {
            try {
                Files.createFile(filePath);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        switch (type.toLowerCase()) {
            case "txt":
                return TextStorage.getInstance(file + ".txt");

            case "bin":
                return BinaryStorage.getInstance(file + ".bin");
            case "csv":
                System.err.println("Extension: \"" + type + "\" not valid/implemented!");
                break;
            case "json":
                System.err.println("Extension: \"" + type + "\" not valid/implemented!");
                break;
            case "xls":
                System.err.println("Extension: \"" + type + "\" not valid/implemented!");
                break;
            default:
                System.err.println("Extension: \"" + type + "\" not valid/implemented!");
                break;
        }
        // If we reach here, that means the type wasn't valid, so we need to delete the file we temporarily created
        // NOTE: can be optimized
        try {
            Files.delete(filePath);
        } catch (IOException e) {
            // don't really need to do anything if it doesn't delete
        }
        return null;
    }

    /**
     * <pre>
     * Returns a new storage based on a filename of the form "file.extension"
     * </pre>
     *
     * @param filename the filename with the extension
     *
     * @return the corresponding storage type
     */
    public static ContactStorageInterface createStorage(String filename) throws InputMismatchException {
        // First we verify if the filename given is valid
        if (!filename.contains(".")) {
            throw new InputMismatchException("Error: filename does not contain any extension!");
        }
        // we take split it on the dot
        String[] names = filename.split("\\.");
        // the extension will be the last string that will be split
        String extension = names[names.length - 1];
        // and we erase it from the array
        names[names.length - 1] = null;
        // after that, we just build our new filename
        StringBuilder newFilename = new StringBuilder();
        for (String s : names) {
            if (s != null) {
                newFilename.append(s);
            }
        }
        // and we reuse the function for determining the class to create
        return createStorage(newFilename.toString(), extension);
    }
}
