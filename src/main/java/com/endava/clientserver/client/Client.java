package com.endava.clientserver.client;

import java.io.IOException;

public class Client {

    public static void main(String[] args) {
        Model model = new Model();
        Controller controler = new Controller(model);
        try {
            @SuppressWarnings("unused")
            View gui = new View(controler);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
