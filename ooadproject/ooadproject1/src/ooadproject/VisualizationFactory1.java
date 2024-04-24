package ooadproject;

public class VisualizationFactory1 implements VisualizationFactory{
    @Override
    public Visualization factoryMethod() {
        return new VisualizationPlot1();
    }
}

