/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package execicio.pkg7;

import java.util.Scanner;
public class Execicio7 {

   public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

    
        System.out.println("Digite o seu endereço de email:");
        String email = ler.nextLine();


        String dominio = extrairDominio(email);


        if (dominio != null) {
        
            System.out.println("O domínio do seu email é: " + dominio);
        } else {
  
            System.out.println("O endereço de email fornecido não é válido.");
        }


        ler.close();
    }

  
    public static String extrairDominio(String email) {
   
        int posicaoArroba = email.indexOf('@');

  
        if (posicaoArroba != -1 && posicaoArroba < email.length() - 1) {
            
            return email.substring(posicaoArroba + 1);
        }


        return null;
    }
}