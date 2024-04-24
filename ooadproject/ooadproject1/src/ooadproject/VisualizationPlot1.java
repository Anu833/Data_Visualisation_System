package ooadproject;

import org.knowm.xchart.*;
//import javax.swing.*;
import java.util.*;

public class VisualizationPlot1 implements Visualization {

    @Override
    public void display(Dataset dt) {
        PieChart chart = new PieChartBuilder()
                .width(800)
                .height(600)
                .title("Pie Chart")
                .build();

        List<String> columnNames = dt.getColumnNames();
        List<DataPoint> dataPoints = dt.getDataPoints();

        for (String columnName : columnNames.subList(1, columnNames.size())) {
            double sum = dataPoints.stream()
                                    .mapToDouble(dp -> Double.parseDouble(dp.getValues().get(columnNames.indexOf(columnName))))
                                    .sum();
            chart.addSeries(columnName, sum);
        }

        new SwingWrapper<>(chart).displayChart();
    }
}
