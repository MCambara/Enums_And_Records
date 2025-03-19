package Ejercicios;

public record Cuenta(String nombre, String clave, boolean privilegiada) {

    // Constructor alternativo (sobrecarga)
    public Cuenta(String nombre, String clave) {
        this(nombre, clave, false);
    }

    // Método para generar identificador
    public String identificador() {
        return "@" + nombre;
    }

    // Método corregido para evitar error
    public String tienePrivilegios() {
        return this.privilegiada ? "Tiene privilegios" : "Es regular";
    }
}

