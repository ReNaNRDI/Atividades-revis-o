package exercicio.pkg9;

import java.util.Scanner;

public class Exercicio9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite uma frase com espaços extras: ");
        String frase = scanner.nextLine();
        
        String fraseFormatada = removerEspacosExtras(frase);
        
        System.out.println("Frase formatada: " + fraseFormatada);
        
        scanner.close();
    }

    public static String removerEspacosExtras(String frase) {
        return frase.trim().replaceAll("\\s+", " ");
    }
}
