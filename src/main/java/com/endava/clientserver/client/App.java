package com.endava.clientserver.client;

import com.endava.clientserver.client.view.View;
import com.endava.clientserver.client.controller.Controller;
import com.endava.clientserver.client.controller.GameController;
import com.endava.clientserver.client.controller.GameInterfaceController;
import com.endava.clientserver.client.model.GameInterface;
import com.endava.clientserver.client.model.GameModel;
import com.endava.clientserver.client.model.Model;
import java.io.IOException;

public class App {
    static int DIM =10;
    static int k=3;
    
    public static void main(String[] args) {
        GameInterface game = new GameModel();
        game.setDimension(DIM);
        GameInterfaceController ctr = new GameController();
        ctr.setK(k);
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
