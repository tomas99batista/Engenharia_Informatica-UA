package aula07_03;

public class Quadrado extends Componente {

    public Quadrado(String name) {
        super(name);
    }

    @Override
    public void draw() {
        System.out.print(indent.toString() + this.getClass().getSimpleName() + " ");
        super.draw();
    }
}
