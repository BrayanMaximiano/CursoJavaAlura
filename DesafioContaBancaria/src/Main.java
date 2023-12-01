import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String name = "Brayan Maximiano";
        double saldo = 1320.34;
        String tipoDeConta = "corrente";
        int option = 0;

        System.out.println("Olá " + name + ", Seja bem-vindo a sua conta bancária") ;
        System.out.println("************************");
        System.out.println("Saldo : R$" + saldo);
        System.out.println("Tipo de conta: " + tipoDeConta);
        System.out.println("\n************************");

        String menu = """
                Digite sua opção:
                
                1- Exibir Saldo
                2- Fazer pix
                3- Receber pix
                4- Sair
                """;
        Scanner leitura = new Scanner(System.in);

        while(option != 4){
            System.out.println(menu);
            option = leitura.nextInt();
            if(option == 1){
                System.out.println("Seu saldo atual é de : R$" + saldo);

            } else if (option == 2) {
                System.out.println("Qual valor voçe vai tranferir? ");
                double valor = leitura.nextDouble();
                saldo = saldo - valor;

                System.out.println("transferencia realizada!");
                System.out.println("Seu saldo agora é de R$" + saldo );
            } else if (option == 3) {
                System.out.println("Qual valor voce vai receber? ");
                double recebe = leitura.nextDouble();
                saldo = saldo + recebe;

                System.out.println("transferencia realizada!");
                System.out.println("Seu saldo agora é de R$" + saldo );

            }
        }
    }
}