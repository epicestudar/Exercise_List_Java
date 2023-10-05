package Exercises;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.logging.Handler;
import java.awt.*;

public class Exercise2 extends JFrame {
    // atributes
    private JTextField mainTextBox;
    private JTextField typedLetter;
    private JTextField textShown;
    private JLabel letter;
    private JLabel text;

    public Exercise2() {
        super("Exercise 2");
        this.setDefaultCloseOperation(2);
        this.setBounds(100, 100, 300, 150);

        // mainPanel - gridLayout(3 rows and 3 cols)
        JPanel mainPanel = new JPanel(new GridLayout(5, 1));
        this.add(mainPanel);

        // create components
        mainPanel.add(new JLabel("Type here: "));
        mainTextBox = new JTextField();
        mainPanel.add(mainTextBox);

        mainPanel.add(new JLabel("Typed Letter: "));
        letter = new JLabel();
        typedLetter = new JTextField();
        mainPanel.add(typedLetter);
        mainPanel.add(letter);

        mainPanel.add(new JLabel("Text Shown: "));
        text = new JLabel();
        textShown = new JTextField();
        mainPanel.add(textShown);
        mainPanel.add(text);

        // set frame
        this.setVisible(true);

        // event handling
        Handler event = new Handler();
        mainTextBox.addKeyListener(event);
    }

    public class Handler implements KeyListener {
         @Override
        public void keyTyped(KeyEvent e) {
            char keyPressed = e.getKeyChar(); // I got the value of the key pressed
            letter.setText("" + keyPressed);
            text.setText(mainTextBox.getText());
        }
        @Override
        public void keyPressed(KeyEvent e) {}

        @Override
        public void keyReleased(KeyEvent e) {}
    }
}
