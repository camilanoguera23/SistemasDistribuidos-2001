package datos;

public class persona {
	
	private int identificacion, edad;
	private String Sexo, Nombre;
	

	@Override
	public String toString() {
		return "persona [identificacion=" + identificacion + ", edad=" + edad + ", Sexo=" + Sexo + ", Nombre=" + Nombre
				+ "]";
	}


	public persona(){
	 
	  
		
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}


	public int getIdentificacion() {
		return identificacion;
	}


	public void setIdentificacion(int identificacion) {
		this.identificacion = identificacion;
	}


	public String getNombre() {
		return Nombre;
	}


	public void setNombre(String nombre) {
		Nombre = nombre;
	}


	public String getSexo() {
		return Sexo;
	}


	public void setSexo(String sexo) {
		Sexo = sexo;
	}
			

}
