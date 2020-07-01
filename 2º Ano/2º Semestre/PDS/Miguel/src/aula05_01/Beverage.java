package aula05_01;

public abstract class Beverage implements Commodity {
    protected State state;
    protected Temperature temperature;
    // protected porque a nossa classe só deve ser instanciada pelas subclasses
    protected Beverage(){
        this.state = State.Liquid;
    }
    public State getState() {
        return state;
    }
    public Temperature getTemperature() {
        return temperature;
    }
    @Override
    public String toString() {
            return String.format("Temperature()=%s, State()=%s", temperature, state);
    }
}
