import java.util.Scanner;
public class CalculadoraDeIMC {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite seu peso: ");
        double peso = input.nextDouble();
        System.out.print("Digite sua altura: ");
        double altura = input.nextDouble();

        double imc = calcularIMC(peso, altura);
        System.out.println("Seu IMC é: " + imc);
        input.close();
    }

    public static double calcularIMC(double peso, double altura) {
        double calculo = peso / (altura * altura);

        if (calculo < 18.5) {
            System.out.println("Abaixo do peso");
        } else if (calculo >= 18.5 && calculo <= 24.9) {
            System.out.println("Peso normal");
        } else if (calculo >= 25.0 && calculo <= 29.9) {
            System.out.println("Sobrepeso");
        } else {
            System.out.println("Obesidade");
        }
        return calculo;
    }
}