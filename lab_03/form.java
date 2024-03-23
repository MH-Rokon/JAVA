import javax.swing.*;
import java.awt.event.*;

public class form implements ActionListener {
    private static JLabel success, label1, label2, label3, label4, label5, label6, label7, label8, label9;
    private static JFrame frame;
    private static JPanel panel;
    private static JButton button;
    private static JTextField nameField, fatherNameField, motherNameField, departmentField, rollField, registrationField, emailField;
    private static JPasswordField passwordField, confirmPasswordField;
    private static JCheckBox confirmationCheckbox;

    public static void main(String[] args) {
        frame = new JFrame("Student Registration Form");
        panel = new JPanel();
        frame.setSize(400, 450);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        panel.setLayout(null);

        label1 = new JLabel("Name:");
        label1.setBounds(10, 10, 80, 25);
        panel.add(label1);
        nameField = new JTextField();
        nameField.setBounds(100, 10, 200, 25);
        panel.add(nameField);

        label2 = new JLabel("Father's Name:");
        label2.setBounds(10, 40, 80, 25);
        panel.add(label2);
        fatherNameField = new JTextField();
        fatherNameField.setBounds(100, 40, 200, 25);
        panel.add(fatherNameField);

        label3 = new JLabel("Mother's Name:");
        label3.setBounds(10, 70, 100, 25);
        panel.add(label3);
        motherNameField = new JTextField();
        motherNameField.setBounds(100, 70, 200, 25);
        panel.add(motherNameField);

        label4 = new JLabel("Department:");
        label4.setBounds(10, 100, 80, 25);
        panel.add(label4);
        departmentField = new JTextField();
        departmentField.setBounds(100, 100, 200, 25);
        panel.add(departmentField);

        label5 = new JLabel("Roll:");
        label5.setBounds(10, 130, 80, 25);
        panel.add(label5);
        rollField = new JTextField();
        rollField.setBounds(100, 130, 200, 25);
        panel.add(rollField);

        label6 = new JLabel("Registration Form:");
        label6.setBounds(10, 160, 120, 25);
        panel.add(label6);
        registrationField = new JTextField();
        registrationField.setBounds(140, 160, 160, 25);
        panel.add(registrationField);

        label7 = new JLabel("Email:");
        label7.setBounds(10, 190, 80, 25);
        panel.add(label7);
        emailField = new JTextField();
        emailField.setBounds(100, 190, 200, 25);
        panel.add(emailField);

        label8 = new JLabel("Password:");
        label8.setBounds(10, 220, 80, 25);
        panel.add(label8);
        passwordField = new JPasswordField();
        passwordField.setBounds(100, 220, 200, 25);
        panel.add(passwordField);

        label9 = new JLabel("Confirm Password:");
        label9.setBounds(10, 250, 120, 25);
        panel.add(label9);
        confirmPasswordField = new JPasswordField();
        confirmPasswordField.setBounds(140, 250, 160, 25);
        panel.add(confirmPasswordField);

        confirmationCheckbox = new JCheckBox("Confirm Information");
        confirmationCheckbox.setBounds(10, 280, 200, 25);
        panel.add(confirmationCheckbox);

        button = new JButton("Save");
        button.setBounds(150, 310, 80, 25);
        button.addActionListener(new form());
        panel.add(button);

        success = new JLabel("");
        success.setBounds(10, 340, 300, 25);
        panel.add(success);

        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (nameField.getText().isEmpty() || fatherNameField.getText().isEmpty() || motherNameField.getText().isEmpty() ||
                departmentField.getText().isEmpty() || rollField.getText().isEmpty() || registrationField.getText().isEmpty() ||
                emailField.getText().isEmpty() || passwordField.getPassword().length == 0 || confirmPasswordField.getPassword().length == 0) {
            success.setText("Please fill in all fields.");
        } else if (!confirmationCheckbox.isSelected()) {
            success.setText("Please confirm your information.");
        } else {
            // Save student registration information
            success.setText("Saved Successfully");
        }
    }
}
