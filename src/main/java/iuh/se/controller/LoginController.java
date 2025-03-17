/*
 * @description:
 * @author: ngphthinh
 * @date: 3/17/2025
 * @version: 1.0
 * @last_modified: 3/17/2025
 */


package iuh.se.controller;

import iuh.se.view.login.LoginView;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginController implements ActionListener {

    private LoginView loginView;

    public LoginController() {
        loginView = new LoginView();
        setEvent();
    }

    private void setEvent() {
        loginView.getBtnLogin().addActionListener(this);
        loginView.getTxtUsername().addActionListener(this);
        loginView.getTxtPassword().addActionListener(this);
        loginView.getCbShowPassword().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == loginView.getBtnLogin() || e.getSource() == loginView.getTxtPassword()) {
            handleLogin();
        } else if (e.getSource() == loginView.getTxtUsername()) {
            loginView.getBtnLogin().requestFocus();
        } else if(e.getSource() == loginView.getCbShowPassword()) {
            handleShowPassword(); 
        }
    }

    private void handleShowPassword() {
        if (loginView.getCbShowPassword().isSelected()) {
            loginView.getTxtPassword().setEchoChar((char) 0);
        } else {
            loginView.getTxtPassword().setEchoChar('\u2022');
        }
    }

    private boolean isValid() {
        String username = loginView.getTxtUsername().getText().trim();
        String password = new String(loginView.getTxtPassword().getPassword()).trim();
        loginView.getLblValidationUsername().setText("");
        loginView.getLblValidationPassword().setText("");

        if (username.isEmpty() && password.isEmpty()) {
            loginView.getLblValidationUsername().setText("Tài khoản không được để trống");
            loginView.getLblValidationPassword().setText("Mật khẩu không được để trống");
            return false;
        }

        if (username.isEmpty()) {
            loginView.getLblValidationUsername().setText("Tài khoản không được để trống");
            return false;
        }
        if (username.matches(".*\\s.*")) {
            loginView.getLblValidationUsername().setText("Tài khoản không được chứa khoảng trắng");
            return false;
        }
        if (password.isEmpty()) {
            loginView.getLblValidationPassword().setText("Mật khẩu không được để trống");
            return false;
        }
        if (!password.matches("[A-Za-z0-9(@#!$%^&+=)]{8,10}")) {
            loginView.getLblValidationPassword().setText("<html>Mật khẩu phải chứa số kí tự đặt biệt <br> và độ dài từ 8 - 10 kí tự</html>");
            return false;
        }
        return true;
    }

    private void handleLogin() {
        loginView.getTxtUsername().requestFocus();
        if (!isValid()) return;

    }

    public static void main(String[] args) {
        new LoginController();
    }
}
