package com.endava.clientserver.client.server;

import java.io.IOException;

public class Server {

    public static void main(String[] args) throws IOException {
        Model model = new Model();
        Controller controler = new Controller(model);
        View gui = new View();
        gui.setSize(200, 300);
        model.connect();
    }
}
