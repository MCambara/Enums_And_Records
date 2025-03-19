package Ejercicios;

public class EjemploRecords {

	public static void main(String[] args) {
		Cuenta c = new Cuenta("admin","root",true);
		
		System.out.println(c.identificador() + "\n");
		
		System.out.println(c.toString() + "\n");
		
		System.out.println(c.tienePrivilegios() + "\n");

	}

}
