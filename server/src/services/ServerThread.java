package services;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

import data.Persona;

public class ServerThread extends Thread {

	private Socket s;
	protected ObjectInputStream ois;
	protected ObjectOutputStream oos;
	
	public ServerThread() throws IOException {
		ois= new ObjectInputStream(s.getInputStream());
		oos= new ObjectOutputStream(s.getOutputStream());
		
	}
	@Override
	public void run() {
		
		try {
			Persona persona= new Persona();
			persona=(Persona)ois.readObject();
			
			System.out.println(persona);
			oos.writeObject("Procesando");
					
	} catch (IOException e) {
		
		System.out.println("SERVER>"+e.getMessage());
	}

	}

}
