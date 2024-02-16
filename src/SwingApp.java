import javax.swing.*;
import java.io.IOException;
import java.net.ServerSocket;
import java.util.concurrent.Executors;

public class SwingApp {
    public static void main(String[] args) throws IOException {
        var frame = new JFrame("Test app");
        var mainPanel = new JPanel();
        var button = new JButton();
        button.addActionListener(e -> {
            Executors.defaultThreadFactory().newThread(() -> {
                System.out.println(e.getActionCommand());
                System.out.println(e.getActionCommand());
                System.out.println(e.getActionCommand());
                System.out.println(e.getActionCommand());
                System.out.println(e.getActionCommand());
            }).start();
        });
        mainPanel.add(button);
        frame.setContentPane(mainPanel);
        frame.pack();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        var socket = new ServerSocket(6969);
    }
}
