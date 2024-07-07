//The packages for performing a GUI operation are imported.
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class TechnoHacks_EduTech_Task_1
{
    public static void main(String args[])
    {
        JFrame frame = new JFrame("My Calculator.");//The frame is created along with a title.

        JPanel panel1 = new JPanel();//First Panel is created.
        JLabel label1 = new JLabel("Enter thr first number: ");//Inside the panel a label is created where we have to enter the first number.
        JTextField textfield1 = new JTextField(10);//A textfield for entering the first number is created.
        JButton button1 = new JButton("Add");//A button for "Add" option is created.
        JButton button2 = new JButton("Substract");//A button for "Substract" option is created.
        JButton button3 = new JButton("Multiply");//A button for "Multiply" option is created.
        JButton button4 = new JButton("Divide");//A button for "Dvivde" option is created.
        //Now all the labels, textfields, and button are added to their respective panel.
        panel1.add(label1);
        panel1.add(textfield1);
        panel1.add(button1);
        panel1.add(button2);
        panel1.add(button3);
        panel1.add(button4);

        JPanel panel2 = new JPanel();//Second Panel is created.
        JLabel label2 = new JLabel("Enter the second number: ");//Inside the seccond panel another label is created where we have to enter the second number.
        JTextField textfield2 = new JTextField(10);//A textfield for entering the second number is created.
        //Now all the labels and textfields are added to their respective panel.
        panel2.add(label2);
        panel2.add(textfield2);

        JPanel panel3 = new JPanel();//Third panel is created.
        JLabel label3 = new JLabel("Result: ");//Inside the third panel, a third label is created where we have to display the result after performing operations on 2 numbers. 
        JTextField textfield3 = new JTextField(10);//A textfield for performing the result is created.
        //Now all the labels and textfields are added to their respective panel.
        panel3.add(label3);
        panel3.add(textfield3);

        button1.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                int n1 = Integer.parseInt(textfield1.getText());
                int n2 = Integer.parseInt(textfield2.getText());

                textfield3.setText(String.valueOf(n1 + n2));
            }
        });//Here through the ActionListener process, we perform the addition of two numbers and store the result in the third textfield.

        button2.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                int n1 = Integer.parseInt(textfield1.getText());
                int n2 = Integer.parseInt(textfield2.getText());

                textfield3.setText(String.valueOf(n1 - n2));
            }
        });//Here through the ActionListener process, we perform the substratcion of two numbers and store the result in the third textfield.

        button3.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                int n1 = Integer.parseInt(textfield1.getText());
                int n2 = Integer.parseInt(textfield2.getText());

                textfield3.setText(String.valueOf(n1 * n2));
            }
        });//Here through the ActionListener process, we perform the multiplication of two numbers and store the result in the third textfield.

        button4.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                int n1 = Integer.parseInt(textfield1.getText());
                int n2 = Integer.parseInt(textfield2.getText());

                textfield3.setText(String.valueOf((float)n1 / n2));
            }
        });//Here through the ActionListener process, we perform the division of two numbers and store the result in the third textfield.

        //Now we will place the panels under the frame in their respective positions through a proper Layout.
        frame.add(panel1, BorderLayout.NORTH);
        frame.add(panel2, BorderLayout.CENTER);
        frame.add(panel3, BorderLayout.SOUTH);

        //At the end, we will set the size of the frame and add the close(X) button in the screen.
        frame.setSize(800,200);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}