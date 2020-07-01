package aula05_02;

public class SnackLunchBuilder implements LunchBuilder {
    private Lunch lunch;

    public SnackLunchBuilder() {
        lunch = new Lunch();
    }

    @Override
    public void buildDrink() {
        lunch.setDrink("Sumo");
    }

    @Override
    public void buildMainCourse() {
        lunch.setMainCourse("Pão com Panado");
    }

    @Override
    public void buildSide() {
        lunch.setSide("Rissol");
    }

    @Override
    public Lunch getMeal() {
        return lunch;
    }
}
