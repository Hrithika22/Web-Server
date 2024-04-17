import java.net.ServerSocket;
import java.util.function.Consumer;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;

public class Server {
    public Consumer<Socket> getConsumer() {
        // return new Consumer<Socket>(){
        // @Override
        // public void accept(Socket clientSocket){
        // try{
        // PrintWriter toClient = new PrintWriter(clientSocket.getOutputStream());
        // toClient.println("Hello from the server");
        // toClient.close();
        // clientSocket.close();
        // }catch(IOException ex){
        // ex.printStackTrace();
        // }
        // }
        // };
        return (clientSocket) -> {
            try {
                PrintWriter toClient = new PrintWriter(clientSocket.getOutputStream());
                toClient.println("Hello from the server");
                toClient.close();
                clientSocket.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        };
    }

    public static void main(String[] args) {
        int port = 8010;
        Server server = new Server();
        try {
            ServerSocket serverSocket = new ServerSocket(port);
            serverSocket.setSoTimeout(10000);// 10000 millisecond = 10sec
            System.out.println("Server is Listening on port" + port);
            while (true) {
                Socket clientSocket = serverSocket.accept();
                Thread thread = new Thread(() -> server.getConsumer().accept(clientSocket));
                thread.start();
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
