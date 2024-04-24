package ooadproject;

public class VisualizationFactory6 implements VisualizationFactory{
    @Override
    public Visualization factoryMethod() {
        return new VisualizationPlot6();
    }
}

