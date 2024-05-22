import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class temperatura extends JFrame {
    private JPanel panel1;
    private JTextField textField1;
    private JButton konwertujButton;
    private JPanel Dane;
    private JPanel footer;
    private JPanel banner;
    private JButton wyjscieButton;
    private JButton wyczyscButton;
    private JLabel wynik;


    private int width = 500, height = 500;
    private double valueA, wyn;

    public static void main(String[] args) {
        temperatura temp = new temperatura();
        temp.setVisible(true);
    }

    public temperatura() {
        super("Kalkulator");
        this.setContentPane(this.panel1);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(width, height);

        konwertujButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                valueA = Double.parseDouble(textField1.getText());
                wyn = (valueA * 1.8) + 32;
                wynik.setText(String.valueOf(valueA)+" °C " + " = " + String.valueOf(wyn)+ " °F");
            }
        });
        wyjscieButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
        wyczyscButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                wynik.setText("");
            }
        });
    }





}