package com.endava.clientserver.server.app;

import com.endava.clientserver.server.controller.Controller;
import com.endava.clientserver.server.view.View;
import java.io.IOException;

public class App {

    public static void main(String[] args) throws IOException {

        Controller ctr = new Controller();
        View view = new View(ctr);
        view.connect();
        

    }
}
