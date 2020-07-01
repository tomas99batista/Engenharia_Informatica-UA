package aula05_02;

public class LunchDirector {
    private  LunchBuilder lunchBuilder;
    public LunchDirector(LunchBuilder builder) {
        this.lunchBuilder = builder;
    }

    public void constructMeal() {
        lunchBuilder.buildDrink();
        lunchBuilder.buildMainCourse();
        lunchBuilder.buildSide();
    }
    public Lunch getMeal() {
        return lunchBuilder.getMeal();
    }
}
