package aula07_02;

public abstract class TextReaderDecorator implements TextParserInterface {
    TextParserInterface parser;

    public TextReaderDecorator(TextParserInterface textParser) {
        parser = textParser;
    }

    @Override
    public boolean hasNext() {
        return parser.hasNext();
    }

    @Override
    public String next() {
        return parser.next();
    }
}
