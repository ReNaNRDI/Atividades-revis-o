      
package exercicio.pkg6;
import java.util.Scanner;
        
public class CapitalizacaoDenomes {
    
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        
        System.out.println("Digite seu nome completo:");
        String nomeCompleto = ler.nextLine();
        
        
       String nomeFormatado = CapitalizacaoDenomes(nomeCompleto);
       
        System.out.println("nome formatado: " + nomeFormatado);
       
        ler.close();
       
    }
    public static String CapitalizacaoDenomes ( String nome) {
        String[] palavras = nome.trim().split("\\s+");
        
        
        StringBuilder nomeFormatado = new StringBuilder();
        
        
        for (String palavra : palavras){
            nomeFormatado.append(palavra.substring(0,1).toUpperCase())
            .append(palavra.substring(1).toLowerCase())
       .append("");
        }
        
        return nomeFormatado.toString().trim();
    }
}
