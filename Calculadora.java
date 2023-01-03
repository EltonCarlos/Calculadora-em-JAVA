import java.util.Scanner;

public class Calculadora {

    public static Double adicao(Double numero1, Double numero2) {
        Double resultado = numero1 + numero2;
        return resultado;
    }

    public static Double subtracao(Double numero1, Double numero2) {
        Double resultado = numero1 - numero2;
        return resultado;
    }

    public static Double multiplicacao(Double numero1, Double numero2) {
        Double resultado = numero1 * numero2;
        return resultado;
    }

    public static Double divisao(Double numero1, Double numero2) {
        Double resultado = numero1 / numero2;
        return resultado;
    }

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Seja bem vindo a Calculadora JAVA");
        System.out.println("Quais operações deseja resolver?\nSelecione uma opção abaixo");
        System.out.println("\n[1] Adição \n[2] Subtração \n[3] Multiplicação \n[4] Divisão ");
        int opcao = leitor.nextInt();
        Double numero1, numero2;
        switch (opcao) {
            case 1:
                System.out.println("Você selecionou a adição! \nInforme agora os números que deseja somar: ");
                numero1 = leitor.nextDouble();
                numero2 = leitor.nextDouble();
                adicao(numero1, numero2);
                break;

            case 2:
                System.out.println("Você selecionou a subtração! \nInforme agora os números que deseja subtrair: ");
                numero1 = leitor.nextDouble();
                numero2 = leitor.nextDouble();
                subtracao(numero1, numero2);
                break;

            case 3:
                System.out.println(
                        "Você selecionou a multiplicação! \nInforme agora os números que deseja multiplicar: ");
                numero1 = leitor.nextDouble();
                numero2 = leitor.nextDouble();
                multiplicacao(numero1, numero2);
                break;

            case 4:
                System.out.println("Você selecionou a divisão! \nInforme agora os números que deseja dividir: ");
                numero1 = leitor.nextDouble();
                numero2 = leitor.nextDouble();
                divisao(numero1, numero2);
                break;
        }

    }

}