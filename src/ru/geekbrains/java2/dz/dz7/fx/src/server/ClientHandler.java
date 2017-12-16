package server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.HashMap;

public class ClientHandler implements Runnable {
    private MyServer owner;
    private Socket s;
    private DataOutputStream out;
    private DataInputStream in;
    private String name;
    boolean authorized = false;
    long t1 = System.currentTimeMillis();


    public ClientHandler(Socket s, MyServer owner) {
        try {
            this.s = s;
            this.owner = owner;
            out = new DataOutputStream(s.getOutputStream());
            in = new DataInputStream(s.getInputStream());
            name = "";
        } catch (IOException e) {
        }
    }

    @Override
    public void run() {

        try {
            out.writeUTF("Здравствуйте, для авторизации наберите: auth login password" + System.lineSeparator() + "для помощи help");
            out.flush();
            new Thread(() ->
            {
                try {
                    Thread.sleep(120000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if (!authorized) {
                    try {
                        s.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }).start();
            while (true) {
                String w = in.readUTF();
                if (name.isEmpty()) {
                    String[] n = w.split("\t");
                    if ("auth".equalsIgnoreCase(n[0])) {
                        String t = authLoginPass(n[1], n[2]);
                        if (t != null) {
                            out.writeUTF("Авторизация успешная");
                            authorized = true;
                            owner.addClient(this);
                            out.flush();
                            name = t;
                            owner.setUserId(t, this);
                            owner.broadcastMsg("$ " + name + " присоединился к каналу");
                            break;
                        } else {
                            sendMsg("Auth Error");
                            owner.remove(this);
                            owner.removeId(name);


                        }
                        w = null;
                    }
                    if (w != null) {
                        n = w.split(" ");

                        if ("auth".equalsIgnoreCase(n[0])) {
                            String t = authLoginPass(n[1], n[2]);
                            if (t != null) {
                                out.writeUTF("Авторизация успешная");
                                owner.addClient(this);
                                out.flush();
                                name = t;
                                owner.setUserId(t, this);
                                owner.broadcastMsg("$ " + name + " присоединился к каналу");
                                break;
                            } else {
                                sendMsg("Auth Error");
                                owner.remove(this);
                                owner.removeId(name);

                            }
                            w = null;
                        }
                    }

                }
            }
            new Thread(() ->
            {
                while (true) {
                    try {
                        Thread.sleep(120000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    if (System.currentTimeMillis() - t1 > 900000)
                    {
                        try {
                            s.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }).start();
            while (true) {


                String w = in.readUTF();
                t1 = System.currentTimeMillis();
                if ("list".equalsIgnoreCase(w)) {
                    if ("root".equals(name)) {
                        out.writeUTF(owner.listRoot());
                        out.flush();
                        w = null;
                    } else {
                        out.writeUTF(owner.list());
                        out.flush();
                        w = null;
                    }
                }
                if ("help".equalsIgnoreCase(w)) {
                    out.writeUTF(owner.help());
                    out.flush();
                    w = null;
                }

                if ("whoami".equalsIgnoreCase(w)) {
                    out.writeUTF(name);
                    out.flush();
                    w = null;
                }

                if (w != null) {
                    if (w.indexOf("@") == 0) {
                        char[] wChar = new char[w.length()];
                        char[] login2 = new char[w.indexOf(' ') - 1];
                        char[] msg = new char[w.length() - w.indexOf(' ') - 1];
                        wChar = w.toCharArray();
                        System.arraycopy(wChar, 1, login2, 0, login2.length);
                        System.arraycopy(wChar, w.indexOf(' ') + 1, msg, 0, msg.length);
                        String s1 = new String(login2);
                        String s2 = new String(msg);
                        owner.sendPM(this.name, s1, s2);
                        w = null;
                    } else {
                        if (w.equalsIgnoreCase("END")) {
                            out.writeUTF("end session");
                            out.flush();
                            break;

                        }
                        owner.broadcastMsg(name + ": " + w);
                        System.out.println(name + ": " + w);

                    }
                }
                Thread.sleep(100);
            }
        } catch (IOException e) {
            System.out.println("Output Error");
        } catch (InterruptedException e) {
            System.out.println("Thread sleep error");
        }
        try {
            System.out.println("Client disconnected");
            if (!name.equals("")) {
                owner.remove(this);
                owner.removeId(name);
            }
            s.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void sendMsg(String msg) {
        try {
            out.writeUTF(msg);
            out.flush();
        } catch (IOException e) {
        }
    }

    public String authLoginPass(String login, String password) {
        if (owner.isLogin(login)) {
            if (owner.getAuth(login) == password.hashCode()) {
                owner.setUserId(login, this);
                return login;
            } else {
                return null;
            }
        }
        owner.setAuth(login, password);
        owner.setUserId(login, this);
        return login;

    }


}
