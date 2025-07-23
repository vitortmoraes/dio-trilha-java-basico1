import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args){
        // Importando a classe Scanner
        var scanner = new Scanner(System.in);

        System.out.println("Digite o seu número de conta: ");
        var numero = scanner.nextInt();

        // Consumindo a quebra de linha deixada por nextInt()
        scanner.nextLine();  // Este comando consome a quebra de linha
        // Sem esse comando estava dando erro na hora de digitar o nome completo

        System.out.println("Digite o número da sua agência: ");
        var agencia = scanner.nextLine(); // Usando nextLine para ler o valor completo da agência

        System.out.println("Digite o seu nome: ");
        var name = scanner.nextLine();  // Agora captura o nome completo

        var saldo = 237.48;

        // Imprimindo a mensagem
        System.out.printf("Olá Sr. %s, obrigado por criar uma conta em nosso banco, " +
                        "sua agência é %s, conta %d e seu saldo R$ %.2f já está disponível para saque.\n",
                name, agencia, numero, saldo);

        // Na impressão da mensagem eu poderia usar o método concat do Java, através da expressão abaixo
        /*String resultado = "Olá Sr. ".concat(name).concat(", obrigado por criar uma conta em nosso banco, ")
                .concat("sua agência é ").concat(agencia).concat(", conta ").concat(String.valueOf(numero))
                .concat(" e seu saldo R$ ").concat(String.valueOf(saldo)).concat(" já está disponível para saque.");
        // Imprimindo o resultado
        System.out.println(resultado);*/
    }
}