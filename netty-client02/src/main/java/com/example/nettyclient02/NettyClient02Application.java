package com.example.nettyclient02;

import com.example.nettyclient02.client.ChatClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@SpringBootApplication
public class NettyClient02Application {

    public static void main(String[] args) throws IOException {
        new ChatClient().start("User002");
    }

}
