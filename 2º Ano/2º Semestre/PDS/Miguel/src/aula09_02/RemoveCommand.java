package aula09_02;

import java.util.Collection;

public class RemoveCommand<T> implements Command {
    // Reference to the collection
    Collection<T> collection;
    T             element;

    public RemoveCommand(Collection<T> collection, T element) {
        this.collection = collection;
        this.element = element;
    }

    @Override
    public void execute() {
        collection.remove(element);
    }

    @Override
    public void undo() {
        collection.add(element);
    }
}
