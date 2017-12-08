package ru.geekbrains.java2.dz.dz6.server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class ClientHandler implements Runnable {
    private Socket s;
    private DataOutputStream out;
    private DataInputStream in;
    private Scanner sc = new Scanner(System.in);
    private static int CLIENTS_COUNT = 0;
    private String name;

    public ClientHandler(Socket s) {
        try {
            this.s = s;
            out = new DataOutputStream(s.getOutputStream());
            in = new DataInputStream(s.getInputStream());
            CLIENTS_COUNT++;
            name = "Client #" + CLIENTS_COUNT;
            out.writeUTF("Добро пажаловать в секретный хакерский чат\nПожалуйста авторизируйтесь:\nlogin:password");
            out.flush();
        } catch (IOException e) {
        }
    }

    @Override
    public void run() {
        new Thread(() -> {
            Thread outConsole = new Thread(() -> {
                try {
                    while (true) {
                        if (sc.hasNext()) {
                            String a = sc.nextLine();
                            out.writeUTF(a);
                            out.flush();
                        }
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }

            });
            outConsole.setDaemon(true);
            outConsole.start();

            String[] name2 = new String[2];
            String hName = "";
            boolean auth = false;
            try {
                while (true) {
                    String w = in.readUTF();
                    System.out.println(name + ": " + w);
                    if (!auth) {
                        name2 = w.split(":");
                        auth = true;
                        hName = name2[0];
                        out.writeUTF("Здравствуйте " + hName);
                        out.flush();
                    } else {
                        if (w.equalsIgnoreCase("END")) {
                            out.writeUTF("end session");
                            out.flush();
                            break;
                        }
                        out.writeUTF(hName + ">echo: " + w);
                        out.flush();
                    }
                                    }
            } catch (IOException e) {
                e.printStackTrace();
            }

            // outConsole.stop();
            try {
                System.out.println("Client disconnected");
                s.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }).start();
    }
}
