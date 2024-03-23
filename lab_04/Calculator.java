import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Calculator extends JFrame implements ActionListener {
    JButton b10, b11, b12, b13, b14, b15, b16, b17;
    JButton b[] = new JButton[10];
    int i;
    double r, n1, n2;
    JTextField res;
    char op;

    public Calculator() {
        super("Calculator");
        setLayout(new BorderLayout());
        JPanel p = new JPanel();
        p.setLayout(new GridLayout(5, 4));
        for (int i = 0; i <= 9; i++) {
            b[i] = new JButton(i + "");
            p.add(b[i]);
            b[i].addActionListener(this);
            b[i].setFont(new Font("Arial", Font.BOLD, 20));
            b[i].setBackground(new Color(240, 240, 240)); // Light gray background
        }
        b10 = new JButton("+");
        customizeButton(b10);
        p.add(b10);
        b11 = new JButton("-");
        customizeButton(b11);
        p.add(b11);
        b12 = new JButton("*");
        customizeButton(b12);
        p.add(b12);
        b13 = new JButton("/");
        customizeButton(b13);
        p.add(b13);
        b14 = new JButton("=");
        customizeButton(b14);
        p.add(b14);
        b15 = new JButton("C");
        customizeButton(b15);
        p.add(b15);
        b16 = new JButton("%");
        customizeButton(b16);
        p.add(b16);
        b17 = new JButton("!");
        customizeButton(b17);
        p.add(b17);
        add(p, BorderLayout.CENTER);

        JPanel displayPanel = new JPanel();
        res = new JTextField(10);
        res.setEditable(false);
        res.setFont(new Font("Arial", Font.BOLD, 30));
        res.setHorizontalAlignment(JTextField.RIGHT);
        res.setBorder(BorderFactory.createLineBorder(Color.BLACK)); // Black border
        displayPanel.add(res);
        displayPanel.setBackground(new Color(220, 220, 220)); // Light gray background
        add(displayPanel, BorderLayout.NORTH);

        setSize(300, 400);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent ae) {
        JButton pb = (JButton) ae.getSource();
        if (pb == b15) {
            n1 = n2 = r = 0;
            op = ' ';
            res.setText("");
        } else if (pb == b14) {
            n2 = Double.parseDouble(res.getText());
            eval();
            res.setText("" + r);
        } else if (pb == b17) {
            n1 = Double.parseDouble(res.getText());
            r = factorial((int) n1);
            res.setText("" + r);
        } else {
            boolean opf = false;
            if (pb == b10) {
                op = '+';
                opf = true;
            }
            if (pb == b11) {
                op = '-';
                opf = true;
            }
            if (pb == b12) {
                op = '*';
                opf = true;
            }
            if (pb == b13) {
                op = '/';
                opf = true;
            }
            if (pb == b16) {
                op = '%';
                opf = true;
            }
            if (!opf) {
                for (i = 0; i < 10; i++) {
                    if (pb == b[i]) {
                        String t = res.getText();
                        t += i;
                        res.setText(t);
                    }
                }
            } else {
                n1 = Double.parseDouble(res.getText());
                res.setText("");
            }
        }
    }

    void eval() {
        switch (op) {
            case '+':
                r = n1 + n2;
                break;
            case '-':
                r = n1 - n2;
                break;
            case '*':
                r = n1 * n2;
                break;
            case '/':
                if (n2 != 0)
                    r = n1 / n2;
                else
                    res.setText("Error: Division by zero");
                break;
            case '%':
                r = n1 % n2;
                break;
        }
    }

    double factorial(int n) {
        if (n == 0)
            return 1;
        else
            return n * factorial(n - 1);
    }

    // Customize button appearance
    private void customizeButton(JButton button) {
        button.addActionListener(this);
        button.setFont(new Font("Arial", Font.BOLD, 20));
        button.setBackground(new Color(200, 200, 200)); // Lighter gray background
    }

    public static void main(String arg[]) {
        new Calculator();
    }
}
