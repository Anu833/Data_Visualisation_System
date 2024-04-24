package ooadproject;

public class VisualizationFactory4 implements VisualizationFactory{
    @Override
    public Visualization factoryMethod() {
        return new VisualizationPlot4();
    }
}

