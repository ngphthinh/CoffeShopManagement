/*
 * @description:
 * @author: ngphthinh
 * @date: 3/17/2025
 * @version: 1.0
 * @last_modified: 3/17/2025
 */


package iuh.se.view.login.custom;

import javax.swing.*;
import java.awt.*;

public class ImagePanel extends JPanel {
    private Image image;

    public ImagePanel(String imagePath) {
        this.image = new ImageIcon(imagePath).getImage();
    }

    @Override
    protected void paintComponent(java.awt.Graphics g) {
        super.paintComponent(g);
       if (image != null) {
           g.drawImage(image, 0,0, getWidth(),getHeight(), this);
        }
    }
}
