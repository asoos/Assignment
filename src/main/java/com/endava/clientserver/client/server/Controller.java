package com.endava.clientserver.client.server;

import java.io.IOException;
import java.net.UnknownHostException;
import javax.swing.JTextArea;

/*The Controller controls the interaction between model & view*/
public class Controller {

    Model model;

    public Controller(Model model) {
        this.model = model;
    }

    void connectToServer() throws UnknownHostException, IOException {
        model.connect();
    }

    void setTextArea(JTextArea JTextArea1) {
        model.setTextArea(JTextArea1);
    }
}
