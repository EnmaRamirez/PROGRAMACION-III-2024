//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import javax.swing.*;
import javax.swing.plaf.PanelUI;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import java.util.Random;

public class FortuneCookieApp {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(FortuneCookieFrame::new);


        }
    }

class FortuneCookieFrame extends JFrame {
    private final ArrayList<String> messages;
    private final JLabel messageLabel;
    private final Random random;

    public  FortuneCookieFrame(){
        setTitle("Juego");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        getContentPane().setBackground(new Color(255, 223,186));

        messages = new ArrayList<>();
        random = new Random();
        messages.add("Eres una gerrera ");
        messages.add("Lucha por tus sueños");
        messages.add("Eres bella ante los ojos de Dios. ");
        messages.add("Tienes muchos propositos para vivir. ");
        messages.add("Tu energia positiva atraera mejores oportunidades. ");

        setLayout(new BorderLayout());
        messageLabel = new JLabel("Preciona el boton para tu fortuna", SwingConstants.CENTER);
        messageLabel.setFont(new Font("Serif", Font.BOLD, 20));
        messageLabel.setForeground(new Color(102, 51, 0));
        add(messageLabel, BorderLayout.CENTER);

        JButton fortuneButton = new JButton("Obtener Fortuna");
        fortuneButton.setFont(new Font("SansSerif", Font.BOLD, 20));
        fortuneButton.setBackground(new Color(255, 153, 51));
        fortuneButton.setForeground(Color.WHITE);
        fortuneButton.setFocusPainted(false);
        fortuneButton.setBorder(BorderFactory.createRaisedBevelBorder());
        fortuneButton.addActionListener(new  ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showRandomMessage();
            }

        });
        add(fortuneButton, BorderLayout.SOUTH);
        setVisible(true);




    }
    private void showRandomMessage(){
        int index = random.nextInt(messages.size());
        messageLabel.setText(messages.get(index));
    }
}