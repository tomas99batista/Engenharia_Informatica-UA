package aula05_01;

public class BeverageFactory {
    public static Commodity createBeverage(Temperature temp) {
        switch (temp) {
            case COLD:
                return new FruitJuice();
            case WARM:
                return new Milk();
            default:
                //throw new Exception("ERROR: " + temp + " is not a valid temperature!");
                return null;
        }
    }
}
