import java.util.Scanner;

public class CalculoIMC {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double peso;
        double altura;
        double imc;

        System.out.println("Digite seu peso (kg): ");
        peso = scanner.nextDouble();

        System.out.println("Digite sua altura (m): ");
        altura = scanner.nextDouble();

        imc = peso / (altura * altura);

        System.out.println("Seu IMC é: " + imc);

        scanner.close();
    }
}