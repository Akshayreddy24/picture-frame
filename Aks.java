import java.awt.*;
import java.awt.image.BufferedImage;
import javax.swing.*;
import javax.swing.border.*;

class Aks {

    public static void main(String[] args) {
    Runnable r = new Runnable() {

        @Override
        public void run() {
        JPanel gui = new JPanel(new BorderLayout());
        gui.setBorder(new LineBorder(Color.BLUE, 12));

        Image image = new BufferedImage(400,50,BufferedImage.TYPE_INT_RGB);
        JLabel l = new JLabel(new ImageIcon(image));
        Border b1 = new BevelBorder(
            BevelBorder.LOWERED, Color.LIGHT_GRAY, Color.DARK_GRAY);
        Border b2 = new LineBorder(Color.GRAY, 12);
        Border b3 = new BevelBorder(
            BevelBorder.LOWERED, Color.LIGHT_GRAY, Color.DARK_GRAY);
        Border bTemp = new CompoundBorder(b1,b2);
        Border b = new CompoundBorder(bTemp,b3);
        l.setBorder(b);

        gui.add(l);

        JOptionPane.showMessageDialog(null, gui);
        }
    };
    SwingUtilities.invokeLater(r);
    }
}