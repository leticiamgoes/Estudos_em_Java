import java.util.Scanner;

public class SimuladorLancamentoProjeteis {

    public static void main(String[] args) {

        // Definir variáveis
        double velocidadeInicial, angulo, gravidade = 9.81, alturaInicial, tempo, altura, alcance;
        Scanner sc = new Scanner(System.in);

        // Pedir ao usuário para inserir a velocidade, o ângulo e a altura inicial
        System.out.print("Insira a velocidade inicial em m/s: ");
        velocidadeInicial = sc.nextDouble();
        System.out.print("Insira o ângulo de lançamento em graus: ");
        angulo = sc.nextDouble();
        System.out.print("Insira a altura inicial em metros: ");
        alturaInicial = sc.nextDouble();

        // Converter o ângulo para radianos
        angulo = Math.toRadians(angulo);

        // Calcular a velocidade inicial nas direções x e y
        double velocidadeInicialX = velocidadeInicial * Math.cos(angulo);
        double velocidadeInicialY = velocidadeInicial * Math.sin(angulo);

        // Pedir ao usuário para inserir o tempo
        System.out.print("Insira o tempo decorrido em segundos: ");
        tempo = sc.nextDouble();

        // Calcular a altura e o alcance
        altura = alturaInicial + velocidadeInicialY * tempo - (gravidade * Math.pow(tempo, 2)) / 2;
        alcance = velocidadeInicialX * tempo;

        // Exibir a altura e o alcance
        System.out.println("Altura: " + altura + " m");
        System.out.println("Alcance: " + alcance + " m");

        // Fechar o scanner
        sc.close();
    }
}
