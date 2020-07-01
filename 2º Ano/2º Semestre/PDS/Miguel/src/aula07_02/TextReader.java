package aula07_02;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class TextReader implements TextParserInterface {
    private Scanner fileReader;

    public TextReader(String filename) throws IOException {
        fileReader = new Scanner(Files.newBufferedReader(Paths.get(filename)));
    }

    @Override
    public boolean hasNext() {
        return fileReader.hasNextLine();
    }

    @Override
    public String next() {
        return fileReader.nextLine();
    }
}
