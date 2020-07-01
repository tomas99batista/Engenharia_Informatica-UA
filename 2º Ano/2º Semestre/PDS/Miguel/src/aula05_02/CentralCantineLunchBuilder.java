package aula05_02;

public class CentralCantineLunchBuilder implements LunchBuilder {
    private Lunch lunch;
    public CentralCantineLunchBuilder(){
        lunch = new Lunch();
    }
    @Override
    public void buildDrink() {
        lunch.setDrink("Água");
    }

    @Override
    public void buildMainCourse() {
        lunch.setMainCourse("Grelhada mista");
    }

    @Override
    public void buildSide() {
        lunch.setSide("Queijo Fresco");

    }

    @Override
    public Lunch getMeal() {
        return lunch;
    }
}
