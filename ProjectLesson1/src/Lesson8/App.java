package Lesson8;

import javax.swing.*;
import java.awt.*;

public class App extends JFrame {
    static int counter = 0;
    public App() {
        setTitle("Мое первое оконное приложение");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(300,300,300,300);

        setResizable(false);

        add(new Panel(), BorderLayout.CENTER);

        setVisible(true);
    }

}
