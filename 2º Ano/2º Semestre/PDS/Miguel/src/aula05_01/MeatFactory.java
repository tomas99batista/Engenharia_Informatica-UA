package aula05_01;

public class MeatFactory {
    public static Commodity createMeat(Temperature temp) {
        switch (temp) {
            case COLD:
                return new Pork();
            case WARM:
                return new Tuna();
            default:
                //throw new Exception("Not a valid temperature!");
                return null;
        }
    }
}
