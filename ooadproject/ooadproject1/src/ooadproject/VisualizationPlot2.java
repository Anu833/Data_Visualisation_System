package ooadproject;

import org.knowm.xchart.*;
//import javax.swing.*;
import java.util.*;


public class VisualizationPlot2 implements Visualization {

    @Override
    public void display(Dataset dt) {
        CategoryChart chart = new CategoryChartBuilder()
                .width(800)
                .height(600)
                .title("Bar Chart")
                .xAxisTitle(dt.getColumnNames().get(0))
                .yAxisTitle("Value")
                .build();

        List<String> columnNames = dt.getColumnNames();
        List<DataPoint> dataPoints = dt.getDataPoints();

        // Get unique categories from the first column
        Set<String> categories = new HashSet<>();
        for (DataPoint dp : dataPoints) {
            categories.add(dp.getValues().get(0));
        }

        // Create series for each column (except the first one)
        for (int i = 1; i < columnNames.size(); i++) {
            List<Double> values = new ArrayList<>();
            for (DataPoint dp : dataPoints) {
                values.add(Double.parseDouble(dp.getValues().get(i)));
            }
            chart.addSeries(columnNames.get(i), new ArrayList<>(categories), values);
        }

        new SwingWrapper<>(chart).displayChart();
    }
}
