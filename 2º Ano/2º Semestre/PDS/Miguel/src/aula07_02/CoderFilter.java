package aula07_02;

public class CoderFilter extends TextReaderDecorator {

    private int    cypherKey;
    private String alphabet;
    private int    size;

    public CoderFilter(TextParserInterface textParser) {

        super(textParser);
        alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        cypherKey = (alphabet.length() / 2) + 4;
        size = alphabet.length();
    }

    @Override
    public boolean hasNext() {
        return parser.hasNext();
    }

    @Override
    public String next() {
        return encode(parser.next());
    }

    /**
     * Helper method for encryption our next() method. Implementation is the Caesar Cypher
     *
     * @param string
     *
     * @return
     */
    private String encode(String string) {
        StringBuilder sb = new StringBuilder();
        char[]        c  = string.toCharArray();
        for (char aC : c) {
            int index = alphabet.indexOf(aC);
            if (index == -1) {
                sb.append(String.valueOf(aC));
            } else {
                sb.append(alphabet.charAt((index + cypherKey) % size));
            }
        }
        return sb.toString();
    }
}
