import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int numero, soma = 0;
        String resposta;
        Scanner teclado = new Scanner(System.in);
        do{
            System.out.print("Digite um número: ");
            numero = teclado.nextInt();
            soma += numero;
            System.out.print("Quer continuar? [S/N]");
            resposta = teclado.next();
        } while (resposta.equals("S"));
        System.out.println(("A soma de todos os valores é " + soma));


    }

}