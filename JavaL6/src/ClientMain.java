import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class ClientMain {
    static DataInputStream in;
    static DataOutputStream out;
    static String msg;
    static Scanner sc;
    final static String SERVER_IP ="localhost";
    final static int SERVER_PORT = 8189;
    static Socket socket;
    public static void main(String[] args) {
        try {
            socket = new Socket(SERVER_IP, SERVER_PORT);
            in = new DataInputStream(socket.getInputStream());
            out = new DataOutputStream(socket.getOutputStream());
            System.out.println("Соединение с сервером установленно");
        } catch (IOException e) {
            e.printStackTrace();
        }
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    while (true){
                        System.out.println(in.readUTF());
                    }
                } catch (IOException e){
                    e.printStackTrace();
                }
            }
        }).start();
        try {
            while(true) {
                sc = new Scanner(System.in);
                msg = sc.nextLine();
                out.writeUTF(msg);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
