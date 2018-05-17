/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calc;

/**
 *
 * @author Hosanna
 */
import java.util.Scanner;

public class Calc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner tec = new Scanner (System.in);
      
      int opc,num,num1,result;
        
        System.out.println("MENU ");
       System.out.println("1. Suma ");
       
       System.out.println();
       
       System.out.println("Ingrese su seleccion =  ");
       opc = tec.nextInt();
       
       if(opc == 1){
           
           System.out.println("ingrese el primer numero ");
           num = tec.nextInt();
           
           System.out.println("ingrese el segundo numero ");
           num1 = tec.nextInt();
           
           result = num1 + num;
           
            System.out.println(result);
           
           
           
           
           
           
           
 }
       
       
       
    }
    
}
