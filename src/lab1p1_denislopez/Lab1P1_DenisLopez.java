/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab1p1_denislopez;
import java.util.Scanner;
/**
 *
 * @author djlop
 */
public class Lab1P1_DenisLopez {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println("Hello World");
        Scanner leer = new Scanner(System.in);
        int opcion = 0;
        
        while(opcion != 3){
            System.out.println("MENU DE EJERCICIOS");
            System.out.println("1. Division Modificada");
            System.out.println("2. SALIR");
            System.out.println("Seleccione una opcion");
            opcion = leer.nextInt();
            
            // Opcion 1: Division Modificada
            if (opcion==1){
                 System.out.println("Ingrese dividiendo : "); 
                 int dividiendo = leer.nextInt();
                 
                 System.out.println("Ingrese divisor : "); 
                 int divisor = leer.nextInt();
                 
                 int cociente = 0;
                 int residuo=dividiendo;
                 
                 while (residuo>=divisor){
                     residuo = residuo - divisor;
                     // Es lo mismo que usar cociente++
                     cociente = cociente + 1;
                 }
                 
                 if (residuo==0){
                     System.out.println("El resultado de la division en " + cociente);
                 }else{
                     System.out.println("El resultado de la divison es " + cociente + "con un residuo de " + residuo);
                 }
                 
            }
            if (opcion==2){
                System.out.println("Ingrese cantidad de numeros: ");
                int n = leer.nextInt();
                int a=0;
                int b=1;
                int c=0;
                int contador = 0;
                if(contador==0){
                    while(contador<n+2){
                        if (contador==0){
                            System.out.println("0");
                        }
                        
                        if(contador==1){
                            System.out.print("1");
                        }
                        
                        if(contador>1){
                            c=a+b+1;
                            System.out.println(c);
                            a=b;
                            b=c;
                            c=0;
                        }    
                    }
                    contador = contador+1;
                }
            }
            
            if (opcion == 3){
                System.out.println("saliendo del programa");
            }
        }
    }
}
