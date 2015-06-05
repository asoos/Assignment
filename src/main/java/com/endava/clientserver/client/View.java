package com.endava.clientserver.client;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class View {

    private JLabel JLabel2;
    private JTextField JTextField2;
    Controller controler;
    String user;

    public View() {
        JFrame chatApp = new JFrame();
        chatApp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        chatApp.setTitle("Client");

        chatApp.setLocationRelativeTo(null);

        // content pane
        JPanel contentPane = new JPanel();

        JLabel chatName = new JLabel();
        chatName.setText("Client");

        // buttons
        JButton JButton1 = new JButton("Send");
        JButton1.setSize(50, 50);

        JButton JButton2 = new JButton("Identifier");
        JButton2.setSize(50, 50);
        // label
        JLabel2 = new JLabel();

        // add components to the frame/grid
        chatApp.add(contentPane);
        contentPane.add(chatName);
        contentPane.add(JButton2);
        contentPane.add(JButton1);

        chatApp.pack();

    }

    public View(Controller controler) throws UnknownHostException, IOException {
        this();
        this.controler = controler;
        user = JOptionPane.showInputDialog("Write your name: ");
        JLabel2.setText(user);
        controler.setConnection(user,
                JOptionPane.showInputDialog("Introduce IP Address: "));
        controler.connect();

        JTextField2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                String message = JTextField2.getText();
                try {
                    View.this.controler.insertData(message, message);
                } catch (UnknownHostException e) {
                    Logger.getLogger(View.class.getName()).log(Level.SEVERE,
                            null, e);
                } catch (IOException e) {
                    Logger.getLogger(View.class.getName()).log(Level.SEVERE,
                            null, e);
                }
            }
        });
    }

}
