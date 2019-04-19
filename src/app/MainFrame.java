package app;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MainFrame extends JFrame {
    private JLabel balanceLabel;

    public MainFrame() {
        setTitle("Seguidor de gastos");
        setResizable(false);
        setSize(500, 500);

        JPanel panel = new JPanel();

        balanceLabel = new JLabel("Balance: " + Gasto.balance);
        panel.add(balanceLabel);

        add(panel);
    }
}
