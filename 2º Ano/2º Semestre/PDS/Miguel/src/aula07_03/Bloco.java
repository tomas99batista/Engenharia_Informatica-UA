package aula07_03;

import java.util.ArrayList;
import java.util.List;

public class Bloco extends Componente {
    private List<Componente> componentes;
    public Bloco(String name) {
        super(name);
        this.componentes = new ArrayList<>();
    }

    public void add(Componente componente) {
        componentes.add(componente);

    }

    @Override
    public void draw() {
        System.out.print(indent.toString() + "Bloco ");
        super.draw();
        indent.append("\t");
        for (Componente c : componentes) {
            c.draw();
        }
        indent.setLength(indent.length()-1);
    }
}
