package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Main2 { //клиент
    public static void main(String[] args) throws IOException {

        try (Socket clientSocket = new Socket("127.0.0.1", 8085);
             PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
             BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()))) {
            out.println("Анна А.");
            String response = in.readLine();
            System.out.println(response);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
