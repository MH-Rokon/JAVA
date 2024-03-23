
import java.awt.FlowLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Image extends JFrame {
    private ImageIcon image1;
    private JLabel label1;
    private ImageIcon image2;
    private JLabel label2;
    private ImageIcon image3;
    private JLabel label3;

    Image() {
        setLayout(new FlowLayout());

        image1 = new ImageIcon(getClass().getResource("ice.jpeg"));
        // image1 = resizeImage(image1, 300, 300);
        label1 = new JLabel(image1);
        add(label1);

        image2 = new ImageIcon(getClass().getResource("pust_logo.png"));
        // image2 = resizeImage(image2, 600, 1200);
        label2 = new JLabel(image2);
        add(label2);

       
        image3 = new ImageIcon(getClass().getResource("images.jpeg"));
        // image3 = resizeImage(image3, 300, 300);
        label3 = new JLabel(image3);
        add(label3);
    }

    
    // private ImageIcon resizeImage(ImageIcon imageIcon, int width, int height) {
    //     java.awt.Image image = imageIcon.getImage(); // Convert ImageIcon to Image
    //     java.awt.Image resizedImage = image.getScaledInstance(width, height, java.awt.Image.SCALE_SMOOTH); // Resize Image
    //     return new ImageIcon(resizedImage); // Convert back to ImageIcon
    // }

    public static void main(String args[]) {
        Image gui = new Image();
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gui.setVisible(true);
        gui.pack();
        gui.setTitle("Image Program");
    }
}
