import java.util.Random;
import java.util.Scanner;

public class Adivinhacao {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int resposta = new Random().nextInt(100);
        int tentativa = 5;
        System.out.println(resposta);



        while (tentativa > 0){
            System.out.println("Tente adivinhar o número que estou pensando: ");
            int chute = leitura.nextInt();
            if (chute == resposta){
                System.out.println("Parabéns voçe acertou !");
                tentativa = 0;
            }else {
                System.out.println("Voçe errou, lhe faltam " + (tentativa-1) + " tentativas");
                tentativa --;
            }
        }
    }
}
