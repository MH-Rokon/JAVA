import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class BillGeneration extends JFrame implements ActionListener {
    JLabel l;
    JCheckBox cb1, cb2, cb3;
    JButton b;

    BillGeneration() {
        setTitle("Bill Generation");

        // Set different background color
        getContentPane().setBackground(new Color(240, 240, 240)); // Light gray
        // Alternatively, you can use different colors like:
        // getContentPane().setBackground(Color.lightGray);
        // getContentPane().setBackground(Color.white);

        l = new JLabel("Food Ordering System");
        l.setFont(new Font("Arial", Font.BOLD, 20)); // Set font and size
        l.setForeground(Color.blue); // Set text color
        l.setBounds(50, 30, 300, 30);
        add(l);

        cb1 = new JCheckBox("Pizza @ 100");
        cb1.setBounds(50, 80, 150, 20);
        add(cb1);

        cb2 = new JCheckBox("Burger @ 30");
        cb2.setBounds(50, 120, 150, 20);
        add(cb2);

        cb3 = new JCheckBox("Tea @ 10");
        cb3.setBounds(50, 160, 150, 20);
        add(cb3);

        b = new JButton("Order");
        b.setBounds(120, 200, 120, 30);
        b.addActionListener(this);
        add(b);

        setSize(300, 300);
        setLocationRelativeTo(null); // Set frame to appear in the middle of the screen
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        float amount = 0;
        String msg = "";
        if (cb1.isSelected()) {
            amount += 100;
            msg = "Pizza: 100\n";
        }
        if (cb2.isSelected()) {
            amount += 30;
            msg += "Burger: 30\n";
        }
        if (cb3.isSelected()) {
            amount += 10;
            msg += "Tea: 10\n";
        }
        float vat = (amount / 100) * 15; // Calculate 15% VAT
        float tax = (amount / 100) * 2; // Calculate 2% tax

        amount += vat + tax; // Add VAT and tax to the total amount

        msg += "-----------------\n";
        msg += "Subtotal: " + amount + "\n";
        msg += "VAT (15%): " + vat + "\n";
        msg += "Tax (2%): " + tax + "\n";
        JOptionPane.showMessageDialog(this, msg + "Total: " + amount);
    }

    public static void main(String[] args) {
        new BillGeneration();
    }
}
