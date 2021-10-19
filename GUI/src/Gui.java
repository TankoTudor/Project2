import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Gui {
    private JButton apasaLButton;
    private JPanel mypanel;
    private JTextField mytextfield;
    private JLabel mylabel;
    private JPasswordField mypasswordfield;
    private JLabel mypasswordlabel;
    private JLabel mylabel3;

    public Gui(){
        mylabel3.setVisible(false);
        apasaLButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mytextfield.setText("");
                mypasswordfield.setText("");
                String password = String.valueOf(mypasswordfield.getPassword());
                if(mytextfield.getText().equals("Tudor")  && password.equals("123"))
                {
                    mylabel3.setText("Ai reusit!");
                    mylabel3.setVisible(true);
                }
                else
                {
                    mylabel3.setText("Username sau parola incorecta!");
                    mylabel3.setVisible(true);
                }

            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Apasa butonul");
        frame.setContentPane(new Gui().mypanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
