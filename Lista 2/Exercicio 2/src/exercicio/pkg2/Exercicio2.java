/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio.pkg2;
import java.util.Scanner;

public class Exercicio2 {

       public static void main(String[] args) {
      Scanner ler = new Scanner(System.in);

        System.out.println("Digiter uma frase:");
        String frase = ler.nextLine();
        
       String fraseMod = frase.replace('a','*');
       
       
        System.out.println("Frase modificada:" + fraseMod);
        
        ler.close();
    }
}