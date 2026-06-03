import java.util.Scanner;

public class SistemaPrimos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n--- MENU DE NÚMEROS PRIMOS ---");
            System.out.println("1. Verificar se um número é primo");
            System.out.println("2. Listar primos até um limite");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite um número inteiro: ");
                    int numApenas = scanner.nextInt();
                    if (ehPrimo(numApenas)) {
                        System.out.println(numApenas + " é um número primo.");
                    } else {
                        System.out.println(numApenas + " não é um número primo.");
                    }
                    break;

                case 2:
                    System.out.print("Digite o valor limite positivo: ");
                    int limite = scanner.nextInt();
                    listarPrimosAte(limite);
                    break;

                case 3:
                    System.out.println("Encerrando o programa...");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while (opcao != 3);

        scanner.close();
    }

    // Método 1: Verifica se um único número é primo (Otimizado)
    public static boolean ehPrimo(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Método 2: Nova função adicionada para listar uma sequência de primos
    public static void listarPrimosAte(int limite) {
        if (limite < 2) {
            System.out.println("Não existem números primos no intervalo de 1 a " + limite);
            return;
        }
        
        System.out.print("Números primos entre 1 e " + limite + ": [ ");
        for (int i = 2; i <= limite; i++) {
            if (ehPrimo(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println("]");
    }
}