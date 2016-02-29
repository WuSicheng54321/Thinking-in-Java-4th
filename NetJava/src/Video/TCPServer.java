package Video;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {
	public static void main(String[] args) {
		try {
			ServerSocket ss=new ServerSocket(6666);
			while(true){
				Socket s=ss.accept();
				DataInputStream dis=new DataInputStream(s.getInputStream());
				System.out.println(dis.readUTF());
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
