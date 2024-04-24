/*
package ooadproject;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.statistics.HistogramDataset;
import javax.swing.*;
import java.awt.*;

public class HistogramExample extends JFrame {

    public HistogramExample(String title) {
        super(title);

        // Sample data
        double[] data = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

        // Create a dataset
        HistogramDataset dataset = new HistogramDataset();
        dataset.addSeries("Histogram", data, 10); // The last parameter (10) is the number of bins

        // Create a chart
        JFreeChart chart = ChartFactory.createHistogram(
                "Histogram Example", // chart title
                "Value", // x-axis label
                "Frequency", // y-axis label
                dataset
        );

        // Customize chart
        chart.setBackgroundPaint(Color.white);

        // Create Panel
        ChartPanel panel = new ChartPanel(chart);
        panel.setPreferredSize(new Dimension(800, 600));
        setContentPane(panel);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            HistogramExample example = new HistogramExample("Histogram Example");
            example.setSize(800, 600);
            example.setLocationRelativeTo(null);
            example.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            example.setVisible(true);
        });
    }
}
*/