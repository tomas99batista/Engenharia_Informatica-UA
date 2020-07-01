package aula07_03;

public class Rectangulo extends Componente {

    public Rectangulo(String name) {
        super(name);
    }

    @Override
    public void draw() {
        System.out.print(indent.toString() + this.getClass().getSimpleName() + " ");
        super.draw();
    }
}
