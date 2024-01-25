import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class form1 {
    private JTextField texto;
    private JButton xButton1;
    private JButton lnButton;
    private JButton eButton;
    private JButton igual;
    private JButton cosButton;
    private JButton senButton;
    private JButton button7;
    private JButton button8;
    private JButton tanButton;
    private JButton πButton;
    private JButton logButton;
    private JButton CEButton;
    private JButton a1Button;
    private JButton a2Button;
    private JButton a3Button;
    private JButton a4Button;
    private JButton button17;
    private JButton button18;
    private JButton a5Button;
    private JButton a6Button;
    private JButton a7Button;
    private JButton a8Button;
    private JButton xButton;
    private JButton a9Button;
    private JButton a0Button;
    private JButton button26;
    private JButton button27;
    JPanel calculadora;
    private JTextField funciones;
    private JTextField var;

    public form1() {
        a1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                texto.setText(texto.getText()+"1");
            }
        });
        a2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                texto.setText(texto.getText()+"2");
            }
        });
        a3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                texto.setText(texto.getText()+"3");
            }
        });
        a4Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                texto.setText(texto.getText()+"4");
            }
        });
        a5Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                texto.setText(texto.getText()+"5");
            }
        });
        a6Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                texto.setText(texto.getText()+"6");
            }
        });
        a7Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                texto.setText(texto.getText()+"7");
            }
        });
        a8Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                texto.setText(texto.getText()+"8");
            }
        });
        a9Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                texto.setText(texto.getText()+"9");
            }
        });
        a0Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                texto.setText(texto.getText()+"0");
            }
        });
        button27.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                texto.setText(texto.getText()+".");
            }
        });
        button17.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                funciones.setText("+");
                var.setText(texto.getText());
                texto.setText("");
            }
        });
        button18.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                funciones.setText("-");
                var.setText(texto.getText());
                texto.setText("");
            }
        });
        xButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                funciones.setText("x");
                var.setText(texto.getText());
                texto.setText("");
            }
        });
        button26.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                funciones.setText("/");
                var.setText(texto.getText());
                texto.setText("");
            }
        });
        igual.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String fun;
                fun=funciones.getText();
                if (fun.equals("+")){
                    texto.setText(Double.toString(Double.parseDouble(texto.getText())+Double.parseDouble(var.getText())));
                }
                else if (fun.equals("-")) {
                    texto.setText(Double.toString(Double.parseDouble(var.getText())-Double.parseDouble(texto.getText())));

                } else if (fun.equals("x")) {
                    texto.setText(Double.toString(Double.parseDouble(texto.getText())*Double.parseDouble(var.getText())));

                } else if (fun.equals("/")) {
                    try {
                        texto.setText(Double.toString(Double.parseDouble(var.getText())/Double.parseDouble(texto.getText())));
                    } catch (ArithmeticException ex) {
                        texto.setText("Syntax Error");
                    }
                } else if (fun.equals("cos")) {
                    String com= var.getText();
                    if (com.equals("")){
                        texto.setText(Double.toString(Math.cos(Double.parseDouble(texto.getText()))));
                    }
                    else {
                        double uno=Double.parseDouble(var.getText());
                        texto.setText(Double.toString(uno*Math.cos(Double.parseDouble(texto.getText()))));
                    }
                } else if (fun.equals("sen")) {
                    String com= var.getText();
                    if (com.equals("")){
                        texto.setText(Double.toString(Math.sin(Double.parseDouble(texto.getText()))));
                    }
                    else {
                        double uno=Double.parseDouble(var.getText());
                        texto.setText(Double.toString(uno*Math.sin(Double.parseDouble(texto.getText()))));
                    }
                } else if (fun.equals("tan")) {
                    String com= var.getText();
                    if (com.equals("")){
                        texto.setText(Double.toString(Math.tan(Double.parseDouble(texto.getText()))));
                    }
                    else {
                        double uno=Double.parseDouble(var.getText());
                        texto.setText(Double.toString(uno*Math.tan(Double.parseDouble(texto.getText()))));
                    }
                } else if (fun.equals("√")) {
                    String com= var.getText();
                    if (com.equals("")){
                        texto.setText(Double.toString(Math.sqrt(Double.parseDouble(texto.getText()))));
                    }
                    else {
                        double uno=Double.parseDouble(var.getText());
                        texto.setText(Double.toString(uno*Math.sqrt(Double.parseDouble(texto.getText()))));
                    }
                } else if (fun.equals("%")) {
                    texto.setText(Double.toString(Double.parseDouble(var.getText())%Double.parseDouble(texto.getText())));
                } else if (fun.equals("log")) {
                    String com= var.getText();
                    if (com.equals("")){
                        texto.setText(Double.toString(Math.log10(Double.parseDouble(texto.getText()))));
                    }
                    else {
                        double uno=Double.parseDouble(var.getText());
                        texto.setText(Double.toString(uno*Math.log10(Double.parseDouble(texto.getText()))));
                    }
                } else if (fun.equals("x^")) {
                    texto.setText(Double.toString(Math.pow(Double.parseDouble(var.getText()),Double.parseDouble(texto.getText()))));
                } else if (fun.equals("ln")) {
                    String com= var.getText();
                    if (com.equals("")){
                        texto.setText(Double.toString(Math.log(Double.parseDouble(texto.getText()))));
                    }
                    else {
                        double uno=Double.parseDouble(var.getText());
                        texto.setText(Double.toString(uno*Math.log(Double.parseDouble(texto.getText()))));
                    }
                } else if (fun.equals("π")) {
                    String com= var.getText();
                    if (com.equals("")){
                        texto.setText("3.14159265359");
                    } else{
                        double uno=Double.parseDouble(var.getText());
                        texto.setText(Double.toString(3.14159265359*uno));
                    }
                } else if (fun.equals("e")) {
                    String com= var.getText();
                    if (com.equals("")){
                        texto.setText("2.71828182846");
                    } else{
                        double uno=Double.parseDouble(var.getText());
                        texto.setText(Double.toString(2.71828182846*uno));
                    }
                }
            }
        });
        cosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                funciones.setText("Cos");
                var.setText(texto.getText());
                texto.setText("");
            }

        });
        senButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                funciones.setText("Sin");
                var.setText(texto.getText());
                texto.setText("");
            }
        });
        tanButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                funciones.setText("Tan");
                var.setText(texto.getText());
                texto.setText("");

            }
        });
        button7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                funciones.setText("√");
                var.setText(texto.getText());
                texto.setText("");
            }

        });
        button8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                funciones.setText("%");
                var.setText(texto.getText());
                texto.setText("");
            }
        });
        logButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                funciones.setText("log");
                var.setText(texto.getText());
                texto.setText("");
            }
        });
        xButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                funciones.setText("x^");
                var.setText(texto.getText());
                texto.setText("");
            }
        });
        lnButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                funciones.setText("ln");
                var.setText(texto.getText());
                texto.setText("");
            }
        });
        πButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                funciones.setText("π");
                var.setText(texto.getText());
                texto.setText("");
            }
        });
        eButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                funciones.setText("e");
                var.setText(texto.getText());
                texto.setText("");
            }
        });
        CEButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                funciones.setText("");
                var.setText("");
                texto.setText("");
            }
        });
    }
}
