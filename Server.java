<<<<<<< HEAD
// import java.util.*;
// import java.net.*;
// import java.io.*;
// class Server{
// 	public static void main(String[] args) throws Exception {
// 		ServerSocket ss=new ServerSocket(12345);
// 		Socket s=ss.accept();
// 		DataInputStream din=new DataInputStream(s.getInputStream());
// 		DataOutputStream dout=new DataOutputStream(s.getOutputStream());
// 		Scanner sc=new Scanner(System.in);
// 		String str="";
// 		while(!(str.equals("bye")))
// 		{
// 			System.out.println("Client says:" +din.readUTF());
// 			str=sc.nextLine();
// 			// dout.writeUTF(str);
// 		}
// 	}
// }
=======
import java.util.*;
import java.net.*;
import java.io.*;
class Server{
	public static void main(String[] args) throws Exception {
		ServerSocket ss=new ServerSocket(12345);
		Socket s=ss.accept();
		DataInputStream din=new DataInputStream(s.getInputStream());
		DataOutputStream dout=new DataOutputStream(s.getOutputStream());
		Scanner sc=new Scanner(System.in);
		String str="";
		while(!(str.equals("bye")))
		{
			System.out.println("Client says:" +din.readUTF());
			str=sc.nextLine();
			dout.writeUTF(str);
		}
	}
}
>>>>>>> 04e28436a46a7e336660124363d5812d8bbf35f3
