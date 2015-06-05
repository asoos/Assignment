package com.endava.clientserver.client;

import java.io.IOException;
import java.net.UnknownHostException;

public interface ModelInterface {

    public void setUser(String user);

    public void setIPAddress(String IPAddress);

    public void StartServer() throws UnknownHostException, IOException;

    public void insertData(String user, String message) throws UnknownHostException, IOException;

}
