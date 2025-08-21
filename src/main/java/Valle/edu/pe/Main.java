package Valle.edu.pe;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new CalculadoraApp().setVisible(true);
        });
    }
}
