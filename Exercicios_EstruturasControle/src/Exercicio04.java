import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args){

        var scanner = new Scanner(System.in);
        System.out.println("Digite um número: ");
        var numeroInicial = scanner.nextInt();

        while(true){
            System.out.println("\nDigite um novo número: ");
            var numeros = scanner.nextInt();
            if(numeros<numeroInicial){
                System.out.printf("Número ignorado, informe um número maior que %s.", numeroInicial);
                continue;
            }

            var result = numeros % numeroInicial;
            System.out.printf("%s %% %s = %s", numeros, numeroInicial, result);
            if (result == 0){
                System.out.println("\nPerdão mas o resto da diferença é igual a zero.");
            }
            if (result != 0) break;
        }
        System.out.println("\nParabéns, seu número dividido pelo inicial tem resto diferente de zero.");
    }
}
