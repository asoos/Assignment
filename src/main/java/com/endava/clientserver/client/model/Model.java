package com.endava.clientserver.client.model;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.JTextField;
import org.springframework.stereotype.Component;

@Component
public class Model implements ModelInterface {

    private String user;
    private String IPAddress;
    JTextField jTextField2;

    Socket sck;
    BufferedReader read;
    PrintWriter write;

    public void setUser(String user) {
        this.user = user;
    }

    public void setIPAddress(String IPAddress) {
        this.IPAddress = IPAddress;
    }

    /**
     *
     * @throws UnknownHostException
     * @throws IOException
     */
    @Override
    public void StartServer() throws UnknownHostException, IOException {
        String hostName = InetAddress.getLocalHost().getHostName(); //verify address
        System.out.println(hostName);
        int port = 56787;
        try {
            sck = new Socket(IPAddress, port);
            read = new BufferedReader(new InputStreamReader(sck.getInputStream()));
            write = new PrintWriter(sck.getOutputStream(), true);
        } catch (UnknownHostException e) {
            System.err.println("Error at host " + hostName);
            System.exit(1);
        } catch (IOException e) {
            System.err.println("Can't connect at " + hostName);
            System.exit(1);
        }
        write.print("Connected user " + user + "\n");
        write.println("Host: " + hostName);
        write.flush();
        write.println();

        String inputLine;
        while ((inputLine = read.readLine()) != null) {
            System.out.println(inputLine);
        }
    }

    /**
     *
     * @param user
     * @param message
     * @throws UnknownHostException
     * @throws IOException
     */
    @Override
    public void insertData(String user, String message)
            throws UnknownHostException, IOException {
        write.print("User " + user + "Message " + message);
        write.flush();
    }
}
