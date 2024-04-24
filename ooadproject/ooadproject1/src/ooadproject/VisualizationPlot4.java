package ooadproject;

import org.knowm.xchart.*;
//import org.knowm.xchart.style.markers.SeriesMarkers;

import java.util.*;

public class VisualizationPlot4 implements Visualization {

    @Override
    public void display(Dataset dt) {
        BubbleChart chart = new BubbleChartBuilder()
                .width(800)
                .height(600)
                .title("Bubble Chart")
                .xAxisTitle(dt.getColumnNames().get(0))
                .yAxisTitle("Value")
                .build();

        List<String> columnNames = dt.getColumnNames();
        List<DataPoint> dataPoints = dt.getDataPoints();

        for (int i = 1; i < columnNames.size(); i++) {
            String columnName = columnNames.get(i);
            chart.addSeries(columnName, getCategories(dataPoints), getDataValues(dataPoints, i), getBubbleSizes(dataPoints, i));
        }

        new SwingWrapper<>(chart).displayChart();
    }

    private double[] getDataValues(List<DataPoint> dataPoints, int columnIndex) {
        return dataPoints.stream()
                .mapToDouble(dp -> Double.parseDouble(dp.getValues().get(columnIndex)))
                .toArray();
    }

    private double[] getCategories(List<DataPoint> dataPoints) {
        Map<String, Integer> categoryMap = new HashMap<>();
        List<Double> categoriesList = new ArrayList<>();

        for (DataPoint dp : dataPoints) {
            String category = dp.getValues().get(0);
            if (!categoryMap.containsKey(category)) {
                categoryMap.put(category, categoryMap.size()); // Assign a unique numeric value to each category
            }
            categoriesList.add((double) categoryMap.get(category));
        }

        return categoriesList.stream().mapToDouble(Double::doubleValue).toArray();
    }

    private double[] getBubbleSizes(List<DataPoint> dataPoints, int columnIndex) {
        // For simplicity, let's use the same data values as bubble sizes
        return getDataValues(dataPoints, columnIndex);
    }
}
