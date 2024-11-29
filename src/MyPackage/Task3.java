package MyPackage;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Task3 extends JFrame {

    public Task3() {
        setTitle("Изображения с подписями");
        setSize(500, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        try {
            BufferedImage image1 = ImageIO.read(new File("/matveyaleks/Загрузки/Джава/frame1.png"));
            addImageWithLabel(panel, image1, "Изображение 1");

            BufferedImage image2 = ImageIO.read(new File("/matveyaleks/Загрузки/Джава/frame2.png"));
            addImageWithLabel(panel, image2, "Изображение 2");

        } catch (IOException e) {
            e.printStackTrace();
        }

        add(panel);
        setVisible(true);
    }

    private void addImageWithLabel(JPanel panel, BufferedImage image, String labelText) {
        JLabel imageLabel = new JLabel(new ImageIcon(image));
        JLabel textLabel = new JLabel(labelText);
        panel.add(imageLabel);
        panel.add(textLabel);
    }


    public static void main(String[] args) {
        new Task3();
    }
}
