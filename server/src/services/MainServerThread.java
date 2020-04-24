package services;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class MainServerThread {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		ServerSocket ss = new ServerSocket(1234);
		System.out.println("Server> running");

		int idClient = 0;

		while(true) {

			try {
				Socket s = new Socket();
				s = ss.accept();
				ServerThread serverThread = new ServerThread(s, idClient);
				serverThread.start();

				idClient ++;
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}

}