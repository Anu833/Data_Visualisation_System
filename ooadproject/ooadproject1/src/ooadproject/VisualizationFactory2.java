package ooadproject;

public class VisualizationFactory2 implements VisualizationFactory{
    @Override
    public Visualization factoryMethod() {
        return new VisualizationPlot2();
    }
}

