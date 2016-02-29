package Video;

import java.net.*;
import java.io.*;
import java.util.*;

public class TalkClient {
	public static void main(String[] args) {
		InputStream in=null;
		OutputStream out=null;
		String string=null;
		Scanner input=new Scanner(System.in);
		try {
			Socket s=new Socket("127.0.0.1",8888);
			in=s.getInputStream();
			out=s.getOutputStream();
			DataInputStream dis=new DataInputStream(in);
			DataOutputStream dos =new DataOutputStream(out);
			while(!string.equals("exit")){
				System.out.println(dis.readUTF());
				string=input.nextLine();
				dos.writeUTF(string);
			}
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
