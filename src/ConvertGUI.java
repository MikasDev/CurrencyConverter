import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ConvertGUI extends JFrame {
    private JTextField inputTextField1;
    private JComboBox<String> inBox;
    private JComboBox<String> outBox;
    private double inputUser;
    private String inCurrency;
    private String outCurrency;

    public ConvertGUI() {
        super("Currency Converter App");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setResizable(false);
        addGuiComponents();
        setVisible(true);
    }

    private void addGuiComponents() {
        int x = (getWidth() - 200) / 2;
        int y = 20;
        int xBtn = (getWidth() - 100) / 2;

        inputTextField1 = new JTextField();
        inputTextField1.setBounds(x, y, 200, 45);
        inputTextField1.setFont(new Font("Dialog", Font.PLAIN, 19));
        add(inputTextField1);

        String[] currency = {"BRL", "USD", "EUR", "GBP", "JPY"};

        inBox = new JComboBox<>(currency);
        inBox.setBounds(x + 10, y + 60, 70, 30);
        inBox.setFont(new Font("Dialog", Font.PLAIN, 15));
        add(inBox);

        outBox = new JComboBox<>(currency);
        outBox.setBounds(x + 115, y + 60, 70, 30);
        outBox.setFont(new Font("Dialog", Font.PLAIN, 15));
        add(outBox);

        JButton convertBTN = new JButton("Convert");
        convertBTN.setFont(new Font("Dialog", Font.PLAIN, 16));
        convertBTN.setBounds(xBtn, y + 120, 100, 45);

        convertBTN.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String inputValue = inputTextField1.getText();
                inputUser = Double.parseDouble(inputValue);
                inCurrency = (String) inBox.getSelectedItem();
                outCurrency = (String) outBox.getSelectedItem();

                // Após pegar os valores, você pode chamar a conversão aqui mesmo
                Converter cter = new Converter();
                double result = cter.convertCurrency(inputUser, inCurrency, outCurrency);
                String formattedResult = String.format("%.2f", result);

                //pegando o simbolo da moeda convertida
                String outSymbol = cter.getCurrencySymbol(outCurrency);

                // Criando JLabel para exibir o resultado
                JLabel label = new JLabel();
                label.setText(formattedResult + "" + outSymbol); // Convertendo o resultado para String
                label.setBounds(x +50, y + 180, 200, 45);
                label.setFont(new Font("Dialog", Font.PLAIN, 40));
                add(label);

                // Revalidar e repintar o JFrame para exibir o resultado
                revalidate();
                repaint();
            }
        });

        add(convertBTN);
    }
}
