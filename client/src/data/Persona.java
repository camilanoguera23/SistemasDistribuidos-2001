package data;

public class Persona {
	private int identificacion;
	private String nombre;
	private int edad;
	public Persona(int identificacion, String nombre, int i, String sexo) {
		super();
		this.identificacion = identificacion;
		this.nombre = nombre;
		this.edad = i;
		this.sexo = sexo;
	}
	private String sexo;
	public int getIdentificacion() {
		return identificacion;
	}
	public void setIdentificacion(int identificacion) {
		this.identificacion = identificacion;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

}
