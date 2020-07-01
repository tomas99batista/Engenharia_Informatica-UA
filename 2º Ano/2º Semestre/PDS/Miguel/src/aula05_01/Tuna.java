package aula05_01;

public class Tuna extends Meat{
    public Tuna(){
        super();
        this.temperature = Temperature.COLD;
    }

    @Override
    public String toString() {
        return String.format("%s [%s]",this.getClass().getSimpleName(),super.toString());
    }
}

