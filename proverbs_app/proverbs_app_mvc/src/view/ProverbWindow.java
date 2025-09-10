package view;

import javax.swing.*;
import java.awt.*;
import java.util.Observable;

public class ProverbWindow extends JFrame {
    private JPanel mainPanel;
    private JButton generateProverbButton;
    private JLabel proverbLabel;
    public ProverbWindow() {
        super("Proverbs");
        mainPanel = new JPanel();

        generateProverbButton = new JButton("Generate");
        mainPanel.add(generateProverbButton);

        proverbLabel = new JLabel();
        proverbLabel.setText("...");
        mainPanel.add(proverbLabel);

        setContentPane(mainPanel);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 200);
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
