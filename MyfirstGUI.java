import javax.swing.*;
import java.awt.event.*;
public class MyfirstGUI {

        
     public static void main(String[] args) {
        JFrame frame = new JFrame("sign-in");
        frame.setSize(450, 300);
        frame.setLayout(null);

        JLabel label = new JLabel("Enter your email or number :");
        label.setBounds(70, 50, 200, 30);
        frame.add(label);

        JTextField textField = new JTextField();
        textField.setBounds(250, 50, 100, 30);
        frame.add(textField);

         JLabel labe2 = new JLabel("set password:");
        labe2.setBounds(70, 100, 120, 30);
        frame.add(labe2);

        JTextField textField1 = new JTextField();
        textField1.setBounds(250, 100, 100, 30);
        frame.add(textField1);

        JButton button = new JButton("sign-in");
        button.setBounds(170,170,100,25);
        frame.add(button);

         JLabel output = new JLabel(""); // empty label
        output.setBounds(70, 210, 400, 30);
        frame.add(output);

        button.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e){
                String name= textField.getText();
                output.setText("Hello "+name+" your account is created successfully");
            }
        });


        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
}
    
}
