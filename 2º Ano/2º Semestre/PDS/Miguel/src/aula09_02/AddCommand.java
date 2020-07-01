package aula09_02;

import java.util.Collection;

public class AddCommand<T> implements Command {
    // Reference to the collection
    Collection<T> collection;
    T             element;

    public AddCommand(Collection<T> collection, T element) {
        this.collection = collection;
        this.element = element;
    }

    @Override
    public void execute() {
        collection.add(element);
    }

    @Override
    public void undo() {
        collection.remove(element);
    }
}
