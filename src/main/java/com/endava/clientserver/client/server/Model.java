package com.endava.clientserver.client.server;

import java.io.IOException;
import java.net.*;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JTextArea;
/* Model holds the logic of the application*/
/* It has connect & setTextArea methods plus JTextArea*/

public class Model {

    JTextArea JTextArea1;

    public void connect() throws UnknownHostException, IOException {
        int port = 56787;
        JTextArea1 = new JTextArea();
        InetAddress server = null;
        try {
            server = InetAddress.getLocalHost();
        } catch (UnknownHostException e) {
            Logger.getLogger(Model.class.getName()).log(Level.SEVERE, null, e);
        }
        @SuppressWarnings("resource")
        ServerSocket s = new ServerSocket(port);
        System.out
                .println("The server is" + server.getHostName() + "On the port"
                        + port + "IP Address" + server.getHostAddress());
        System.out.println("Connecting...");

        int i = 0;
        while (true) {
            Socket client = s.accept();
            Thread t = new ThreadWebHandler(client, i++, JTextArea1);
            System.out.println("Client number" + i);
            t.start();
        }
    }

    void setTextArea(JTextArea JTextArea1) {
        this.JTextArea1 = JTextArea1;
    }

}
