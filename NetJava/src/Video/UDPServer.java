package Video;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UDPServer {
	public static void main(String[] args) {
		byte[] buf = new byte[100];
		DatagramPacket dp=new DatagramPacket(buf, buf.length);
		try {
			DatagramSocket ds=new DatagramSocket(9999);
			while(true){
				ds.receive(dp);
				ByteArrayInputStream bis=new ByteArrayInputStream(buf);
				DataInputStream dis=new DataInputStream(bis);
			long l=(long)	dis.read(buf);
				
				System.out.println(dis.readLong());
			}
		} catch (SocketException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
