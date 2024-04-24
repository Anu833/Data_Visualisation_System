package ooadproject;

public class VisualizationFactory3 implements VisualizationFactory{
    @Override
    public Visualization factoryMethod() {
        return new VisualizationPlot3();
    }
}

