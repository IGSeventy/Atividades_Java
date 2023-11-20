import java.util.Scanner;

public class ConversorTemperatura {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que insira a temperatura
        System.out.print("Digite a temperatura: ");
        double temperatura = scanner.nextDouble();

        // Solicita ao usuário que escolha a unidade de origem
        System.out.println("Escolha a unidade de origem:");
        System.out.println("1. Celsius");
        System.out.println("2. Fahrenheit");

        int escolhaUnidade = scanner.nextInt();

        // Converte a temperatura com base na escolha do usuário
        double resultado = 0;

        switch (escolhaUnidade) {
            case 1:
                resultado = celsiusParaFahrenheit(temperatura);
                break;
            case 2:
                resultado = fahrenheitParaCelsius(temperatura);
                break;
            default:
                System.out.println("Opção inválida!");
                return; // Encerra o programa se a escolha for inválida
        }

        // Exibe o resultado
        System.out.println("Resultado: " + resultado);
    }

    // Converte de Celsius para Fahrenheit
    private static double celsiusParaFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    // Converte de Fahrenheit para Celsius
    private static double fahrenheitParaCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
}
