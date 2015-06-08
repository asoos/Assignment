package com.endava.clientserver.server.view;

import com.endava.clientserver.server.controller.Controller;
import java.io.IOException;

public class View {

    private static final long serialVersionUID = 1L;

    Controller ctr;
    
    public View(Controller ctr) {
        this.ctr = ctr;
        ctr.setView(this);
    }

    public void showMessage(String msg) {
        System.out.println(msg);
    }

    public void connect() throws IOException {
       ctr.connect();
    }
}
