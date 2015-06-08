package com.endava.clientserver.server.controller;

import com.endava.clientserver.server.view.View;
import java.io.IOException;
import java.net.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/* Model holds the logic of the application*/
/* It has connect & setTextArea methods plus JTextArea*/

public class Controller {
    private View view;

    public void connect() throws UnknownHostException, IOException {
        int port = 56787;
        InetAddress server = null;
        try {
            server = InetAddress.getLocalHost();
        } catch (UnknownHostException e) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, e);
        }
        @SuppressWarnings("resource")
        ServerSocket s = new ServerSocket(port);
        System.out
                .println("The server is " + server.getHostName() + "On the port "
                        + port + "IP Address " + server.getHostAddress());
        System.out.println("Connecting...");

        int i = 0;
        while (true) {
            Socket client = s.accept();
            System.out.println("Client number" + i);
        }
    }


    public void setView(View aThis) {
        this.view = aThis;
    }

}
