package MyPackage;

import javax.swing.*;
import java.awt.*;

public class Task1 extends JFrame {

    public Task1() {
        setTitle("Привет МИР!");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        JLabel label = new JLabel("Привет МИР!");
        panel.add(label);

        add(panel);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Task1();
    }
}
