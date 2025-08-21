package Valle.edu.pe;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculadoraApp extends JFrame implements ActionListener {
    private JTextField pantalla;
    private String operacion = "";
    private double numero1, numero2, resultado;

    public CalculadoraApp() {
        // Configuración de la ventana
        setTitle("Calculadora con JFrame");
        setSize(300, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Pantalla de la calculadora
        pantalla = new JTextField();
        pantalla.setEditable(false);
        pantalla.setFont(new Font("Arial", Font.BOLD, 24));
        add(pantalla, BorderLayout.NORTH);

        // Panel de botones
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 4));

        String botones[] = {
                "7", "8", "9", "+",
                "4", "5", "6", "-",
                "1", "2", "3", "*",
                "0", "C", "=", "/"
        };

        for (String texto : botones) {
            JButton boton = new JButton(texto);
            boton.setFont(new Font("Arial", Font.BOLD, 18));
            boton.addActionListener(this);
            panel.add(boton);
        }

        add(panel, BorderLayout.CENTER);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String texto = e.getActionCommand();

        if ("0123456789".contains(texto)) {
            pantalla.setText(pantalla.getText() + texto);
        } else if ("+-*/".contains(texto)) {
            numero1 = Double.parseDouble(pantalla.getText());
            operacion = texto;
            pantalla.setText("");
        } else if ("=".equals(texto)) {
            numero2 = Double.parseDouble(pantalla.getText());

            Calculadora calc = new Calculadora(numero1, numero2);

            switch (operacion) {
                case "+": resultado = calc.sumar(); break;
                case "-": resultado = calc.restar(); break;
                case "*": resultado = calc.multiplicar(); break;
                case "/": resultado = calc.dividir(); break;
            }
            pantalla.setText(String.valueOf(resultado));
        } else if ("C".equals(texto)) {
            pantalla.setText("");
            numero1 = numero2 = resultado = 0;
            operacion = "";
        }
    }
}
