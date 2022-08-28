package com.example.nettyclient;

import com.example.nettyclient.client.ChatClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@SpringBootApplication
public class NettyClientApplication {

    public static void main(String[] args) throws IOException {
        new ChatClient().start("User001");
    }

}
