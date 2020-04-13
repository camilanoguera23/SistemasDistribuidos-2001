package services;



import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import data.Persona;


public class Client extends Connection
{

	public Client() throws IOException {
		super("Client");
		
	}
	public void onClient(String client)throws ClassNotFoundException {
		
		try {
		Persona persona=new Persona(1121960526,"camila",21,"F");
		
		System.out.println(persona);
		ois= new ObjectInputStream(s.getInputStream());
		oos= new ObjectOutputStream(s.getOutputStream());
		
		oos.writeObject(persona);
		System.out.println(ois.readObject());
		
		ois.close();
		oos.close();
		
		}catch (Exception e) {
		System.out.println(e.getMessage());
	

		
		}

}
}