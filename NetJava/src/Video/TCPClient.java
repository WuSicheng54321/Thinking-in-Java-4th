package Video;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class TCPClient {
	public static void main(String[] args) {
		try {
			Socket s=new Socket("127.0.0.1", 6666);
			DataOutputStream dos=new DataOutputStream(s.getOutputStream());
			dos.writeUTF("hello server!");
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
