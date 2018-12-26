package yun.networkProgramming;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    private ServerSocket serverSocket;
    private Socket clientSocket;
    private DataInputStream dataInputStream;
    private DataOutputStream dataOutputStream;

    public void serverSetting(){
        //바인딩
        try {
            //localhost, 10002
            serverSocket = new ServerSocket(10002);
            //리슨, 어셉트
            clientSocket = serverSocket.accept();
            // 소켓이 접속 완료된 부분
            System.out.println("클라이언트 소켓 연결");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void closeAll(){
        try {
            serverSocket.close();
            clientSocket.close();
            dataOutputStream.close();
            dataInputStream.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    //output, input Stream
    public void streamSetting() {
        try {
            dataInputStream = new DataInputStream(clientSocket.getInputStream());
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            dataOutputStream = new DataOutputStream(clientSocket.getOutputStream());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String dataRecv(){
        try {
            return dataInputStream.readUTF();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
    public void dataSend(String sendData){
        try {
            dataOutputStream.writeUTF(sendData);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public Server(){
        serverSetting();
        streamSetting();
        System.out.println(dataRecv());
        dataSend("잘받았어요.");
    }

    public static void main(String[] args) {
        new Server();
    }
}
