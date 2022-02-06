import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.Border;

public class Cal extends JFrame implements ActionListener {
    JPanel panel1, panel2, panel3;
    JTextField txt;
    JButton btnClr, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0;
    JButton btnDot, btnAdd, btnSub, btnMulti, btnDiv, btnEqual;
    double a, b;
    int flag = 0;

    Cal() {
        setSize(416, 488);
        setDefaultCloseOperation(3);
        setLayout(null);
        setTitle("Calculator");
        setLocationRelativeTo(null);

        Font font = new Font("Arial", Font.BOLD, 30);
        Border blackline = BorderFactory.createLineBorder(Color.black, 5, true);
        Border grayline = BorderFactory.createLineBorder(Color.darkGray, 4, true);
        Border lightgray = BorderFactory.createLineBorder(Color.LIGHT_GRAY, 4, true);

        panel1 = new JPanel();
        panel1.setBounds(0, 0, 400, 80);
        panel1.setBackground(Color.black);
        panel1.setLayout(null);
        add(panel1);

        panel2 = new JPanel();
        panel2.setLayout(new GridLayout(3, 3, 4, 4));
        panel2.setBorder(blackline);
        panel2.setBounds(0, 80, 300, 370);
        panel2.setBackground(Color.GRAY);
        add(panel2);

        panel3 = new JPanel();
        panel3.setBounds(300, 80, 100, 370);
        panel3.setBorder(lightgray);
        panel3.setBackground(Color.LIGHT_GRAY);
        panel3.setLayout(new GridLayout(5, 1, 3, 5));
        add(panel3);

        txt = new JTextField();
        //txt.setEditable(false);
        txt.setBounds(30, 10, 340, 60);
        txt.setBackground(Color.BLUE);
        txt.setCaretColor(Color.white);
        txt.setForeground(Color.white);
        txt.setFont(font);
        panel1.add(txt);

        btnClr = new JButton("C");
        btnClr.setBorder(grayline);
        btnClr.setBackground(Color.red);
        btnClr.setForeground(Color.white);
        btnClr.addActionListener(this);
        btnClr.setFocusable(false);
        btnClr.setFont(font);
        panel2.add(btnClr);

        btn1 = new JButton("1");
        btn1.setBackground(Color.BLACK);
        btn1.setForeground(Color.white);
        btn1.setFont(font);
        btn1.setBorder(grayline);
        btn1.addActionListener(this);
        btn1.setFocusable(false);
        panel2.add(btn1);

        btn2 = new JButton("2");
        btn2.setBackground(Color.BLACK);
        btn2.setForeground(Color.white);
        btn2.setFont(font);
        btn2.setBorder(grayline);
        btn2.addActionListener(this);
        btn2.setFocusable(false);
        panel2.add(btn2);

        btn3 = new JButton("3");
        btn3.setBackground(Color.BLACK);
        btn3.setForeground(Color.white);
        btn3.setFont(font);
        btn3.setBorder(grayline);
        btn3.addActionListener(this);
        btn3.setFocusable(false);
        panel2.add(btn3);

        btn4 = new JButton("4");
        btn4.setBackground(Color.BLACK);
        btn4.setForeground(Color.white);
        btn4.addActionListener(this);
        btn4.setFocusable(false);
        btn4.setFont(font);
        btn4.setBorder(grayline);
        panel2.add(btn4);

        btn5 = new JButton("5");
        btn5.setBackground(Color.BLACK);
        btn5.setForeground(Color.white);
        btn5.addActionListener(this);
        btn5.setFocusable(false);
        btn5.setFont(font);
        btn5.setBorder(grayline);
        panel2.add(btn5);

        btn6 = new JButton("6");
        btn6.setBackground(Color.BLACK);
        btn6.setForeground(Color.white);
        btn6.addActionListener(this);
        btn6.setFocusable(false);
        btn6.setFont(font);
        btn6.setBorder(grayline);
        panel2.add(btn6);

        btn7 = new JButton("7");
        btn7.setBackground(Color.BLACK);
        btn7.setForeground(Color.white);
        btn7.addActionListener(this);
        btn7.setFocusable(false);
        btn7.setFont(font);
        btn7.setBorder(grayline);
        panel2.add(btn7);

        btn8 = new JButton("8");
        btn8.setBackground(Color.BLACK);
        btn8.setForeground(Color.white);
        btn8.addActionListener(this);
        btn8.setFocusable(false);
        btn8.setFont(font);
        btn8.setBorder(grayline);
        panel2.add(btn8);

        btn9 = new JButton("9");
        btn9.setBackground(Color.BLACK);
        btn9.setForeground(Color.white);
        btn9.addActionListener(this);
        btn9.setFocusable(false);
        btn9.setFont(font);
        btn9.setBorder(grayline);
        panel2.add(btn9);

        btn0 = new JButton("0");
        btn0.setBackground(Color.BLACK);
        btn0.setForeground(Color.white);
        btn0.addActionListener(this);
        btn0.setFocusable(false);
        btn0.setFont(font);
        btn0.setBorder(grayline);
        panel2.add(btn0);

        btnDot = new JButton(".");
        btnDot.setBackground(Color.BLACK);
        btnDot.setForeground(Color.white);
        btnDot.addActionListener(this);
        btnDot.setFocusable(false);
        btnDot.setFont(font);
        btnDot.setBorder(grayline);
        panel2.add(btnDot);

        btnAdd = new JButton("+");
        btnAdd.setBackground(Color.YELLOW);
        btnAdd.addActionListener(this);
        btnAdd.setFocusable(false);
        btnAdd.setFont(font);
        btnAdd.setBorder(grayline);
        panel3.add(btnAdd);

        btnSub = new JButton("-");
        btnSub.setBackground(Color.YELLOW);
        btnSub.addActionListener(this);
        btnSub.setFocusable(false);
        btnSub.setFont(font);
        btnSub.setBorder(grayline);
        panel3.add(btnSub);

        btnMulti = new JButton("*");
        btnMulti.setBackground(Color.YELLOW);
        btnMulti.addActionListener(this);
        btnMulti.setFocusable(false);
        btnMulti.setFont(font);
        btnMulti.setBorder(grayline);
        panel3.add(btnMulti);

        btnDiv = new JButton("/");
        btnDiv.setBackground(Color.YELLOW);
        btnDiv.addActionListener(this);
        btnDiv.setFocusable(false);
        btnDiv.setFont(font);
        btnDiv.setBorder(grayline);
        panel3.add(btnDiv);

        btnEqual = new JButton("=");
        btnEqual.setBackground(Color.white);
        btnEqual.addActionListener(this);
        btnEqual.setFocusable(false);
        btnEqual.setFont(font);
        btnEqual.setBorder(grayline);
        panel3.add(btnEqual);

        setVisible(true);


    }

