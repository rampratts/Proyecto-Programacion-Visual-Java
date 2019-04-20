package app;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDateTime;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class NuevoGastoFrame extends JFrame {
    private static final long serialVersionUID = 1L;
    private JLabel nuevoImporteLabel, nombreLabel, valorLabel, esGastoLabel;
    private JTextField nombreField, valorField;
    private JCheckBox esGasto;
    private JButton agregarButton, cancelarButton;

    public NuevoGastoFrame() {
        setTitle("Agregar nuevo importe");
        setSize(300, 400);
        setResizable(false);

        JPanel panel = new JPanel();

        nuevoImporteLabel = new JLabel("Agregar nuevo importe");
        panel.add(nuevoImporteLabel);

        nombreLabel = new JLabel("Ingrese el nombre del importe");
        panel.add(nombreLabel);

        nombreField = new JTextField(5);
        panel.add(nombreField);

        valorLabel = new JLabel("Ingrese el valor del importe");
        panel.add(valorLabel);

        valorField = new JTextField(5);
        panel.add(valorField);

        esGastoLabel = new JLabel("Indique si el importe es un gasto");
        panel.add(esGastoLabel);

        esGasto = new JCheckBox();
        esGasto.setSelected(true);
        panel.add(esGasto);

        agregarButton = new JButton("Agregar importe");
        agregarButton.addActionListener(new AgregarGastoAction());
        panel.add(agregarButton);

        cancelarButton = new JButton("Cancelar");
        cancelarButton.addActionListener(new CancelarAction());
        panel.add(cancelarButton);

        add(panel);
    }

    public void agregarGasto() {
        try {
            String nombre = nombreField.getText();
            Double valor = Double.parseDouble(valorField.getText());

            Gasto nuevoGasto = new Gasto(nombre, valor, this.esGasto.isSelected(), LocalDateTime.now());
            MainFrame.agregarGasto(nuevoGasto);
            MainFrame.actualizarTabla(nuevoGasto);
            MainFrame.balanceLabel.setText("Balance: " + Gasto.balance);
            MainFrame.frame.dispose();
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Error al agregar gasto");
        }
    }

    class AgregarGastoAction implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            agregarGasto();
        }
    }

    class CancelarAction implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            MainFrame.frame.dispose();
        }
    }
}