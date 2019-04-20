package app;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

public class MainFrame extends JFrame {
    private static final long serialVersionUID = 1L;
    public static JLabel balanceLabel;
    private JButton nuevoGastoButton;
    private static JPanel panel;
    private static ArrayList<Gasto> gastos = new ArrayList<Gasto>();
    public static NuevoGastoFrame frame;
    public static JTable dataTable;
    public static DefaultTableModel tableModel;

    public MainFrame() {
        setTitle("Seguidor de gastos");
        setResizable(false);
        setSize(400, 500);

        panel = new JPanel();

        balanceLabel = new JLabel("Balance: " + Gasto.balance);
        panel.add(balanceLabel);

        nuevoGastoButton = new JButton("Añadir nuevo importe");
        nuevoGastoButton.addActionListener(new AbrirGastoFrame());
        panel.add(nuevoGastoButton);

        crearTabla();

        add(panel);
    }

    public static void agregarGasto(Gasto nuevoGasto) {
        gastos.add(nuevoGasto);
    }

    public static ArrayList<Gasto> getGastos() {
        return gastos;
    }

    public static void crearTabla() {
        String columnas[] = { "Nombre", "Valor", "Fecha" };

        tableModel = new DefaultTableModel(columnas, 0);
        dataTable = new JTable(tableModel);

        TableColumnModel columnModel = dataTable.getColumnModel();
        columnModel.getColumn(0).setPreferredWidth(130);
        columnModel.getColumn(1).setPreferredWidth(130);
        columnModel.getColumn(2).setPreferredWidth(130);

        panel.add(dataTable.getTableHeader());
        panel.add(dataTable);
    }

    public static void actualizarTabla(Gasto nuevoGasto) {
        Object[] data = { nuevoGasto.getNombre(), nuevoGasto.getValor(), nuevoGasto.getFechaDeCreacion() };
        tableModel.addRow(data);

        tableModel.fireTableDataChanged();
    }

    class AbrirGastoFrame implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            frame = new NuevoGastoFrame();
            frame.setVisible(true);
            frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        }
    }
}
