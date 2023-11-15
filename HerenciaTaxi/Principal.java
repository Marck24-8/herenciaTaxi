
package HerenciaTaxi;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Principal {
    
     //-----atributos simples de la clase-----
    private Persona persona=new Persona();
    private Cliente cliente=new Cliente();
    private Conductor conductor=new Conductor();
    private Jefe jefe=new Jefe();
    private static int codigo;
    //------- atributos de los List y Array----
    private static List <Jefe> jefes=new ArrayList<Jefe>();
    private static Principal principal=new Principal();
    private static Scanner teclado=new Scanner(System.in);
    
    //----constructores----

    public Principal() {
    }

    //-----metodos para manejar datos----
    
    private void cargarJefe(){
        jefes.add(new Jefe("sitemas",15, "Luis", "Ruiz"));
        jefes.add(new Jefe("logistoca",65, "Mario", "Diaz"));
        jefes.add(new Jefe("contabilidad",1, "Lolo", "Lopez"));
        jefes.add(new Jefe("marketing",17, "Ana", "Mora"));
     
    }
    
    private void imprimirJefe(){
        int i=0;
       
        for(Jefe jefe: jefes ){
            i++;
            
            System.out.print ("registro ["+i+"]----> "+jefe.getCodigoJefe()+ "\t "+jefe.getAreaJefe());
            System.out.println("\t apellido: "+jefe.getApellido()); 
          
        }  
    }
   
    
    private void ingresarJefe(){
        String aux=new String("");
        int codigoJefe=45;
        String AreaJefe= "sistemas"; 
        String nombre="Mauricio";
        String Apellido="Lopez";
        System.out.println("Ingrese La jefatura ");
        System.out.print("ingrese el area: ");
        AreaJefe=teclado.nextLine();aux=teclado.nextLine();
        System.out.print("ingrese el codigo: ");
        codigoJefe=teclado.nextInt();
        System.out.print("ingrese el nombre: ");
        nombre=teclado.nextLine();aux=teclado.nextLine();
        System.out.print("ingrese el apellido: ");
        Apellido=teclado.nextLine();
        jefes.add(new Jefe(AreaJefe, codigoJefe, nombre, Apellido));
       
    } 
    
      public void buscarJefe(int codigo)
    {
        for(Jefe jefe : jefes){
            if(jefe.getCodigoJefe() == codigo){
                System.out.println("si coincide con el codigo "+ codigo + " = " + jefe.getCodigoJefe()+ " es "+ jefe.getApellido());
            }
            else{
                System.out.println("no coincide con el codigo "+ codigo + " = " + jefe.getCodigoJefe()+ "es "+ jefe.getApellido());
            }
                
        }
    }
      
     public static void modificarJefe(int id) {
            int i=0;
            String modificador=new String("") ;
            String aux=new String("");
            System.out.println("--------MODIFICANDO ---------");
            System.out.println("-----------------------------");
            for (Jefe jefe : jefes) {
                if(id == jefe.getCodigoJefe()){
                    System.out.println("si coincidela busqueda : [" + i + "]-----> " + codigo +" = " + jefe.getCodigoJefe() + " \t " + jefe.getApellido());
                    System.out.println("ingrese el jefe que va a modificar ");
                    aux=teclado.nextLine();
                    modificador=teclado.nextLine();
                    jefe.setApellido(modificador);
                    System.out.println("El registro ha sido modificado, imprima todos los registros y verifique modificacion ");
            }
                else{
                    System.out.println("no coinciode : " + id +" = " + jefe.getCodigoJefe() + " \t " + jefe.getApellido());
                }
            }
            System.out.println("----------------------------------------------------");
        }  
      
    
          public void eliminarJefe(int codigo)
    {
        try{
            jefes.remove(codigo);
        }
        catch(Exception ex)
        {
            System.out.println("error en borrado de la lista ");
            System.out.println("seguramento no existe al borrarse "+ ex.getMessage());
        }
         }
    
      
    public static void main(String[] args) {
        
        int opc=0;
        int buscador=0;
        String id;
        while (opc!=7) {            
              System.out.println("Taxi jefaturas");
              System.out.println("-------------------------------");
              System.out.println("");
              System.out.println("1.- cargar jefaturas");
              System.out.println("2.- impirmir jefe");
              System.out.println("3.- ingresar jefe");
              System.out.println("4.- buscar ");
              System.out.println("5.- modificar ");
              System.out.println("6.- eliminar ");
              System.out.println("7.- salir ");
              System.out.println("--------------------------------");
              System.out.println("");
      
                System.out.print(" ingrese una opcion: ");
                opc=teclado.nextInt();
    
            switch (opc) {
                case 1: principal.cargarJefe();
                    break;
                    
                case 2: principal.imprimirJefe();
                    break;
                    
                case 3:principal.ingresarJefe();
                    break;
                    
               case 4:  
                        System.out.print("ingrese el codigo a buscar: ");
                        codigo=teclado.nextInt();
                        principal.buscarJefe(codigo);
                        break;  
                        
               case 5:  System.out.println("ingrese el numero de registro del List<Rol> a MODIFICARSE ");
                        System.out.println("imprimir el listado para observar ");
                        buscador=teclado.nextInt();
                        principal.modificarJefe(buscador);
                        break;
                   
               case 6:  System.out.print("ingrese el registro de la lista a eliminarse: ");
                        buscador=teclado.nextInt();
                        principal.eliminarJefe(buscador);
                        break;
                   
                 
                case 7: System.out.println(" usted eligio salir");
                    break;
                    
                    default: 
                     break;
            }
        
        }
  
    }
}
