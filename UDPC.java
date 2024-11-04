import java.net.*;
import java.io.*;
class UDPC{
	public static void main(String[] args) {
		DatagramSocket socket=null;
		try{
			socket =new DatagramSocket();
			String serverAddress="localhost";
			int serverPort=5000;
			String requestData="Hello , server";
			byte[] requestBytes=requestData.getBytes();
			DatagramPacket requestPacket=new DataPacket(requestBytes,requestBytes.length,IPAddress.getByName(serverAddress),serverPort);
			socket.send(requestPacket);
			byte[] buffer=new byte[1024];
			DatagramPacket responsePacket=new DatagramPacket(buffer,buffer.length);
			socket.receive(responsePacket);
			
		}
	}
}