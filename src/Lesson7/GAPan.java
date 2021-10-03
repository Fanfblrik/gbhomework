package Lesson7;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class GAPan extends JPanel {

    private JPanel appControlArea;
    private JButton randomColor;
    private JButton btnExit;

    private JTextArea appLog;
    private JScrollPane scrollLogPanel;

    Random rand = new Random();
    GAPan() {

        setLayout(new GridLayout(2, 1));

        setupAppControlArea();
        setupAppLog();

        constructMainPanel();

    }

    private void constructMainPanel() {
        add(appControlArea);
        add(scrollLogPanel);
    }

    private void setupAppControlArea() {
        appControlArea = new JPanel();
        appControlArea.setLayout(new GridLayout(3,1));
        btnExit = new JButton("Exit App");
        btnExit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(1);
            }
        });
        randomColor = new JButton("Random background");
        randomColor.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                float r = rand.nextFloat();
                float g = rand.nextFloat();
                float b = rand.nextFloat();
                Color color = new Color(r, g, b);
                randomColor.setBackground(color);
            }
        });
        appControlArea.add(new JLabel("= App Control ="));
        appControlArea.add(randomColor);
        appControlArea.add(btnExit);
    }

    private void setupAppLog() {
        appLog = new JTextArea();
        scrollLogPanel = new JScrollPane(appLog);
        appLog.setLineWrap(true);
        appLog.setEditable(false);
    }



}
