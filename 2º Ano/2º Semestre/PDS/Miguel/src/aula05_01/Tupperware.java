package aula05_01;

public class Tupperware extends Container{
    @Override
    public String toString() {
        return String.format("%s [commodity=%s]",this.getClass().getSimpleName(),commodity.toString());
    }
}
