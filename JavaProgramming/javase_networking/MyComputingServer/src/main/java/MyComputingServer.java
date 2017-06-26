import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class MyComputingServer {

	public static void main(String[] args) throws InvalidInputException {
		ServerSocket serverSocket = null;
		Socket socket;
		
		// Default port number
		int portnumber = 2020;
		
		try {
			serverSocket = new ServerSocket(portnumber);
		} catch(IOException ie){
			System.out.println("Cannot open socket." + ie);
			System.exit(1);
		}
		
		System.out.println("ServerSocket initialized: " + serverSocket);
		
		//NOT DOING: Keep connection open until told otherwise
		//while(true){
			
			try {
				// Listen for a connection to be made at
				// this socket and accept it. The method blocks
				// until such a connection is made.
				System.out.println("Waiting for a connection request...");
				socket = serverSocket.accept();
				
				System.out.println("Accepted connection request...");
				String host = socket.getInetAddress().getHostAddress();
				int port = socket.getPort();
				System.out.println("Client host: " + host + ", Client port: " + port);
				
				// Read data from the socket
				InputStream clientIn = socket.getInputStream();
				BufferedReader br = new BufferedReader(new InputStreamReader(clientIn));
				String msgFromClient = br.readLine();
				System.out.println("Message received from client = " + msgFromClient);
				
				// Accept data of this form: "x y"
				// Throw and exception for anything else
				String[] splitMessage = msgFromClient.split(" ");
				if(splitMessage.length != 2){
					throw new InvalidInputException();
				}
				
				// Compute the sum of the two numbers
				int result = 0;
				for (String string : splitMessage) {
					result += Integer.parseInt(string);
				}
				
				// Send response to the socket
				OutputStream clientOut = socket.getOutputStream();
				PrintWriter pw = new PrintWriter(clientOut, true);
				pw.println(result);
				
				// Close sockets (NOT DOING: and exit loop)
				//if(){
					serverSocket.close();
					socket.close();
				//	break;
				//}
				
			} catch(IOException ie){
			}
		}
	//}
}
