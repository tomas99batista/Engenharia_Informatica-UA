package aula05_01;

public class Milk extends Beverage {
    public  Milk(){
        super();
        this.temperature = Temperature.COLD;
    }
    @Override
    public String toString() {
        return String.format("%s [%s]",this.getClass().getSimpleName(),super.toString());
    }
}
