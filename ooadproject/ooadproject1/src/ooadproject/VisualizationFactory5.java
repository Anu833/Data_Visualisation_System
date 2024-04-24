package ooadproject;

public class VisualizationFactory5 implements VisualizationFactory{
    @Override
    public Visualization factoryMethod() {
        return new VisualizationPlot5();
    }
}

