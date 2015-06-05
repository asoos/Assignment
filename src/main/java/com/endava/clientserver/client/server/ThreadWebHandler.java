package com.endava.clientserver.client.server;

import java.io.*;
import java.net.*;
import javax.swing.JTextArea;

public class ThreadWebHandler extends Thread {

    Model model;

    public ThreadWebHandler(Model model, JTextArea JTextArea1) {
        this.model = model;
        this.JTextArea1 = JTextArea1;
    }

    private Socket incoming;
    private int idClient;
    private JTextArea JTextArea1;

    public ThreadWebHandler(Socket i, int c, JTextArea JTextArea1) {
        this.incoming = i;
        this.idClient = c;
        this.JTextArea1 = JTextArea1;
    }

    public void run() {
        BufferedReader in = null;
        try {
            in = new BufferedReader(new InputStreamReader(incoming.getInputStream()));
            try (PrintWriter out = new PrintWriter(incoming.getOutputStream(), true)) {
                System.out.println("Client " + idClient + "\n");
                String line = null;
                do {
                    while (!(line = in.readLine()).equals("") && incoming.isBound()) {
                        this.JTextArea1.setText(this.JTextArea1.getText() + "\n" + line + "client " + String.valueOf(idClient));
                    }
                } while (!line.equals("byee"));
                in.close();
            }
            incoming.close();
        } catch (IOException e) {
            System.out.println(e);
        } finally {
            try {
                in.close();
            } catch (IOException e) {
                System.out.println(e);
            }
        }
    }
}
