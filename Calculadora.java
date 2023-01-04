import java.util.Scanner;

public class Calculadora {

    public static Double adicao(Double numero1, Double numero2) {
        return numero1 + numero2;
    }

    public static Double subtracao(Double numero1, Double numero2) {
        return numero1 - numero2;
    }

    public static Double multiplicacao(Double numero1, Double numero2) {
        return numero1 * numero2;
    }

    public static Double divisao(Double numero1, Double numero2) {
        return numero1 / numero2;
    }

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Seja bem vindo a Calculadora JAVA");
        System.out.println("Quais operações deseja resolver?\nSelecione uma opção abaixo");
        System.out.println("\n[1] Adição \n[2] Subtração \n[3] Multiplicação \n[4] Divisão \n[0] Sair  ");
        int opcao = leitor.nextInt();
        String numero1, numero2;

        switch (opcao) {
            case 1:
                 System.out.println("Você selecionou a adição! \nInforme agora os números que deseja somar: ");    
                numero1 = leitor.next();
                numero2 = leitor.next();
                System.out.println(adicao(Double.parseDouble(numero1), Double.parseDouble(numero2)));

                break;

            case 2:
                System.out.println("Você selecionou a subtração! \nInforme agora os números que deseja subtrair: ");
                numero1 = leitor.next();
                numero2 = leitor.next();
                System.out.println(subtracao(Double.parseDouble(numero1), Double.parseDouble(numero2)));
                break;

            case 3:
                System.out.println("Você selecionou a multiplicação! \nInforme agora os números que deseja multiplicar: ");
                numero1 = leitor.next();
                numero2 = leitor.next();
                System.out.println(multiplicacao(Double.parseDouble(numero1), Double.parseDouble(numero2)));
                break;

            case 4:
                System.out.println("Você selecionou a divisão! \nInforme agora os números que deseja dividir: ");
                numero1 = leitor.next();
                numero2 = leitor.next();
                System.out.println(divisao(Double.parseDouble(numero1), Double.parseDouble(numero2)));
                break;

            case 0:
                System.out.println("Saindo...");
                System.out.println("FIM DO PROGRAMA!");
                break;

            default:
                System.out.println("Opção inválida, selecione uma das opções oferecidas!");
                break;

        }

    }

}