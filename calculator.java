import javax.swing.*;
import java.awt.event.*;
public class calculator {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Simple Calculator");
        frame.setSize(400, 300);
        frame.setLayout(null);

    JLabel label1 = new JLabel("Number 1: ");
    label1.setBounds(30,45,60,25);
    frame.add(label1); 

    JLabel label2 = new JLabel("Number 2:");
        label2.setBounds(30, 90, 100, 30);
        frame.add(label2);

        JLabel resultLabel = new JLabel("Result:");
        resultLabel.setBounds(30, 200, 200, 30);
        frame.add(resultLabel);

   
         JTextField text1 = new JTextField();
        text1.setBounds(130, 45, 150, 30);
        frame.add(text1);

        JTextField text2 = new JTextField();
        text2.setBounds(130, 90, 150, 30);
        frame.add(text2);


    JButton addBtn = new JButton("+");
        addBtn.setBounds(30, 150, 50, 30);
        frame.add(addBtn);

        JButton subBtn = new JButton("-");
        subBtn.setBounds(90, 150, 50, 30);
        frame.add(subBtn);

        JButton mulBtn = new JButton("*");
        mulBtn.setBounds(150, 150, 50, 30);
        frame.add(mulBtn);

        JButton divBtn = new JButton("/");
        divBtn.setBounds(210, 150, 50, 30);
        frame.add(divBtn);

         addBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double a = Double.parseDouble(text1.getText());
                double b = Double.parseDouble(text2.getText());
                double result = a + b;
                resultLabel.setText("Result: " + result);
            }
        });

        subBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double a = Double.parseDouble(text1.getText());
                double b = Double.parseDouble(text2.getText());
                double result = a - b;
                resultLabel.setText("Result: " + result);
            }
        });

        mulBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double a = Double.parseDouble(text1.getText());
                double b = Double.parseDouble(text2.getText());
                double result = a * b;
                resultLabel.setText("Result: " + result);
            }
        });

        divBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double a = Double.parseDouble(text1.getText());
                double b = Double.parseDouble(text2.getText());
                if (b != 0) {
                    double result = a / b;
                    resultLabel.setText("Result: " + result);
                } else {
                    resultLabel.setText("Error: Cannot divide by 0");
                }
            }
        });

        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}