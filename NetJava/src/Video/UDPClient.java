package Video;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.net.SocketException;

public class UDPClient {
	public static void main(String[] args) {
		long l=1000L;
		ByteArrayOutputStream bao=new ByteArrayOutputStream();
		DataOutputStream dos=new DataOutputStream(bao);
		try {
			dos.writeLong(l);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		byte[] buf=bao.toByteArray();
		DatagramPacket dp=new DatagramPacket(buf, buf.length	, new InetSocketAddress(
				"127.0.0.1", 9999));
		try {
			DatagramSocket ds=new DatagramSocket(1234);
			ds.send(dp);
			ds.close();
		} catch (SocketException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
