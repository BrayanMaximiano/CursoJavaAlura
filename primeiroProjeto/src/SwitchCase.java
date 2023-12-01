public class SwitchCase {
    public static void main(String[] args) {
        int dia = 3;
        String nomeDia;

        switch (dia) {
            case 1:
                nomeDia = "Segunda-Feira";
                break;
            case 2:
                nomeDia = "Terça-Feira";
                break;
            case 3:
                nomeDia = "Quarta-Feira";
                break;
            case 4:
                nomeDia = "Quinta-Feira";
                break;
            case 5:
                nomeDia = "Sexta-feira";
                break;
            default:
                nomeDia = "Dia inválido";

        }
        System.out.println("Hoje é " + nomeDia);
    }
}
