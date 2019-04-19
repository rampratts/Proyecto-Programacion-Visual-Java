package app;

import java.time.LocalDateTime;

import javax.swing.JFrame;

public class App {
    public static void main(String[] args) throws Exception {
        MainFrame frame = new MainFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}