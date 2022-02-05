import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MiniCalculator extends JFrame {
    public static void main(String[] args) {
        MiniCalculator c = new MiniCalculator();
    }

    MiniCalculator() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("");
        setTitle("Calculator");
        setSize(320, 300);
        setLayout(null);

        JTextField a = new JTextField();
        a.setBounds(50, 10, 217, 75);
        a.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a.setEditable(false);
            }
        });
        add(a);

        JButton plus = new JButton("+");
        plus.setBounds(50, 100, 50, 50);
        add(plus);

        JButton minus = new JButton("-");
        minus.setBounds(105, 100, 50, 50);
        add(minus);

        JButton inmultire = new JButton("*");
        inmultire.setBounds(160, 100, 50, 50);
        add(inmultire);

        JButton impartire = new JButton("/");
        impartire.setBounds(215, 100, 50, 50);
        add(impartire);

        // textfield pentru a introduce primul numar
        JTextField operand1 = new JTextField();
        operand1.setBounds(50, 155, 50, 50);
        add(operand1);

        //textfield pentru a introduce al doilea numar
        JTextField operand2 = new JTextField();
        operand2.setBounds(105, 155, 50, 50);
        add(operand2);

        JButton egal = new JButton(" = ");
        egal.setBounds(160, 155, 105, 50);
        add(egal);

        plus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a.setText(operand1.getText() + " + ");
            }
        });
        minus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a.setText(operand1.getText() + " - ");
            }
        });
        inmultire.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a.setText(operand1.getText() + " * ");
            }
        });
        impartire.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a.setText(operand1.getText() + " / ");
            }
        });
        egal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String inf = a.getText();
                for (int i = 0; i < inf.length(); i++) {
                    switch (inf.charAt(i)) {
                        case '+':
                            a.setText(operand1.getText() + " + " + operand2.getText() + " = " + (Integer.parseInt(operand1.getText()) + Integer.parseInt(operand2.getText())));
                            break;
                        case '-':
                            a.setText(operand1.getText() + " - " + operand2.getText() + " = " + (Integer.parseInt(operand1.getText()) - Integer.parseInt(operand2.getText())));
                            break;
                        case '*':
                            a.setText(operand1.getText() + " * " + operand2.getText() + " = " + Integer.parseInt(operand1.getText()) * Integer.parseInt(operand2.getText()));
                            break;
                        case '/':
                            a.setText(operand1.getText() + " / " + operand2.getText() + " = " + Integer.parseInt(operand1.getText()) / Integer.parseInt(operand2.getText()));
                            break;
                    }
                }
            }
        });

        setVisible(true);
    }
}
