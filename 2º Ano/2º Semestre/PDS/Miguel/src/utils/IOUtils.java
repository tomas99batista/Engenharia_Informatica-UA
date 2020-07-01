package utils;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class IOUtils
{

    /**
     * Returns line read from a file
     * 
     * @param pathToFile
     *            - Relative Path to the file
     * @return The lines read from file or null, if none was found
     */
    public static List<String> readFile(String pathToFile)
    {
        try
        {
            BufferedReader file = getBufferedReader(pathToFile);
            String line;
            List<String> lines = new ArrayList<>();
            while ((line = file.readLine()) != null)
            {
                lines.add(line);
            }
            file.close();
            return lines;
        }
        catch (IOException e)
        {
            System.err.printf("ERROR: File %s not found", pathToFile);
        }
        return null;
    }

    /**
     * Returns every line read from the file, including lines split by regex
     * 
     * @param pathToFile
     *            Relative Path to the file
     * @return The lines read from file or null, if none was found
     */
    public static List<String> readFile(String pathToFile, String regex)
    {
        try
        {
            BufferedReader file = getBufferedReader(pathToFile);
            String line;
            List<String> lines = new ArrayList<>();
            while ((line = file.readLine()) != null)
            {
                for (String clean : line.split(regex))
                {
                    if (clean != null)
                    {
                        if (!clean.isEmpty())
                            lines.add(clean);
                    }
                }

            }
            file.close();
            return lines;
        }
        catch (IOException e)
        {
            System.err.printf("ERROR: File %s not found", pathToFile);
        }
        return null;
    }

    public static void writeFile(String pathToFile, List<String> lines)
    {
        try
        {
            BufferedWriter file = getBufferedWriter(pathToFile);
            for (String line : lines)
            {
                file.write(line);
                file.write("\n");
            }
            file.close();
        }
        catch (IOException e)
        {
            System.err.printf("ERROR: File %s not found", pathToFile);
        }
    }

    // BufferedWriter to a file
    public static BufferedWriter getBufferedWriter(String directory) throws IOException
    {
        return Files.newBufferedWriter(Paths.get(directory));
    }

    // BufferedReader from a file
    public static BufferedReader getBufferedReader(String directory) throws IOException
    {
        return Files.newBufferedReader(Paths.get(directory));
    }

}
