package edu.javacourse.net;

import java.io.*;
import java.net.Socket;

public class Client {

    public static void main(String[] args) throws IOException, InterruptedException {

        for (int i = 0; i < 8; i++) {
            new SimpleClient(i).start();
        }
    }
}

class SimpleClient extends Thread {

    private static final String[] COMMAND = {
            "HELLO", "MORNING", "DAY", "EVENING"
    };

    private int cmdNumber;

    public SimpleClient(int cmdNumber) {
        this.cmdNumber = cmdNumber;
    }

    @Override
    public void run() {

        try {
            Socket socket = new Socket("127.0.0.1", 25225);
//            System.out.println(String.format("Connected to server at %s.", LocalDateTime.now()));
            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

            String command = COMMAND[cmdNumber % COMMAND.length];
            String s = command + " " + "Alex";

            bw.write(s);
            bw.newLine();
            bw.flush();

            String answer = br.readLine();
            System.out.println(String.format("Client got string: %s", answer));

            br.close();
            bw.close();
//            System.out.println(String.format("Finished at %s.", LocalDateTime.now()));

        } catch (Exception ex) {
            ex.printStackTrace(System.out);
        }

    }
}
