package ooadproject;

import java.util.*;

public class DataPoint {
    private List<String> values;
    private int id;
    private static int currentId = 0;

    public DataPoint(List<String> values) {
        this.values = new ArrayList<>(values);
        this.id = currentId++;
    }

    public List<String> getValues() {
        return values;
    }

    public int getId() {
        return id;
    }
}
