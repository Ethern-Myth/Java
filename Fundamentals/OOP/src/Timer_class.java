import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import javax.swing.Timer;

public class Timer_class {
    public static void main(String[] args) {
        ActionListener listener = new TimePrinter();
        // construct a timer that calls the listener
        // once every 10 seconds
        Timer t = new Timer(10000, listener);
        t.start();

        JOptionPane.showMessageDialog(null, "Quit program?");
        System.exit(0);
    }

    public static class TimePrinter implements ActionListener {
        public void actionPerformed(ActionEvent arg0) {
            System.out.println("At the tone, the time is " + new Date());
            Toolkit.getDefaultToolkit().beep();
        }

    }
}
