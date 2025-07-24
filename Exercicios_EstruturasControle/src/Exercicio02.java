import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args){

        var scanner = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        var name = scanner.next();
        System.out.println("Digite seu peso: ");
        var peso = scanner.nextInt();
        System.out.println("Digite sua altura (ex. 1,77): ");
        var Altura = scanner.nextFloat();

        var imc = peso/(Altura*Altura);

        if(imc<=18.5){
            System.out.printf("%s, seu IMC é de %.1f e você está Abaixo do peso.", name, imc);
        }else if(imc>=18.6 && imc<=24.9){
            System.out.printf("%s, seu IMC é de %.1f e você está com o Peso ideal.", name, imc);
        }else if(imc>=25 && imc<=29.9){
            System.out.printf("%s, seu IMC é de %.1f e você está Levemente acima do peso.", name, imc);
        }else if(imc>=30 && imc<=34.9){
            System.out.printf("%s, seu IMC é de %.1f e você está com Obesidade Grau I.", name, imc);
        }else if(imc>=35 && imc<=39.9){
            System.out.printf("%s, seu IMC é de %.1f e você está com Obesidade Grau II (Severa).", name, imc);
        }else{
            System.out.printf("%s, seu IMC é de %.1f e você está com Obesidade III (Mórbida).", name, imc);
        }
    }
}