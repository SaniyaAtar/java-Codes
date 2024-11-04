import java.util.*;
import java.net.*;
import java.io.*;
class Client{
	public static void main(String[] args)throws Exception{
		Socket s=new Socket("localhost",12345);
		DataInputStream din=new DataInputStream(s.getInputStream());
		DataOutputStream dout=new DataOutputStream(s.getOutputStream());
		Scanner sc=new Scanner(System.in);
		String str="";
		while(!(str.equals("bye")))
		{
			
			dout.writeUTF(str);
			str=sc.nextLine();
			System.out.println("Server says:" +din.readUTF());
		}
	}
}