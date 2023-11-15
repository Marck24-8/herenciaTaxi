
package HerenciaTaxi;

//------tercera clase hija---
public class Cliente extends Persona {
    //---------atributos------
    private String codigoCliente;
    private String tipoCliente;
    
    //---------metodos----

    public Cliente() {
    }

    public Cliente(String codigoCliente, String tipoCliente) {
        this.codigoCliente = codigoCliente;
        this.tipoCliente = tipoCliente;
    }

    public Cliente(String codigoCliente, String tipoCliente, String nombre, String Apellido) {
        super(nombre, Apellido);
        this.codigoCliente = codigoCliente;
        this.tipoCliente = tipoCliente;
    }
    
    //-------getters & setter

    public String getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(String codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    public String getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(String tipoCliente) {
        this.tipoCliente = tipoCliente;
    }
  
}
