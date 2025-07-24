import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) {

        var scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        var numero1 = scanner.nextInt();
        System.out.println("Digite o segundo número: ");
        var numero2 = scanner.nextInt();

        while (numero2 <= numero1) {
            System.out.println("Digite o segundo número: ");
            numero2 = scanner.nextInt();

            if (numero2 <= numero1) {
                System.out.println("Digite um número válido. \nO segundo número deve ser maior que o primeiro.");
            }
        }

        int option = 0;

        while (option != 1 && option != 2) {
            System.out.println("Digite 1 para PAR e 2 para ÍMPAR: ");
            option = scanner.nextInt();

            // Se a opção for inválida, imprime uma mensagem de erro
            if (option != 1 && option != 2) {
                System.out.println("Opção inválida! \nPor favor, escolha 1 para PAR ou 2 para ÍMPAR.");
            }
        }

        switch (option){
            case 1: //caso par
                System.out.printf("Os valores pares do intervalo de %s e %s são:\n", numero1, numero2);
                for (int i = numero1; i <= numero2; i++) {
                    if (i % 2 == 0) {
                        if(i == numero2 || (i == numero2 - 1)){
                            System.out.printf("%s.", i);
                        }else{
                            System.out.printf("%s - ", i);
                        }
                    }
                }
                break;
            case 2: //caso ímpar
                System.out.printf("Os valores ímpares do intervalo de %s e %s são:\n", numero1, numero2);
                for (int i = numero1; i <= numero2; i++) {
                    if (i % 2 != 0) {
                        if(i == numero2 || (i == numero2 - 1)){
                            System.out.printf("%s.", i);
                        }else{
                            System.out.printf("%s - ", i);
                        }
                    }
                }
                break;
            default:
                System.out.println("Digite uma opção válida.");
        }
    }
}
