//questao 3

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ExemploImageIcon {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);

        ImageIcon icon = new ImageIcon(ExemploImageIcon.class.getResource("imagem.png"));
        JLabel label = new JLabel(icon);
        
        frame.add(label);
        frame.setVisible(true);
    }
}
