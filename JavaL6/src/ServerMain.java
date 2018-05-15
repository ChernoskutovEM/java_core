import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerMain {
    static DataInputStream in;
    static DataOutputStream out;
    static String msg;
    static String outMsg;

    public static void main(String[] args) {
        ServerSocket serverSocket = null;
        try {
            serverSocket = new ServerSocket(8189);
            System.out.println("Server work");
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            Socket socket = serverSocket.accept();
            System.out.println("Client connect");
            in = new DataInputStream(socket.getInputStream());
            out = new DataOutputStream(socket.getOutputStream());
        } catch (IOException e) {
            e.getStackTrace();
        }
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    while (true){
                        outMsg = new Scanner(System.in).nextLine();
                        out.writeUTF(outMsg);
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }).start();
        try {
            while (true) {
                msg = in.readUTF();
                System.out.println(msg);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
