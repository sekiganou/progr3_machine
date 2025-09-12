package view;

import controller.GenerateProverb;
import model.Proverbs;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;
import java.util.Observer;

public class ProverbWindow extends JFrame implements Observer {
    private final JLabel proverbLabel;

    public ProverbWindow(Proverbs proverbs, GenerateProverb generateProverbController) {
        super("Proverbs");
        JPanel mainPanel = new JPanel(new GridBagLayout());

        JButton generateProverbButton = new JButton("Generate");
        mainPanel.add(generateProverbButton);

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = GridBagConstraints.RELATIVE; // each add goes below the previous
        gbc.anchor = GridBagConstraints.CENTER;
        gbc.insets = new Insets(10, 0, 10, 0); // spacing between components

        proverbLabel = new JLabel(proverbs.getSelectedProverb(), SwingConstants.CENTER);
        mainPanel.add(proverbLabel, gbc);

        setContentPane(mainPanel);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 200);
        setLocationRelativeTo(null);
        setVisible(true);

        generateProverbButton.addActionListener(new  ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                generateProverbController.selectRandomProverb();
            }
        });
    }

    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof Proverbs) {
            proverbLabel.setText(((Proverbs)o).getSelectedProverb());
        }
    }
}
