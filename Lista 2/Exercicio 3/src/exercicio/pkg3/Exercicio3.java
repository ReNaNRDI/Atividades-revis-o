/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio.pkg3;
import java.util.Scanner;

public class Exercicio3 {

  
      public static void main(String[] args) {
      Scanner ler = new Scanner(System.in);
      
        System.out.println("Digite uma palvra");
        String palavra = ler.nextLine();
        
        String palavraInv = new StringBuilder(palavra).reverse().toString();
        
        System.out.println("palavra invertida: " + palavraInv);
        
        
        ler.close();
    }
}