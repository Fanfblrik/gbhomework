package Lesson7;

import javax.swing.*;
import java.awt.*;

public class GAWin extends JFrame {

    private int winWidth = 1024;
    private int winHeight = 650;
    private int winPositionX = 100;
    private int winPositionY = 50;

    private GAPan mainPanel;

    GAWin() {
        setupWin();

        mainPanel = new GAPan();

        add(mainPanel, BorderLayout.CENTER);
        setVisible(true);
    }

    private void setupWin() {
        setLocation(winPositionX, winPositionY);
        setSize(winWidth, winHeight);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("GUIApp");
        setResizable(false);
    }

}
