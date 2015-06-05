package com.endava.clientserver.client.server;

import java.io.IOException;
import java.net.UnknownHostException;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class View extends JFrame {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    private JTextArea JTextArea1;

    Controller controler;

    public View(Controller controler) throws UnknownHostException, IOException {
        this();
        controler.setTextArea(this.JTextArea1);
    }

    public View() {
        //frame
        new JFrame();

        //text area
        JTextArea1 = new JTextArea();
        JTextArea1.setText("");
        JTextArea1.setSize(50, 50);

        this.add(JTextArea1);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }

}
