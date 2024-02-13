
public class Persona {

  String nombre;
  String apellidos;
  int edad;
  
  public Persona(String nombre, String apellidos, int edad) {
    this.nombre = nombre;
    this.apellidos = apellidos;
    this.edad = edad;
  }
  
  public void cumpleaños() {
    edad += 1;
    System.out.println(edad);
  }
  
}
