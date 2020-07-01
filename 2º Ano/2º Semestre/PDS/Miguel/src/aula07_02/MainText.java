package aula07_02;

import java.io.IOException;

public class MainText {
    public static void main(String[] args) {
        String file = "aula07_02.txt";
        try {
            TextParserInterface textReader       = new TextReader(file);
            TextParserInterface coderFilter      = new CoderFilter(new TextReader(file));
            TextParserInterface reverseFilter    = new ReverseFilter(new TermFilter(new TextReader(file)));
            TextParserInterface termCoder        = new CoderFilter(new TermFilter(new TextReader(file)));
            TextParserInterface reverseTermCoder = new ReverseFilter(new CoderFilter(new TermFilter(new TextReader(file))));
            System.out.println("1 - Simple TextReader");
            while (textReader.hasNext()) {
                System.out.println(textReader.next());
            }
            System.out.println("2 - CoderFilter of TextReader");
            while (coderFilter.hasNext()) {
                System.out.println(coderFilter.next());
            }
            System.out.println("3 - ReverseFilter of TermFilter of TextReader");
            while (reverseFilter.hasNext()) {
                System.out.println(reverseFilter.next());
            }
            System.out.println("4 - CoderFilter of TermFilter of TextReader");
            while (termCoder.hasNext()) {
                System.out.println(termCoder.next());
            }
            System.out.println("5 - Reverse of CoderFilter of TermFilter of TextReader");
            while (reverseTermCoder.hasNext()) {
                System.out.println(reverseTermCoder.next());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
