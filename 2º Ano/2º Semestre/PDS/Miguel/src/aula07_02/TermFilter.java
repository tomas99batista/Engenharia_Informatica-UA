package aula07_02;

import java.util.Scanner;

public class TermFilter extends TextReaderDecorator {
    private Scanner buffer;

    public TermFilter(TextParserInterface textParser) {
        super(textParser);
    }

    @Override
    public boolean hasNext() {
        if (buffer == null || !buffer.hasNext()) {
            if (parser.hasNext()) {
                buffer = new Scanner(parser.next());
            }
        }
        return buffer.hasNext();
    }

    @Override
    public String next() {
        return buffer.next();
    }
}
