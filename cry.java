import javax.swing.*;

public class cry {
    public static void main(String[] args) {
        // Create a frame (window)
        JFrame frame = new JFrame("Hello World");
        frame.setSize(300, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a text box
        JTextField textField = new JTextField("Hello, World!");
        textField.setHorizontalAlignment(JTextField.LEFT);

        // Add text box to frame
        frame.add(textField);

        // Make the window visible
        frame.setVisible(true);
    }
}