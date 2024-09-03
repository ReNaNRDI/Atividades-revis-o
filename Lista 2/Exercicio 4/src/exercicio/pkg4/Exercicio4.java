/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio.pkg4;

import java.util.Scanner;
public class Exercicio4 {


    public static void main(String[] args) {
      Scanner ler = new Scanner(System.in);
      
        System.out.println("Digite uma palvra");
        String palavra = ler.nextLine();
        
       String palavraLimpa = palavra.replace("\\s","").toLowerCase();
       
       String palavrainvert = new StringBuilder(palavraLimpa).reverse().toString();

       if (palavraLimpa.equals(palavrainvert)){
           System.out.println("A palavra é um palíndromo");
       }else{
           System.out.println("A palavra não é um palindromo");
       }
        ler.close();
    }
}