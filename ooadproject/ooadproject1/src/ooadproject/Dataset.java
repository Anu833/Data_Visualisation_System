package ooadproject;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Dataset {
    private List<DataPoint> dataPoints;
    private List<String> columnNames;

    public Dataset() {
        dataPoints = new ArrayList<>();
        columnNames = new ArrayList<>();
    }

    public List<DataPoint> getDataPoints() {
        return dataPoints;
    }

    public List<String> getColumnNames() {
        return columnNames;
    }

    public void addDataPoint(DataPoint dataPoint) {
        dataPoints.add(dataPoint);
    }

    public void loadFromCSV(String filePath) {
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            // Read the first line to get column names
            if ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                columnNames = Arrays.asList(parts);
            }

            // Read data points
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                List<String> values = Arrays.asList(parts);
                DataPoint dataPoint = new DataPoint(values);
                addDataPoint(dataPoint);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void displayDataset() {
        System.out.println("DataPoint ID | " + String.join(" | ", columnNames));
        System.out.println("--------------------------------");

        for (DataPoint dataPoint : dataPoints) {
            System.out.print(dataPoint.getId() + " | ");
            System.out.println(String.join(" | ", dataPoint.getValues()));
        }
    }
}
