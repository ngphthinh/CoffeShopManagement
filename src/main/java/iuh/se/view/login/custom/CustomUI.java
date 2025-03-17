/*
 * @description:
 * @author: ngphthinh
 * @date: 3/17/2025
 * @version: 1.0
 * @last_modified: 3/17/2025
 */


package iuh.se.view.login.custom;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

public class CustomUI {
    private static CustomUI instance;
    private Font font = new Font("Dialog", Font.PLAIN, 12);

    Color color = Color.decode("#000000");

    public static CustomUI getInstance() {
        if (instance == null) {
            instance = new CustomUI();
        }
        return instance;
    }

    public void setCustomBtn(JButton btn) {
        btn.setBackground(Color.WHITE);
        btn.setForeground(color);
        btn.setFont(new Font("Dialog", Font.BOLD, 12));
        btn.setBorder(new LineBorder(color));
        btn.setPreferredSize(new Dimension(250, 30));
        btn.setMaximumSize(new Dimension(250, 30));
    }


    public void setCustomBtnHover(JButton btn) {
        btn.setBackground(color);
        btn.setForeground(Color.WHITE);
    }

    public void setCustomValidationLb(JLabel lb) {
        lb.setFont(new Font("Dialog", Font.PLAIN, 12));
        lb.setForeground(Color.RED);
        lb.setBorder(BorderFactory.createEmptyBorder());
        lb.setFocusable(false);
        lb.setOpaque(false);

    }

    public void setCustomLabel(JLabel lb) {
        lb.setFont(font);
        lb.setForeground(color);
    }

    public void setCustomLbTitle(JLabel lb) {
        lb.setFont(new Font("Dialog", Font.BOLD, 24));
        lb.setForeground(color);
    }

    public void setCustomTextField(JTextField txt) {
        txt.setFont(font);
        txt.setPreferredSize(new Dimension(470, 30));
        txt.setMaximumSize(new Dimension(470, 30));
        txt.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0,color));
    }


    public void setCustomCheckBox(JCheckBox cbShowPassword) {
        cbShowPassword.setBackground(Color.WHITE);
        cbShowPassword.setFont(font);
        cbShowPassword.setForeground(color);
        cbShowPassword.setOpaque(false);
    }
}
