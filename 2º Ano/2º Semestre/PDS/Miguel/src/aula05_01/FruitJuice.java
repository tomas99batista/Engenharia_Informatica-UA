package aula05_01;

public class FruitJuice extends Beverage {
    private String fruitName;

    public FruitJuice() {
        super();
        this.temperature = Temperature.COLD;
        this.fruitName = "Orange";
    }

    @Override
    public String toString() {
        return String.format("%s [fruit=%s, %s]", this.getClass().getSimpleName(), fruitName, super.toString());
    }
}
