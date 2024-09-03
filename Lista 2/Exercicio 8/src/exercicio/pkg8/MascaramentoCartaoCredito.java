package exercicio.pkg8;

import java.util.Scanner;

public class MascaramentoCartaoCredito {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o número do seu cartão de crédito:");
        String numeroCartao = ler.nextLine();
        String cartaoMascarado = mascararCartao(numeroCartao);
        System.out.println("Número do cartão mascarado: " + cartaoMascarado);
        ler.close();
    }

    public static String mascararCartao(String numeroCartao) {
        if (numeroCartao.length() < 4) {
            return "Número do cartão inválido!";
        }
        String ultimosQuatroDigitos = numeroCartao.substring(numeroCartao.length() - 4);
        StringBuilder mascara = new StringBuilder();
        for (int i = 0; i < numeroCartao.length() - 4; i++) {
            mascara.append("*");
        }
        return mascara.toString() + ultimosQuatroDigitos;
    }
}