    public static void main(String[] args) {
        Cal calculator = new Cal();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btn1) {
            txt.setText(txt.getText() + "1");
        }
        if (e.getSource() == btn2) {
            txt.setText(txt.getText() + "2");
        }
        if (e.getSource() == btn3) {
            txt.setText(txt.getText() + "3");
        }
        if (e.getSource() == btn4) {
            txt.setText(txt.getText() + "4");
        }
        if (e.getSource() == btn5) {
            txt.setText(txt.getText() + "5");
        }
        if (e.getSource() == btn6) {
            txt.setText(txt.getText() + "6");
        }
        if (e.getSource() == btn7) {
            txt.setText(txt.getText() + "7");
        }
        if (e.getSource() == btn8) {
            txt.setText(txt.getText() + "8");
        }
        if (e.getSource() == btn9) {
            txt.setText(txt.getText() + "9");
        }
        if (e.getSource() == btn0) {
            txt.setText(txt.getText() + "0");
        }
        if (e.getSource() == btnDot) {
            txt.setText(txt.getText() + ".");
        }
        if (e.getSource() == btnAdd) {
            String s = txt.getText();
            a = Double.parseDouble(s);
            txt.setText("");
            flag = 1;
        }
        if (e.getSource() == btnSub) {
            String s = txt.getText();
            a = Double.parseDouble(s);
            txt.setText("");
            flag = 2;
        }
        if (e.getSource() == btnMulti) {
            String s = txt.getText();
            a = Double.parseDouble(s);
            txt.setText("");
            flag = 3;
        }
        if (e.getSource() == btnDiv) {
            String s = txt.getText();
            a = Double.parseDouble(s);
            txt.setText("");
            flag = 4;
        }
        if (e.getSource() == btnClr) {
            txt.setText("");
        }
        if (e.getSource() == btnEqual) {
            if (flag == 1) {
                String s2 = txt.getText();
                b = Double.parseDouble(s2);
                double result = a + b;
                txt.setText(Double.toString(result));
            }
            if (flag == 2) {
                String s2 = txt.getText();
                b = Double.parseDouble(s2);
                double result = a - b;
                txt.setText(Double.toString(result));
            }
            if (flag == 3) {
                String s2 = txt.getText();
                b = Double.parseDouble(s2);
                double result = a * b;
                txt.setText(Double.toString(result));
            }
            if (flag == 4) {
                String s2 = txt.getText();
                b = Double.parseDouble(s2);
                double result = a / b;
                txt.setText(Double.toString(result));
            }
        }
    }
}
