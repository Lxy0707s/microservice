package com.example.nettyclient.client;

import java.io.IOException;

public class TestClient {
    public static void main(String[] args) throws IOException {
        new ChatClient().start("Netty Client");
    }
}