
package tareaenclase;

import java.util.Scanner;

public class Tareaenclase {
    
public static Scanner s = new Scanner (System.in);

    public static void main(String[] args) {
        
      
        int decision = 0;
        
        System.out.println("Ingrese que operacion desea usar");
        System.out.println("1. Factorial");
        System.out.println("2. Tabla de multiplicar");
        decision = s.nextInt();
        
       
        switch (decision){
            
            case 1:
          
              Numero s  = new Numero();
               Ustedquiera ();
            int auxiliar = valor;
                 System.out.println("Su valor es " + Numero.Numero(valor));
                 
           
                break;



                
            case 2: 
                int i = 0;
                
                System.out.println("Tabla de multiplicar del: " + i + "--------");
               
                break;
        }
       

  }

    public static void Ustedquiera(){
            System.out.println("Ingrese su valor");
            int valor = s.nextInt();
        }
    
}
