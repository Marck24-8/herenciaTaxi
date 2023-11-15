
package HerenciaTaxi;

//---- primera clase hija---
public class Jefe extends Persona  {
    //----atributos-----
    private String AreaJefe;
    private int codigoJefe;
    
    //------- metodos-------

    public Jefe() {
    }

    public Jefe(String AreaJefe, int codigoJefe) {
        this.AreaJefe = AreaJefe;
        this.codigoJefe = codigoJefe;
    }

    public Jefe(String AreaJefe, int codigoJefe, String nombre, String Apellido) {
        super(nombre, Apellido);
        this.AreaJefe = AreaJefe;
        this.codigoJefe = codigoJefe;
    }
   //------getter & setter--------

    public String getAreaJefe() {
        return AreaJefe;
    }

    public void setAreaJefe(String AreaJefe) {
        this.AreaJefe = AreaJefe;
    }

    public int getCodigoJefe() {
        return codigoJefe;
    }

    public void setCodigoJefe(int codigoJefe) {
        this.codigoJefe = codigoJefe;
    }
    
    
 
}
