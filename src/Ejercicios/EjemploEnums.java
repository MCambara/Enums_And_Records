package Ejercicios;

public class EjemploEnums {
	
	enum Estado {
		ACTIVO("El usuario esta activo"), INACTIVO("El usuario esta inactivo"),SUSPENDIDO("El usuario esta suspendido");
		
		private String descripcion;
		
		Estado(String descripcion){
			this.descripcion = descripcion;
		}
		
		public String obtenerDescripcion() {
			return descripcion;
		}
		
	}

	public static void main(String[] args) {
		
		Estado estado = Estado.ACTIVO;
		System.out.println("Estado: " + estado);
		System.out.println("Descripcion: " + estado.obtenerDescripcion());

	}

}
