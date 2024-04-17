import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Vwhiculo {
    private JTextField textField1;
    private JComboBox comboBox1;
    private JTextField textField2;
    private JButton AGREGARButton;
    private JButton MATRICULARButton;
    private JPanel Ventana;
    private JTextPane textPane1;
    private colaMatricula ojbMtrocula = new colaMatricula();

    public Vwhiculo() {

        AGREGARButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Vwhiculo");
        frame.setContentPane(new Vwhiculo().Ventana);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
