package ooadproject;

import org.knowm.xchart.*;
//import javax.swing.*;
import java.util.*;

public class VisualizationPlot3 implements Visualization {

    @Override
    public void display(Dataset dt) {
        XYChart chart = new XYChartBuilder()
                .width(800)
                .height(600)
                .title("Line Chart")
                .xAxisTitle(dt.getColumnNames().get(0))
                .yAxisTitle("Value")
                .build();

        List<String> columnNames = dt.getColumnNames();
        List<DataPoint> dataPoints = dt.getDataPoints();

        for (int i = 1; i < columnNames.size(); i++) {
            String columnName = columnNames.get(i);
            chart.addSeries(columnName, getCategories(dataPoints), getDataValues(dataPoints, i));
        }

        new SwingWrapper<>(chart).displayChart();
    }

    private double[] getDataValues(List<DataPoint> dataPoints, int columnIndex) {
        return dataPoints.stream()
                .mapToDouble(dp -> Double.parseDouble(dp.getValues().get(columnIndex)))
                .toArray();
    }

    private double[] getCategories(List<DataPoint> dataPoints) {
        Set<String> categoriesSet = new HashSet<>();
        List<String> categoriesList = new ArrayList<>();

        for (DataPoint dp : dataPoints) {
            String category = dp.getValues().get(0);
            if (!categoriesSet.contains(category)) {
                categoriesSet.add(category);
                categoriesList.add(category);
            }
        }

        double[] categories = new double[categoriesList.size()];
        for (int i = 0; i < categoriesList.size(); i++) {
            categories[i] = i; // Assign a unique numeric value to each category
        }

        return categories;
    }
}
