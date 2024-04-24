package ooadproject;

import javax.swing.*;

@SuppressWarnings("serial")
public class MySwingComponent extends JFrame {
    public MySwingComponent() {
        // Add Swing components to the JFrame
        JLabel label = new JLabel("Hello, Swing!");
        add(label);

        // Set JFrame properties
        setTitle("My Swing App");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        // Create an instance of your Swing component
        SwingUtilities.invokeLater(() -> new MySwingComponent());
    }
}