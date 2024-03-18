import javax.swing.*;
import java.awt.*;

public class ConvertGUI extends JFrame {
    public ConvertGUI() {
        super("Currency Converter App");
        setSize(400, 400);

        // Define a operação padrão de fechamento da janela
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(null); // Mantém o layout nulo
        setResizable(false);

        addGuiComponents();
        setVisible(true);
    }

    private void addGuiComponents() {
        //Input Fields
        JTextField inputTextField1 = new JTextField();
        JTextField inputTextField2 = new JTextField();

        // Calcula a posição para centralizá-los na tela
        int x = (getWidth() - 200) / 2; // Centraliza na horizontal
        int y = 20; // Posição vertical inicial

        inputTextField1.setBounds(x, y, 200, 45);
        inputTextField2.setBounds(x, y + 60, 200, 45); // Adiciona um pequeno espaço entre eles

        inputTextField1.setFont(new Font("Dialog", Font.PLAIN, 24));
        inputTextField2.setFont(new Font("Dialog", Font.PLAIN, 24));

        add(inputTextField1);
        add(inputTextField2);
    }
}