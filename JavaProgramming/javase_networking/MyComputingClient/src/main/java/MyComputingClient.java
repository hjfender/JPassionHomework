import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;

public class MyComputingClient {

	public static void main(String[] args) {
		
		Socket client = null;
		
		// Default port number
		int portnumber = 2020;
		
		try {
			String msg = "";
			
			// Create a client socket
			client = new Socket(InetAddress.getLocalHost(), portnumber);
			System.out.println("Client socket is created " + client);
			
			// Create an output stream of the client socket
			// This is for sending messages to the server
			OutputStream clientOut = client.getOutputStream();
			PrintWriter pw = new PrintWriter(clientOut, true);
			
			// Create an input stream of the client socket
			// This is for receiving messages from the server
			InputStream clientIn = client.getInputStream();
			BufferedReader br = new BufferedReader(new InputStreamReader(clientIn));
			
			// Create BufferedReader for a standard input
			// This is so a user can type messages that will
			// get forwarded to the server
			System.out.print("Enter two numbers separated by a space: ");
			BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));
			
			msg = stdIn.readLine().trim();
			pw.println(msg);
			
			System.out.println("Message returned from the server = " + br.readLine());
			
			pw.close();
			br.close();
			client.close();
		} catch (IOException ie) {
			System.out.println("I/O error " + ie);
		}
	}
}
