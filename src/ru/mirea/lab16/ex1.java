package ru.mirea.lab16;

//Реализуйте программу на Джава с использованием JTextArea и двумя
//следующего меню выбора:
//a) Цвет: который имеет возможность выбора из три возможных:
//синий, красный и черный
//b) Шрифт: три вида: “Times New Roman”, “MS Sans Serif”, “Courier
//New”.




import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ex1 extends JFrame {
    private JTextArea textArea;

    public ex1() {
        setTitle("Text Editor");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);

        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        JMenu colorMenu = new JMenu("Color");
        menuBar.add(colorMenu);

        JMenuItem blueItem = new JMenuItem("Blue");
        blueItem.addActionListener(new ColorAction(Color.BLUE));
        colorMenu.add(blueItem);

        JMenuItem redItem = new JMenuItem("Red");
        redItem.addActionListener(new ColorAction(Color.RED));
        colorMenu.add(redItem);

        JMenuItem blackItem = new JMenuItem("Black");
        blackItem.addActionListener(new ColorAction(Color.BLACK));
        colorMenu.add(blackItem);

        JMenu fontMenu = new JMenu("Font");
        menuBar.add(fontMenu);

        JMenuItem timesNewRomanItem = new JMenuItem("Times New Roman");
        timesNewRomanItem.addActionListener(new FontAction("Times New Roman"));
        fontMenu.add(timesNewRomanItem);

        JMenuItem msSansSerifItem = new JMenuItem("MS Sans Serif");
        msSansSerifItem.addActionListener(new FontAction("MS Sans Serif"));
        fontMenu.add(msSansSerifItem);

        JMenuItem courierNewItem = new JMenuItem("Courier New");
        courierNewItem.addActionListener(new FontAction("Courier New"));
        fontMenu.add(courierNewItem);

        textArea = new JTextArea();
        add(new JScrollPane(textArea), BorderLayout.CENTER);

        setVisible(true);
    }

    private class ColorAction implements ActionListener {
        private Color color;

        public ColorAction(Color color) {
            this.color = color;
        }

        public void actionPerformed(ActionEvent e) {
            textArea.setForeground(color);
        }
    }

    private class FontAction implements ActionListener {
        private String fontName;

        public FontAction(String fontName) {
            this.fontName = fontName;
        }

        public void actionPerformed(ActionEvent e) {
            textArea.setFont(new Font(fontName, Font.PLAIN, 12));
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new ex1();
            }
        });
    }
}