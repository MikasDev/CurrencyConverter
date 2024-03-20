import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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

        // Calcula a posição para centralizá-los na tela
        int x = (getWidth() - 200) / 2; // Centraliza na horizontal
        int y = 20; // Posição vertical inicial

        int xBtn = (getWidth() - 100)/2;


        //Input Fields
        JTextField inputTextField1 = new JTextField();

        inputTextField1.setBounds(x, y, 200, 45);
        inputTextField1.setFont(new Font("Dialog", Font.PLAIN, 19));

        add(inputTextField1);

        //Opções para o input
        String[] currency = {"USD","EUR","GBP","JPY"};

        JComboBox<String> inBox = new JComboBox<>(currency);
        inBox.setBounds(x + 10,y+60,70,30);
        inBox.setFont(new Font("Dialog", Font.PLAIN, 15));

        JComboBox<String> outBox = new JComboBox<>(currency);
        outBox.setBounds(x+115, y+60,70,30);
        outBox.setFont(new Font("Dialog", Font.PLAIN, 15));

        add(inBox);
        add(outBox);

        //botões
        JButton convertBTN = new JButton("Convert");
        convertBTN.setFont(new Font("Dialog", Font.PLAIN, 16));
        convertBTN.setBounds(xBtn,y+120,100,45);

        //pegando os valores
        convertBTN.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String inputValue = inputTextField1.getText();
                String inCurrency = (String) inBox.getSelectedItem();
                String outCurrency = (String) outBox.getSelectedItem();
            }
        });

        add(convertBTN);
    }
}