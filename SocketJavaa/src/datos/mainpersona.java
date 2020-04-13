package datos;

public class mainpersona {
	public mainpersona() {
		
	}

	public static void main(String[] args) {
		persona persona1=new persona();
		persona1.setIdentificacion(1121960526);
		persona1.setNombre("camila");
		System.out.println(persona1);
		System.out.println(persona1.getIdentificacion());
		
	}

}
