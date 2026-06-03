import java.util.Scanner;

public class VerificadorPrimo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um número inteiro positivo: ");
        int numero = scanner.nextInt();
        
        if (ehPrimo(numero)) {
            System.out.println(numero + " é um número primo.");
        } else {
            System.out.println(numero + " não é um número primo.");
        }
        
        scanner.close();
    }

    // Método que executa a lógica de verificação
    public static boolean ehPrimo(int num) {
        if (num <= 1) {
            return false; // Números menores ou iguais a 1 não são primos
        }
        
        // Verifica divisores de 2 até a raiz quadrada do número (otimização matemática)
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false; // Se achar algum divisor, não é primo
            }
        }
        
        return true; // Se não achou nenhum divisor, é primo
    }
}