package yun.networkProgramming.webserver;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by cjswo9207u@gmail.com on 2018-12-27
 * Github : https://github.com/YeoHoonYun
 */
public class WebServer {
    public static void main(String[] args) throws IOException {
        ServerSocket listener = new ServerSocket(8080);
        try {
            System.out.println("Http Server started at 8080 port");
            while (true) {
                Socket socket = listener.accept();
                try {
                    System.out.printf("New Client Connect! Connected IP : %s, Port : %d\n",
                            socket.getInetAddress(), socket.getPort());

                    OutputStream out = socket.getOutputStream();

                    DataOutputStream dos = new DataOutputStream(out);
                    byte[] body = "Hello World".getBytes();

                    dos.writeBytes("HTTP/1.1 200 OK \r\n");
                    dos.writeBytes("Content-Type: text/html;charset=utf-8\r\n");
                    dos.writeBytes("Content-Length: " + body.length + "\r\n");
                    dos.writeBytes("\r\n");

                    dos.write(body, 0, body.length);
                    dos.writeBytes("\r\n");
                    dos.flush();
                } finally {
                    socket.close();
                }
            }
        } finally {
            listener.close();
        }
    }

}
