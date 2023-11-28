package ru.mirea.lab5;

import java.awt.*;
        import java.awt.event.*;
        import java.io.IOException;
        import java.net.MalformedURLException;
        import java.net.URL;
        import javax.imageio.ImageIO;
        import javax.swing.*;

public class Animation extends JFrame {

    final Image[] frames = {
            ImageIO.read(new URL("https://i.pinimg.com/originals/66/70/27/66702790134d304b09f73f1bf10598ee.jpg")),
            ImageIO.read(new URL("https://i.pinimg.com/originals/5a/5a/25/5a5a25668967178854c76ec779fa10ae.jpg")),
            ImageIO.read(new URL("https://i.pinimg.com/originals/66/70/27/66702790134d304b09f73f1bf10598ee.jpg")),
            ImageIO.read(new URL("https://i.pinimg.com/originals/5a/5a/25/5a5a25668967178854c76ec779fa10ae.jpg"))
    };


    public Animation() throws IOException {
        super("Animation");
        CreateGUI();
    }

    private void CreateGUI() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        final JLabel animation = new JLabel(new ImageIcon(frames[0]));
        add(animation, BorderLayout.CENTER);

        ActionListener animate = new ActionListener() {

            private int index = 0;

            @Override
            public void actionPerformed(ActionEvent e) {
                if (index<frames.length-1) {
                    index++;
                } else {
                    index = 0;
                }
                animation.setIcon(new ImageIcon(frames[index]));
            }
        };

        final Timer timer = new Timer(200,animate);

        timer.start();
    }

    public static void main(String[] args) throws IOException {
        Animation frame = new Animation();
        frame.setSize(1500,800);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}