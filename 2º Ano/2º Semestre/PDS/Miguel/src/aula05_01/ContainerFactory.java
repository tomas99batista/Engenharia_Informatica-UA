package aula05_01;

public class ContainerFactory {
    public static Container createContainerFor(Commodity com) {
        switch (com.getState()) {
            case Liquid:
                switch(com.getTemperature()){
                    case WARM:
                        return new TermicBottle();
                    case COLD:
                        return new PlasticBottle();
                }
            case Solid:
                switch (com.getTemperature()){
                    case WARM:
                        return new Tupperware();
                    case COLD:
                        return new PlasticBag();
                }
            default:
                //throw new Exception("Not a valid temperature!");
                return null;
        }
    }
}
