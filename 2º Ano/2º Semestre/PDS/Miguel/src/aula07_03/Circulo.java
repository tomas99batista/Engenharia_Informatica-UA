package aula07_03;

public class Circulo extends Componente {

    public Circulo(String name) {
        super(name);
    }

    @Override
    public void draw() {
        System.out.print(indent.toString() + this.getClass().getSimpleName() + " ");
        super.draw();
    }
}
