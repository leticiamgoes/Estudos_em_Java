import java.util.Scanner;

public class ConversorTemperatura {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double temperatura, temperaturaConvertida;
        int opcaoInicial, opcaoFinal;
        
        System.out.println("Conversor de Temperatura");
        System.out.println("------------------------");
        System.out.println("Selecione a unidade de temperatura inicial:");
        System.out.println("1. Celsius");
        System.out.println("2. Fahrenheit");
        System.out.println("3. Kelvin");
        System.out.print("Opção: ");
        opcaoInicial = input.nextInt();
        
        System.out.println("Selecione a unidade de temperatura final:");
        System.out.println("1. Celsius");
        System.out.println("2. Fahrenheit");
        System.out.println("3. Kelvin");
        System.out.print("Opção: ");
        opcaoFinal = input.nextInt();
        
        System.out.print("Entre com a temperatura em " + getNomeUnidade(opcaoInicial) + ": ");
        temperatura = input.nextDouble();
        
        // Converter para a unidade escolhida
        switch (opcaoInicial) {
            case 1: // Celsius
                switch (opcaoFinal) {
                    case 1: // Celsius
                        temperaturaConvertida = temperatura;
                        break;
                    case 2: // Fahrenheit
                        temperaturaConvertida = (temperatura * 9/5) + 32;
                        break;
                    case 3: // Kelvin
                        temperaturaConvertida = temperatura + 273.15;
                        break;
                    default:
                        System.out.println("Opção final inválida.");
                        return;
                }
                break;
            case 2: // Fahrenheit
                switch (opcaoFinal) {
                    case 1: // Celsius
                        temperaturaConvertida = (temperatura - 32) * 5/9;
                        break;
                    case 2: // Fahrenheit
                        temperaturaConvertida = temperatura;
                        break;
                    case 3: // Kelvin
                        temperaturaConvertida = (temperatura + 459.67) * 5/9;
                        break;
                    default:
                        System.out.println("Opção final inválida.");
                        return;
                }
                break;
            case 3: // Kelvin
                switch (opcaoFinal) {
                    case 1: // Celsius
                        temperaturaConvertida = temperatura - 273.15;
                        break;
                    case 2: // Fahrenheit
                        temperaturaConvertida = (temperatura * 9/5) - 459.67;
                        break;
                    case 3: // Kelvin
                        temperaturaConvertida = temperatura;
                        break;
                    default:
                        System.out.println("Opção final inválida.");
                        return;
                }
                break;
            default:
                System.out.println("Opção inicial inválida.");
                return;
        }
        
        System.out.println(temperatura + " " + getNomeUnidade(opcaoInicial) + " é equivalente a " + temperaturaConvertida + " " + getNomeUnidade(opcaoFinal));
        
        input.close(); // Fechar o objeto Scanner
        
    }
    
    public static String getNomeUnidade(int opcao) {
        switch (opcao) {
            case 1:
                return "graus Celsius";
            case 2:
                return "graus Fahrenheit";
            case 3:
                return "graus Kelvin";
            default:
                return "Unidade inválida";
        }
    }
}           

