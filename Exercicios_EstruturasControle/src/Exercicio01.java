import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args){

        var scanner = new Scanner(System.in);
        System.out.println("Digite um número (de 1 a 9): ");
        var numero = scanner.nextInt();

        // Loop enquanto o usuário não colocar um número de 1 a 9
        while (numero < 1 || numero > 9) {
            System.out.println("Digite um número (de 1 a 9): ");
            numero = scanner.nextInt();  // Lê o número do usuário
            if (numero < 1 || numero > 9) {
                System.out.println("Número inválido! Por favor, digite um número entre 1 e 9.");
            }
        }

        for(int i = 0;i<=10;i++){
            var multiply = i*numero;
            System.out.printf("\n%s x %s = %s", i, numero, multiply);
        }
    }
}
