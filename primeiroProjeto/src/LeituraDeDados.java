import java.util.Scanner;

public class LeituraDeDados {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite seu filme favorito: ");
        String filme = leitura.nextLine();



        System.out.println("Qual é o ano de lançamento? ");
        int anoDeLancamento = leitura.nextInt();

        System.out.println("Qual nota voçe da para o filme ");
        double avaliacao = leitura.nextDouble();

        System.out.println("O seu filme favorito é " + filme +  "O filme foi lançado em " +
                anoDeLancamento + "A nota do filme é " + avaliacao);

    }
}
