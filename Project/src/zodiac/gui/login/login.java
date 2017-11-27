package zodiac.gui.login;

import javax.swing.*;
import zodiac.action.security.UserAction;
import zodiac.dao.security.UserDao;
import zodiac.gui.admin.*;
import zodiac.gui.user.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

public class login {
    private JPasswordField passwordField1;
    private JPanel mainPanel;
    private JTextField usernameField;
    private JButton loginButton;
    private String username;
    private String password;
    private JDialog result;
    private boolean registerBool;
    private String output;

    public login() {
        usernameField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                username = usernameField.getText();
            }
        });
        passwordField1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                char[] workingPassword = passwordField1.getPassword();
                password = new String(workingPassword);
            }
        });
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                username = usernameField.getText();
                char[] workingPassword = passwordField1.getPassword();
                password = new String(workingPassword);
                UserAction potentialUser = new UserAction();
                UserDao pt = new UserDao();
                try {
                    registerBool = pt.getRegistered(username);
                } catch (SQLException e1) {
                    e1.printStackTrace();
                }
                result = new JDialog();
                result.setSize(new Dimension(200, 100));
                if (registerBool == true){
                    output = "Login Successful";
                }
                else {
                    output = "Login Failed";
                }
                JLabel prompt = new JLabel(output);
                result.add(prompt);
                result.setModalityType(Dialog.ModalityType.APPLICATION_MODAL);
                result.setVisible(true);

            }
        });

    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("login");
        frame.setContentPane(new login().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setTitle("Login");
        frame.setSize(800, 400);
    }
}
