import java.util.Scanner;

public class ContagemDePalavras {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
     
        System.out.println("Digite uma frase:");
        String frase = ler.nextLine();
        
        if (frase.trim().isEmpty()) {
            System.out.println("Você não digitou nenhuma palavra!");
        } else {
       
            String[] palavras = frase.trim().split("\\s+");
            

                int numeroDePalavras = palavras.length;
                
            System.out.println("Número de palavras na frase: " + numeroDePalavras);
        }
       ler.close(); 
    }
}
    