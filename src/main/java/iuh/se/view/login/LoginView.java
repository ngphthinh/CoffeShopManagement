/*
 * @description:
 * @author: ngphthinh
 * @date: 3/17/2025
 * @version: 1.0
 * @last_modified: 3/17/2025
 */


package iuh.se.view.login;

import iuh.se.config.Config;
import iuh.se.config.ConfigViewLogin;
import iuh.se.view.login.custom.CustomUI;
import iuh.se.view.login.custom.ImagePanel;


import javax.swing.*;
import java.awt.*;

public class LoginView extends JFrame {


    private JPasswordField txtPassword;
    private JTextField txtUsername;
    private JButton btnLogin;
    private JLabel lblValidationPassword;
    private JLabel lblValidationUsername;
    private JCheckBox cbShowPassword;

    public LoginView() {
        init();
    }

    private void init() {
        this.setSize(ConfigViewLogin.WIDTH, ConfigViewLogin.HEIGHT);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);

        JPanel pnl = new JPanel(new BorderLayout());
        pnl.add(createLoginImagePanel(), BorderLayout.WEST);
        pnl.add(createLoginPanel(), BorderLayout.EAST);

        this.add(pnl);
        this.setIconImage(new ImageIcon(Config.getImagePath("logo.jpg")).getImage());
        this.setResizable(false);
        this.setVisible(true);
    }

    private Component createLoginImagePanel() {
        JPanel pnlImage = new ImagePanel(Config.getImagePath("background.jpg"));
        System.out.println(Config.getImagePath("background.jpg"));
        pnlImage.setBackground(Color.WHITE);
        pnlImage.setPreferredSize(new Dimension((int) (ConfigViewLogin.WIDTH * 0.6), ConfigViewLogin.HEIGHT));
        return pnlImage;
    }

    private Component createLoginPanel() {
        JPanel pnlLogin = new JPanel(new BorderLayout());
        pnlLogin.setPreferredSize(new Dimension((int) (ConfigViewLogin.WIDTH * 0.4), ConfigViewLogin.HEIGHT));
        pnlLogin.setBorder(BorderFactory.createEmptyBorder(50, 50, 50, 50));
        pnlLogin.setBackground(Color.WHITE);

        pnlLogin.add(createTitlePanel(), BorderLayout.NORTH);
        pnlLogin.add(createFormPanel(), BorderLayout.CENTER);
        return pnlLogin;
    }

    private Component createFormPanel() {
        JPanel pnlForm = new JPanel();
        pnlForm.setLayout(new BoxLayout(pnlForm, BoxLayout.Y_AXIS));
        pnlForm.setBackground(Color.WHITE);

       JLabel lblUsername = new JLabel("Tên tài khoản: ");
       CustomUI.getInstance().setCustomLabel(lblUsername);

        txtUsername = new JTextField();
        CustomUI.getInstance().setCustomTextField(txtUsername);

        lblValidationUsername = new JLabel();
        CustomUI.getInstance().setCustomValidationLb(lblValidationUsername);


        JLabel lblPassword = new JLabel("Mật khẩu:");
        CustomUI.getInstance().setCustomLabel(lblPassword);

        txtPassword = new JPasswordField();
        CustomUI.getInstance().setCustomTextField(txtPassword);


        cbShowPassword = new JCheckBox("Hiển thị mật khẩu");
        CustomUI.getInstance().setCustomCheckBox(cbShowPassword);

        lblValidationPassword = new JLabel();
        CustomUI.getInstance().setCustomValidationLb(lblValidationPassword);

        btnLogin = new JButton("Đăng nhập");
        CustomUI.getInstance().setCustomBtn(btnLogin);

        btnLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseEntered(java.awt.event.MouseEvent e) {
                CustomUI.getInstance().setCustomBtnHover(btnLogin);
            }

            @Override
            public void mouseExited(java.awt.event.MouseEvent e) {
                CustomUI.getInstance().setCustomBtn(btnLogin);
            }
        });

        pnlForm.add(lblUsername);
        pnlForm.add(txtUsername);
        pnlForm.add(lblValidationUsername);
        pnlForm.add(Box.createVerticalStrut(10));
        pnlForm.add(lblPassword);
        pnlForm.add(txtPassword);
        pnlForm.add(cbShowPassword);
        pnlForm.add(lblValidationPassword);
        pnlForm.add(Box.createVerticalStrut(10));
        pnlForm.add(btnLogin);

        pnlForm.setBorder(BorderFactory.createEmptyBorder());

        pnlForm.setBorder(BorderFactory.createEmptyBorder());
        pnlForm.setOpaque(false);

        return pnlForm;

    }

    private Component createTitlePanel() {
        JPanel pnlTitle = new JPanel();
        pnlTitle.setBackground(Color.WHITE);

        pnlTitle.setLayout(new BoxLayout(pnlTitle, BoxLayout.Y_AXIS));
        pnlTitle.setAlignmentX(Component.CENTER_ALIGNMENT);
        pnlTitle.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        ImageIcon icon = new ImageIcon(Config.getImagePath("loginImg.jpg"));
        JLabel lblIcon = new JLabel(new ImageIcon(icon.getImage().getScaledInstance(80, 80, Image.SCALE_SMOOTH)));
        lblIcon.setAlignmentX(Component.CENTER_ALIGNMENT);

        JLabel lblTitle = new JLabel("Đăng nhập");
        CustomUI.getInstance().setCustomLbTitle(lblTitle);
        lblTitle.setAlignmentX(Component.CENTER_ALIGNMENT);

        pnlTitle.add(lblIcon);
        pnlTitle.add(Box.createVerticalStrut(10));
        pnlTitle.add(lblTitle);


        return pnlTitle;
    }


    public JPasswordField getTxtPassword() {
        return txtPassword;
    }

    public void setTxtPassword(JPasswordField txtPassword) {
        this.txtPassword = txtPassword;
    }

    public JTextField getTxtUsername() {
        return txtUsername;
    }

    public void setTxtUsername(JTextField txtUsername) {
        this.txtUsername = txtUsername;
    }

    public JButton getBtnLogin() {
        return btnLogin;
    }

    public void setBtnLogin(JButton btnLogin) {
        this.btnLogin = btnLogin;
    }

    public JLabel getLblValidationPassword() {
        return lblValidationPassword;
    }

    public void setLblValidationPassword(JLabel lblValidationPassword) {
        this.lblValidationPassword = lblValidationPassword;
    }

    public JLabel getLblValidationUsername() {
        return lblValidationUsername;
    }

    public void setLblValidationUsername(JLabel lblValidationUsername) {
        this.lblValidationUsername = lblValidationUsername;
    }

    public JCheckBox getCbShowPassword() {
        return cbShowPassword;
    }

    public void setCbShowPassword(JCheckBox cbShowPassword) {
        this.cbShowPassword = cbShowPassword;
    }

    public static void main(String[] args) {
        new LoginView();
    }

}
