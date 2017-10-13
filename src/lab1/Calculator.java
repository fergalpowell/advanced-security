import javax.swing.*;
import java.awt.event.*;
import java.text.NumberFormat;
import javax.swing.JFormattedTextField;
import java.awt.Color;
public class Calculator implements  ActionListener
{
    JFrame f;
    NumberFormat integerNumberInstance = NumberFormat.getIntegerInstance();
    JFormattedTextField t;
    JButton[] calButtons = new JButton[18];

    static double a=0, b=0, result=0;
    static int operator = 0;
    static int bx = 175, by = 100, bWidth = 50, bHeight = 40;

    Calculator(){
        f = new JFrame("Calculator");

        t = new JFormattedTextField(integerNumberInstance); // creating a text field that only accepts numbers
        t.setBounds(30,40,280,30);

        // setting the text, bounds and color of each button
        for (int i = 0; i < 10; i++) {
            calButtons[i] = new JButton(Integer.toString(i));
        }
        calButtons[10]=new JButton("=");
        calButtons[11]=new JButton("←");
        calButtons[12]=new JButton("C");
        calButtons[13]=new JButton("+");
        calButtons[14]=new JButton("-");
        calButtons[15]=new JButton("X");
        calButtons[16]=new JButton("÷");
        calButtons[17]=new JButton(".");
        Color myGray = new Color(209,209,209);
        for (int i = 9; i > 0; i--) {
            calButtons[i].setBounds(bx, by, bWidth, bHeight); // 1-9
            calButtons[i].setBackground(myGray);
            bx -= 65;
            if(bx <= 175 - (65 * 3)){
                bx = 175;
                by +=60;
            }
        }
        calButtons[0].setBounds(45, by, bWidth * 2 + 15, bHeight); // 0
        calButtons[0].setBackground(myGray);
        calButtons[17].setBounds(175, by, bWidth, bHeight); // .
        calButtons[17].setBackground(myGray);

        calButtons[10].setBounds(175,340,115, bHeight); // =
        calButtons[11].setBounds(110,340,50, bHeight); // del
        calButtons[12].setBounds(45,340,50, bHeight); // clr
        calButtons[13].setBounds(240,100,50, bHeight); // +
        calButtons[14].setBounds(240,160,50, bHeight); // -
        calButtons[15].setBounds(240,220,50, bHeight); // *
        calButtons[16].setBounds(240,280,50, bHeight); // /

        Color myGreen = new Color(155, 252, 164);
        calButtons[10].setBackground(myGreen);

        Color myYellow = new Color(255, 252, 135);
        calButtons[11].setBackground(myYellow);

        Color myRed = new Color(249,74,74);
        calButtons[12].setBackground(myRed);

        Color myBlue = new Color(178, 219, 255);
        calButtons[13].setBackground(myBlue);
        calButtons[14].setBackground(myBlue);
        calButtons[15].setBackground(myBlue);
        calButtons[16].setBackground(myBlue);

        // adding the textfield and buttons to the frame
        f.add(t);
        for (int i = 0; i < 18; i++) {
            f.add(calButtons[i]);
            calButtons[i].addActionListener(this);
        }

        f.setLayout(null);
        f.setVisible(true);
        f.setSize(350,450);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setResizable(false);
    }

    public void actionPerformed(ActionEvent e)
    {
        // checking for number input
        for(int i=0; i < 10;i++){
            if(e.getSource() == calButtons[i]){
                t.setText(t.getText().concat(Integer.toString(i)));
            }
        }

        // checking for period input, only one period permitted per number
        if (e.getSource() == calButtons[17] && t.getText().indexOf(".") == -1) {
            t.setText(t.getText().concat("."));
        }

        if(!t.getText().isEmpty()) {

            // checking for addition button pressed and setting correct operator
            if (e.getSource() == calButtons[13]) {
                a = Double.parseDouble(t.getText());
                operator = 1;
                t.setText("");
            }

            // checking for subtraction button pressed and setting correct operator
            if (e.getSource() == calButtons[14]) {
                a = Double.parseDouble(t.getText());
                operator = 2;
                t.setText("");
            }

            // checking for multiplication button pressed and setting correct operator
            if (e.getSource() == calButtons[15]) {
                a = Double.parseDouble(t.getText());
                operator = 3;
                t.setText("");
            }

            // checking for division button pressed and setting correct operator
            if (e.getSource() == calButtons[16]) {
                a = Double.parseDouble(t.getText());
                operator = 4;
                t.setText("");
            }

            // checking for equals button pressed and performing operation and displaying the result
            if (e.getSource() == calButtons[10]) {
                b = Double.parseDouble(t.getText());

                switch (operator) {
                    case 1:
                        result = a + b;
                        break;

                    case 2:
                        result = a - b;
                        break;

                    case 3:
                        result = a * b;
                        break;

                    case 4:
                        result = a / b;
                        break;

                    default:
                        result = 0;
                }

                t.setText("" + result);
            }
        }

        // checking for delete button pressed, removing the last character of the input string
        if (e.getSource() == calButtons[11]) {
            String s = t.getText();
            t.setText("");
            for (int i = 0; i < s.length() - 1; i++)
                t.setText(t.getText() + s.charAt(i));
        }

        // checking for clear button pressed, resetting the text field and all variables to zero
        if(e.getSource()==calButtons[12]) {
            t.setText("");
            a = 0;
            b = 0;
            result = 0;
            operator = 0;
        }
    }

    public static void main(String...s)
    {
        new Calculator();
    }
}
