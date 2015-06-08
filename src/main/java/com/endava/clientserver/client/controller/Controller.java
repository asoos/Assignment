package com.endava.clientserver.client.controller;

import com.endava.clientserver.client.model.ModelInterface;
import java.io.IOException;
import java.net.UnknownHostException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Controller {

    private ModelInterface model;

    @Autowired
    public Controller(ModelInterface model) {
        this.model = model;
    }

    public void setConnection(String user, String IPAddress) {
        model.setUser(user);
        model.setIPAddress(IPAddress);
    }

    public void connect() throws UnknownHostException, IOException {
        model.StartServer();
    }

    public void insertData(String user, String message) throws UnknownHostException,
            IOException {
        model.insertData(user, message);
    }
}
