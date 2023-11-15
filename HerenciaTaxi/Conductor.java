
package HerenciaTaxi;

//------ segunda clase hija
public class Conductor extends Persona{
    //---------atributos-----
    private String codigoConductor;
    private String autoConductor;
    
    //------metodos-----

    public Conductor() {
    }

    public Conductor(String codigoConductor, String autoConductor) {
        this.codigoConductor = codigoConductor;
        this.autoConductor = autoConductor;
    }

    public Conductor(String codigoConductor, String autoConductor, String nombre, String Apellido) {
        super(nombre, Apellido);
        this.codigoConductor = codigoConductor;
        this.autoConductor = autoConductor;
    }
    
    // ---getter & setter ------

    public String getCodigoConductor() {
        return codigoConductor;
    }

    public void setCodigoConductor(String codigoConductor) {
        this.codigoConductor = codigoConductor;
    }

    public String getAutoConductor() {
        return autoConductor;
    }

    public void setAutoConductor(String autoConductor) {
        this.autoConductor = autoConductor;
    }

}
