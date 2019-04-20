package app;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MainFrame extends JFrame {
    private JLabel balanceLabel;
    private JButton nuevoGastoButton;
    private static ArrayList<Gasto> gastos = new ArrayList<Gasto>();

    public MainFrame() {
        setTitle("Seguidor de gastos");
        setResizable(false);
        setSize(500, 500);

        JPanel panel = new JPanel();

        balanceLabel = new JLabel("Balance: " + Gasto.balance);
        panel.add(balanceLabel);

        nuevoGastoButton = new JButton("Añadir nuevo importe");
        nuevoGastoButton.addActionListener(new AbrirGastoFrame());
        panel.add(nuevoGastoButton);

        add(panel);
    }

    public static void agregarGasto(Gasto nuevoGasto) {
        gastos.add(nuevoGasto);
    }

    public static ArrayList<Gasto> getGastos() {
        return gastos;
    }

    class AbrirGastoFrame implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            NuevoGastoFrame frame = new NuevoGastoFrame();
            frame.setVisible(true);
            frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        }
    }
}
