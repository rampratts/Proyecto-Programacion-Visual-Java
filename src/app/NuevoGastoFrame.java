package app;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class NuevoGastoFrame extends JFrame {
    private JLabel nuevoImporteLabel;

    public NuevoGastoFrame() {
        setTitle("Agregar nuevo importe");
        setSize(300, 400);
        setResizable(false);

        JPanel panel = new JPanel();

        nuevoImporteLabel = new JLabel("Agregar nuevo importe");
        panel.add(nuevoImporteLabel);

        add(panel);
    }
}