package Lesson8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Panel extends JPanel {
    Font font = new Font("Arrial", Font.BOLD, 20);
    public Panel() {

        setBounds(300,300,300,300);

        JButton myButton = new JButton("—генерировать номера");
        add(myButton, BorderLayout.CENTER);
        myButton.setFont(font);

        TextField textField = new TextField("+7 (999) 000 00 00");
        add(textField);
        textField.setFont(font);

        myButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText(String.valueOf(generateTelephoneNumber()));
                System.out.println(textField.getText());
            }
        });

        setVisible(true);
    }
    public String generateTelephoneNumber() {
        Random random = new Random();
        String telephoneNumber = "";
        telephoneNumber += "+7";
        telephoneNumber += "(999)";
        telephoneNumber += random.nextInt(10);
        telephoneNumber += random.nextInt(10);
        telephoneNumber += random.nextInt(10);
        telephoneNumber += random.nextInt(10);
        telephoneNumber += random.nextInt(10);
        telephoneNumber += random.nextInt(10);

        return telephoneNumber;

    }
}
