import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero,fibonnaci1,fibonacci2,i;
  
        do{
            System.out.print("Introduce numero mayor que 1: ");
            numero = sc.nextInt();
               }while(numero<=0);
        System.out.println("Los " + numero + " primeros términos de la serie de Fibonacci son:");                 

        fibonacci1=0;
        fibonacci2=0;
        
        }while(numero<=1);
        System.out.println("Los " + numero + " primeros términos de la serie de Fibonacci son:");                 
        fibonacci1=1;
        fibonacci2=1;
        System.out.print(fibonnaci1 + " ");
        for(i=2;i<=numero;i++)
            System.out.print(fibonacci2 + " ");
            fibo2 = fibonnaci1 + fibonacci2;
            fibo1 = fibonacci2 - fibonnaci1;
        
        System.out.println();
    }
}
}