package services;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

import data.Persona;


import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

import data.Persona;

public class Client {

	protected Socket s;

	private final int PORT = 1234;
	private final String HOST = "localhost";

	protected ObjectOutputStream oos;
    protected ObjectInputStream ois;

	public Client(){}

	public void onClient(int idClient) throws ClassNotFoundException {

		try {

			s = new Socket(HOST, PORT);

			oos = new ObjectOutputStream(s.getOutputStream());
	        ois = new ObjectInputStream(s.getInputStream());


			Persona persona = new Persona(idClient, "camila", 21, "f");

			System.out.println("Client> send object"+persona);

			oos.writeObject(persona);

			System.out.println(""+ois.readObject());

			ois.close();
			oos.close();
			s.close();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}