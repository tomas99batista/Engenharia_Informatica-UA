package aula07_02;

public class ReverseFilter extends TextReaderDecorator {

    public ReverseFilter(TextParserInterface textParser) {
        super(textParser);
    }

    @Override
    public boolean hasNext() {
        return parser.hasNext();
    }

    @Override
    public String next() {
        return new StringBuilder(parser.next()).reverse().toString();
    }
}
