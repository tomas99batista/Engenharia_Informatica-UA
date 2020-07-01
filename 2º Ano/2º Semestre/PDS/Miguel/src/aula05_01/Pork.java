package aula05_01;

public class Pork extends  Meat {
    public Pork(){
        super();
        this.temperature = Temperature.WARM;
    }

    @Override
    public String toString() {
        return String.format("%s [%s]",this.getClass().getSimpleName(),super.toString());
    }
}
