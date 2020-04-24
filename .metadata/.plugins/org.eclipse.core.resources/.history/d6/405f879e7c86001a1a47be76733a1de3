package services;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

import data.Persona;

public class ServerThread extends Thread{

	protected Socket s;
	protected ObjectInputStream ois;
	protected ObjectOutputStream oos;

	private int idClient;

	public ServerThread(Socket s, int idClient){
		this.s = s;
		this.idClient = idClient;
		try {
			ois = new ObjectInputStream(s.getInputStream());
			oos = new ObjectOutputStream(s.getOutputStream());
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void run() {
		do {
			Persona persona = new Persona();
			try {

				persona = (Persona)ois.readObject();
				System.out.println(persona);

				oos.writeObject("Server> Persona");

			} catch (Exception e) {
				System.out.println("Server> "+e.getMessage());
				break;
			}		
		}while(true);
		try {
			s.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}