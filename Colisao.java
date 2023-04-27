import java.util.Scanner;

public class Colisao {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double m1, v1, m2, v2;
        double vf1, vf2, vf;

        System.out.print("Digite a massa em kg do objeto 1: ");
        m1 = input.nextDouble();
        System.out.print("Digite a velocidade em m/s do objeto 1: ");
        v1 = input.nextDouble();
        System.out.print("Digite a massa em kg do objeto 2: ");
        m2 = input.nextDouble();
        System.out.print("Digite a velocidade m/s do objeto 2: ");
        v2 = input.nextDouble();

        // Cálculo das velocidades finais para colisão elástica
        vf1 = ((m1 - m2)/(m1 + m2))*v1 + ((2*m2)/(m1 + m2))*v2;
        vf2 = ((2*m1)/(m1 + m2))*v1 + ((m2 - m1)/(m1 + m2))*v2;

        // Cálculo da velocidade final para colisão inelástica
        vf = (m1*v1 + m2*v2)/(m1 + m2);

        // Saída de dados
        System.out.println("\nColisão elástica:");
        System.out.printf("Velocidade final do objeto 1: %.2f\n", vf1, "m/s");
        System.out.printf("Velocidade final do objeto 2: %.2f\n", vf2, "m/s");

        System.out.println("\nColisão inelástica:");
        System.out.printf("Velocidade final do sistema: %.2f\n", vf, "m/s");
    }
}
