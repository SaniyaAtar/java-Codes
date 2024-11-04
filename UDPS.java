import java.io.*;
import java.net.*;
class UDPS
{
	public static void main(String[] args) {
			DatagramSocket socket=null;
			try{
				socket=new DatagramSocket(5000);
				byte[] buffer =new byte[1024];
				while(true){
					DatagramPacket packet= new DatagramPacket(buffer,buffer.length);
					socket.receive(packet);
					String receiveData=new  String (packet.getData(),0, packet.getLength());
					System.out.println("Receive Data : "+  receiveData);
					String responseData="Hello , Client";
					byte[] responseBytes=responseData.getBytes();
					DatagramPacket responsePacket=new DatagramPacket(responseBytes, responseBytes.length,packet.getAddress(),packet.getPort());
					socket.send(responsePacket);

				}
			}
				catch(SocketException e){
					e.printStackTrace();
				}
				catch(IOException e){
					e.printStackTrace();2
				}
				finally{
					if(socket!=null)
						socket.close();
				
			}
		}	
}