
package HerenciaTaxi;

// clase padre
public class Persona {
    //----atributos de la clase
    
    private String nombre;
    private String Apellido;

    
    //------ metodos-----
    
    public Persona() {
    }

    public Persona(String nombre, String Apellido) {
        this.nombre = nombre;
        this.Apellido = Apellido;
    }
    
    //----- getter & setter----

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }
 
}
