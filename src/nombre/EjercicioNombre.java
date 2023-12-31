package nombre;


public class EjercicioNombre {

 
   
        public static void main(String[]args){
   String nombre="ZAID"
           ;
           
    String apellido="FARINANGO";
    
    
    
 
    
   System.out.println(" Su nombre: " +nombre); 
         System.out.println("Su   nombre tiene : "  +nombre.length()+"   letras   ");
      System.out.println("la primer letra  de su  nombre  es:   " +nombre.charAt(0));
        int letra_ultima;
      letra_ultima=nombre.length();
      
      System.out.println("La  ultima letra de su nombre " +nombre +"es: " +nombre.charAt(letra_ultima -1));        
   
      
        
        System.out.println("Su Apellido es :"+apellido);
        System.out.println("Su Aplellido tiene : "+apellido.length()+" letra");
        int ult;
        ult=apellido.length();

        System.out.println("Ultima  letra de su  apellido es: " +apellido.charAt(ult-1));
        
        
        }
}          
        
        
 
